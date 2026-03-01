public class Variable {
    public static void main(String[] args){
        // Variable is used to store data in the program
        System.out.println("Variables in Java");
        int number = 5;
        // int data types can store only the integer values
        System.out.println("The value of the number is :"+number);

        String name = "Harry Potter";
        // String data type can store the sequence of characters
        System.out.println("The name is :"+name);

        double price = 9.34;
        // double data type can store the decimal values
        System.out.println("The price is :"+price);

        long pageNumber = 1234567890L;
        // long data type can store the large integer values
        System.out.println("The page number is :"+pageNumber);

        System.out.println("-------------------------------------------");


        System.out.println("Primitive data types in Java");
        //Primitives data types in Java//
        //1.Btye -> 1 byte Store whole numbers from -128 to 127//
        byte thebyte = -10;
        System.out.println("The byte value is :"+thebyte);

        //2.Short -> 2 bytes Store whole numbers from -32,768 to 32,767//
        short theshort = 31000;
        System.out.println("The short value is :"+theshort);

        //3.int -> 4 bytes store whole number from -2,147,483,648 to 2,147,483,647//
        int num = 678900;
        System.out.println("The int value is :"+num);

        //4. long -> 8 bytes store whole number from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807//
        long num1 = 123467909853l;
        System.out.println("The long value is :"+num1);

        //5.float -> 4 bytes store fractional numbers . Sufficient for storing 6 to 7 decimal digites//
        float pie = 3.14f;
        System.out.println("The float value is :"+pie);

        //6.double -> 8 bytes store fractional numbers. Sufficient for storing 15 decimal digits//   
        double num2 = 3.3454656786;
        System.out.println("The double value is :"+num2);


        //7.boolean -> 1 bit store only two possible values : true or false//
        boolean result = true;
        System.out.println("The boolean value is :"+result);

        //8.char ->2 bytes it store a single letter or single character . in single quotes//
        char grade = 'A';
        System.out.println("The char value is :"+grade); 

        System.out.println("-------------------------------------------");
        System.out.println("Non-primitive data types in Java");
        //non-primitive data types in Java//
        //1.String -> it store a sequence of characters. //
        String   MovieName = new String("Harry potter");
        System.out.println("Name is:"+MovieName);
        System.out.println("---------------------------------------------");
        // Swap two numbers //
        System.out.println("Swapping two numbers");
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        // Swapping using a temporary variable
        int temp = a;       
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
        System.out.println("---------------------------------------------");

        
        System.out.println("Simple calculator");
        int a1 =15;
        int b1 =20;
        // Addition
        System.out.println("Addition: " + (a1 + b1));
        // Subtraction  
        System.out.println("Subtraction: " + (a1 - b1));
        // Multiplication
        System.out.println("Multiplication: " + (a1 * b1));
        // Division
        System.out.println("Division: " + (a1 / b1));
        System.out.println("---------------------------------------------");

        System.out.println("Type casting");
        //// Type casting means converting one data type into another data type.////
        byte a2 =8;
        int n3;
        n3=a2;
        System.out.println("The value of n3 is :"+n3);
        // Automatic type casting happens when small data type is stored in big data type.//

        // Explicit type casting means manually converting big data type into small data type.//
        int n4 = 100;
        byte n5 = (byte) n4;
        System.out.println("The value of n5 is :"+n5);

        System.out.println("---------------------------------------------");
               
   }
}