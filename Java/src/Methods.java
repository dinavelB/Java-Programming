import java.util.Scanner;

public class Methods {

    //the word static means belongs to the class
    //and doesnt need to create an object
    static String HelloWorld(){
        String hello = "Hello World";

        return hello;
    }

    static void FullName(String name, int age, String hobby){
        System.out.printf("Hi %s, you're %d? and your hobby is %s? wow..thats good", name, age, hobby);
        //s for string
        //d for decimals. this version is like literals in js
    }

    public static void main(String[] args){
        System.out.println(HelloWorld());

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = userInput.nextLine();

        System.out.println("Enter your age:");
        int age = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Enter your hobby:");
        String hobby = userInput.nextLine();


        userInput.close();
        FullName(name, age, hobby);
    }
}
