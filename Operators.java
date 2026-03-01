public class Operators {
    public static void main(String args[]){
        //symbols used to perform operations on variables and values.//
        // 1.  // Arithmetic operators are used to perform basic mathematical operations like addition, subtraction, multiplication, division, and modulus.//
        System.out.println("Arithmetic Operators in Java");
        int a=5;
        int b=10;
        System.out.println("The valus of a+b is:"+a+b);
        System.out.println("The valus of a-b is:"+ (a-b)); 
        System.out.println("The valus of a*b is:"+a*b);
        System.out.println("The valus of a/b is:"+a/b);
        System.out.println("The valus of a%b is:"+a%b);
        System.out.println("-------------------------------------------");
        //  Increment (++) and Decrement (--) are considered part of Arithmetic Operators in Java.//
        System.out.println("Increment and Decrement Operators in Java");
        int c = 5;
        // Increment operator (++) increases the value of a variable by 1.//
        c++;
        System.out.println("The value of c after increment is :"+c);
        c--;
        // Decrement operator (--) decreases the value of a variable by 1.//
        System.out.println("The value of c after decrement is :"+c);
        // Pre increment (++a) increases the value first, then uses the updated value.//
        int d =3;
        ++d;
        System.out.println("The value of d after pre increment is :"+d);
        d++;
        // Post increment (a++) uses the current value first, then increases it.//
        System.out.println("The value of d after post increment is :"+d);
        int e=90;
        System.out.println("The value of e after pre decrement is :"+ ++e);
        System.out.println("The value of e after post decrement is :"+ e++);
        System.out.println("The value of e after post decrement is :"+ e);

        //// Pre decrement (--a) decreases the value first, then uses the updated value//
        int f=1000;
        --f;
        System.out.println("The value of f after pre decrement is :"+f);
        f--;
        // Post decrement (a--) uses the current value first, then decreases it.//
        System.out.println("The value of f after post decrement is :"+f);

        System.out.println("-------------------------------------------");
        System.out.println("Relational Operators in Java");
        // 2. Relational operators are used to compare two values and return a boolean result (true or false).//
        //Opertator              Meaning
        //==                     Equal to
        //!=                     Not equal to       
        //>                      Greater than
        //<                      Less than  
        //>=                     Greater than or equal to
        //<=                     Less than or equal to

        int x = 90;
        int y = 100;
        System.out.println("The value of x==y is :"+(x==y));
        System.out.println("The value of x!=y is :"+(x!=y));
        System.out.println("The value of x>y is :"+(x>y));     
        System.out.println("The value of x<y is :"+(x<y));
        System.out.println("The value of x>=y is :"+(x>=y));
        System.out.println("The value of x<=y is :"+(x<=y));
        System.out.println("-------------------------------------------"); 

        // Logical operators are used to combine multiple conditions and return true or false.
        System.out.println("Logical Operators in Java");
        //Operator              Meaning
        //&&                    Logical AND
        //||                    Logical OR
        //!                     Logical NOT
        int age =10;
        System.out.println("The value of age>18 && age<60 is :"+(age>18 && age<60));
        System.out.println("The value of age==10 && age<60 is :"+(age==10 && age<60));
        System.out.println("The value of age>18 || age<60 is :"+(age>18 || age<60));
        System.out.println("The value of age>18 || age>60 is :"+(age>18 || age>60));
        System.out.println("The value of !(age>18) is :"+!(age>18));
        System.out.println("The value of !(age<18) is :"+!(age<18));
        System.out.println("-------------------------------------------");

        //3.// Assignment operators assign and update variable values.//
        System.out.println("Assignment Operators in Java");
        //Operator              Meaning
        //=                     Simple assignment   
        //+=                    Add and assign
        //-=                    Subtract and assign
        //* =                   Multiply and assign
        ///=                    Divide and assign
        int num1 = 10;
        System.out.println("The value of num1 is :"+num1);
        num1 += 5; // num1 = num1 + 5
        System.out.println("The value of num1 after += 5 is :"+num1);
        num1 -= 3; // num1 = num1 - 3
        System.out.println("The value of num1 after -= 3 is :"+num1);
        num1 *= 2; // num1 = num1 * 2
        System.out.println("The value of num1 after *= 2 is :"+num1);
        num1 /= 4; // num1 = num1 / 4
        System.out.println("The value of num1 after /= 4 is :"+num1);
        num1 %= 3; // num1 = num1 % 3
        System.out.println("The value of num1 after %= 3 is :"+num1);
        System.out.println("-------------------------------------------");

        System.out.println("Bitwise Operators in Java");
        // Bitwise operators work on bits and perform bit-by-bit operations.
        //Operator              Meaning
        //&                     Bitwise AND
        //|                     Bitwise OR
        //^                     Bitwise XOR
        //~                     Bitwise NOT (complement)
        //left shift (<<)      Shift bits to the left
        //right shift (>>)     Shift bits to the right
        int a4 = 10; // Binary: 1010
        int b4 = 4;  // Binary: 0100
        System.out.println("The value of a4 & b4 is :"+(a4&b4)); // Output: 0 (Binary: 0000)
        System.out.println("The value of a4 | b4 is :"+(a4|b4)); // Output: 14 (Binary: 1110)
        System.out.println("The value of a4 ^ b4 is :"+(a4^b4)); // Output: 14 (Binary: 1110)
        System.out.println("The value of ~a4 is :"+(~a4));   // Output: -11 (Binary: ...11110101)
        int h = a4<<2;
        System.out.println("The value of a4<<2 is :"+h); 
        int I = a4>>2;//2^n  so 2^2 =4 10/4 = 2 //
        System.out.println("The value of a4>>2 is :"+I);  // Output: 2 (Binary: 0010)
        System.out.println("-------------------------------------------");

        //Ternary operator = short form of if–else//
        System.out.println("Ternary Operator in Java");
        
        //Syntax: condition ? expression1 : expression2
        int num =18;
        String answer = (num==18) ? "equal" : "not equal";
        System.out.println("The number is :"+answer);
        System.out.println("-------------------------------------------");

        //Question:Odd or even number//

        int number = 67;
        String answer1 = (number%2==0) ? "Even" : "Odd";
        System.out.println("The number is :"+answer1); 
        System.out.println("-------------------------------------------");

        //Greater number between two numbers//
        int number_1 = 34;
        int number_2 = 53;
        String answer2 = (number_1>number_2) ? "Number 1 is greater" : "Number 2 is greater" ;   
        System.out.println(answer2);
        System.out.println("-------------------------------");




    }
}