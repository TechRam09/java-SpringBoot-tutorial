public class WrapperClass {
    public static void main(String[] args) {
//        WrapperClass are the non-primitive types of primitive datatypes like int,float,double
        int num = 9;
        //older way Integer num1 = new Integer(9) ->  called  which is deprecated version
//        Integer num1 = 9;
        //Taking a primitive value and storing it in Wrapper object/Class  is call boxing -> Integer num1 = new Integer(9)
        Integer num1 = num; // this is called auto-boxing: num is converted to object automatically
        System.out.println(num1); //9
        // To assign the Wrapper class value again to the primitive datatype reference is called unboxing int num2 = num1.intValue()
        int num2 = num1;// this is called auto-unboxing: num1 is converted to primitive automatically
        System.out.println(num2); //9

        // when we have a string, and we have to perform certain arithmetic operation on it, we can do it by converting it to int
        //using Integer.parseInt(string);
        String str = "12";
        int number = Integer.parseInt(str);
        System.out.println(number*2);//24

    }
}
