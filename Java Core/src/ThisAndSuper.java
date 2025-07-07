/*
By default every constructor has super method which calls the super class default constructor, if we pass any value
to it, it calls the parameterised constructor.
class which does extend any class extends to Object class by default.
this(); method executes the constructor of same class
 */
class A{
    public A(){
//        super();
        System.out.println("in A");
    }

    public A(int n){
//        super();
        System.out.println("in A int");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }

    public  B(int n){
        this();
//        super(n);
        System.out.println("in B int");
    }
}



public class ThisAndSuper {
    public static void main(String[] args) {
/*
        B obj = new B(); // in A  in B
        B obj = new B(5); // in A  in B int

        B obj = new B(5); // in A int  in B int
         B obj = new B(); // Pass the integer value to super class it will call the parameterized constructor of super function
         output -> in A int in B

 */
        B obj = new B(5); // in A  in B  in B int

    }
}

