/*
Annotation are supplement to compiler or runtime, or it is a metadata
it doesn't change way how code works
there are different types of annotation
1) class
2) methods
3) variables
 */


class  Man{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in Man Show");
    }
}

class SuperMan extends Man{
    @Override // these are method Annotation to tell the compiler the method is overridden
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("in Superman Show");
    }
}

public class Annotations {
    public static void main(String[] args) {

    }
}
