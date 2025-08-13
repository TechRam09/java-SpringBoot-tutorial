/*
Anonymous inner class:	No name, used for quick one-time use (usually for interfaces or abstract classes)
An anonymous inner class is a class without a name, defined and instantiated in one line. It’s usually used to create a
quick, one-time-use implementation of an interface or abstract class—especially useful when:
1) You don’t want to write a separate named class
2) The implementation is short
3) It’s used only once (like for event handling)
 */

//Let’s say we have a normal class named Greeting:
class Greeting {
    void sayHello() {
        System.out.println("Hello from Greeting class");
    }
}
/*
if we want provide new implementation or want to override sayHello() method only once
instead of creating a new subclass like CustomGreeting

class CustomGreeting extends Greeting {
    void sayHello() {
        System.out.println("Hello from CustomGreeting");
    }
}

we can use an anonymous inner class like this:
 */

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Greeting obj = new Greeting(){
            @Override
            public void sayHello(){
                System.out.println("Hello from Anonymous Inner Class");
            }
        };

    }
}
