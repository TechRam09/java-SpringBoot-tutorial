// It is a combination of abstract and anonymous Inner class
// rather than creating new to give the implementation of abstract class one time run method
// we can use AnonymousInner class to define its implementation

abstract class A{
    public abstract void show();
    public  abstract  void config();
}


/*
instead of
class B extends A{
    @Override
    public void show(){

    }
}
// we can use anonymous Inner class
but if we create anonymous inner class for abstract class it is mandatory to define all the abstract methods similar to
abstract class
 */

public class AbstractAnonymousInnerClass {
    public static void main(String[] args) {
        // we know that we cant create object of abstract class we can create of anonymous class
        // A obj =new A() -> is not possible because A is abstract class but
        A obj = new A(){
            @Override
            public void show(){
                System.out.println("in new show");
            }
            @Override
            public void config(){
                System.out.println("in new config");
            }
        };

        obj.show();
        obj.config();

    }
}
