//public class UdemyJava {
//    public static void main(String [] args){
//        System.out.println("Hello World");
//    };
//}
//this is a complete java program//

//VARIABLES

public class UdemyJava {
    public static void main(String[] args) {
        int myNumber = 13;

        String text = "Hello";
        System.out.println(text);

        String blank = " ";

        String name = "mermaid";

        String greeting = text + blank + name;
        System.out.println(greeting);

//        string is a class it is just a type of object that can hold text
//        text is a variable and it is capable of referring to a thing as a type thing
//        "Hello" is a text object

//        while loop
        int value = 0;

        while (value < 10) {
            System.out.println("Hello");

            value = value + 1;
        }
        ;

        for(int i = 0; i < 5; i ++){
//            the semi colons are separating 3 sections. the first one is code that executes before the loop starts. the middle is a condition. as long as it is true the loop will execute. the last is the code that will execute once after every iteration of the loop
            System.out.println("hello");
        }
    }

}