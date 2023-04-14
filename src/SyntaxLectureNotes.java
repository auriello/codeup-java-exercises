public class SyntaxLectureNotes {
    public static void main(String[] args) {
//        all of your code snippet has to be in the curly braces
        System.out.println("every statement must end with a semicolon");
//        to store something give it a name and a valid value
//        a byte can only store numbers -128 - 127. let, var, and consts are replaced with the type of data type the variable is stored. you cant store a string with a value of 5. THE VALUE HAS TO MATCH WHAT THE DATA TYPE IS

//        PRIMITIVE DATA TYPES - 8
//        byte,short,int,long only store WHOLE numbers.
        byte myByte = 54;
        short myShort = 12003;
        int myInt = 12003000;
        long myLong = 3L;

//        float and double can store decimal numbers AND whole numbers
        float myFloat = 12.03f;
        double myDouble= 6.78;
//        char will store individual character in a single quote
        char myChar = 'a';
//        boolean stores true and false values
        boolean myBoolean = true;


//        /(backslash) is an escape character for your strings
        String myString = "this is my string. my string must be in double quotes";
//        example of invalid string format:
//        String myString = 'my single quote string'
        System.out.println(myString);
//        constants are stored by using the word final
        final String name = "Auriel";

        System.out.println(1 + 2);
        System.out.println(1 - 2);
        System.out.println(1 * 2);
        System.out.println(1 / 2);
        System.out.println(1 % 2);
//        unary operators expect a variable not a hard coded number
        int num = 5;
        System.out.println(num ++);
        System.out.println(++ num);
        System.out.println(num --);
        System.out.println(-num);

//        casting I have this integer that can also fit in a long
        int myInteger = 900;
        long morePrecise = myInteger;



//        this code below will not work !
        int bigBaby = 1000;
//        byte smallCrate = bigBaby;
//        we get an error because you cannot store a type inside of a container that is smaller than itself;

    double pi = 3.14159;
//    I only put (int) in order to ensure that my double essentially mutates into an integer
    int almostPi =(int)pi;
    }
}
