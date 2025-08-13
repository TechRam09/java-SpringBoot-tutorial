
/*
Why Inner class
If a class is useful only to one outer class, it makes sense to keep it nested inside that class.
Inner classes help hide the implementation details from the outside world. If you don’t want a class to be visible outside, define it inside.
An inner class can access private members of the outer class directly, without using getters/setters.
Placing a small, closely related class inside another keeps your code organized and easier to read.
In GUI development (e.g., Swing), anonymous inner classes are often used for event listeners:
 We can t make outer class static, but we can make inner class static and can access with creating outer class object
 we cant access non-static variables inside a static class
 */


class Outer {
    private int outerValue = 10;
    public void show(){
        System.out.println("in show");
    }

     class Inner {
        public void display() {
            System.out.println("Outer value: " + outerValue); // ✅ Access private member
        }
    }

//    static class Inner {
//        public void config() {
//            System.out.println("in config ");
//        }
//    }

}

public class InnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();

        //To call Inner class Method we cant
//        Inner obj1 = new Inner();
        // first we nee create object of Outer then access inner class through its reference
        Outer.Inner obj1 = obj.new Inner();
        obj1.display();

//        //if Inner class is static
//        Outer.Inner obj2 = new Outer.Inner();
//        obj2.config();
    }
}
