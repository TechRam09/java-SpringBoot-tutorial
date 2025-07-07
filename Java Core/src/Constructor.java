/* assign the value to the instance variance moment the object is created

class Human{
  int age ;
  String name;

  public Human(){
      System.out.println("Constructor created");
      this.age = 12;
        this.name = "Shree";
  }

 Human(String name,int age){
      this.name = name;
      this.age =age;
  }

}


public class Constructor {
    public static void main(String[] args) {
        Human obj  = new Human();
        System.out.println(obj.name + " : " + obj.age);
    }

}
*/
