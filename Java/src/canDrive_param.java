import java.util.Scanner;

public class canDrive_param {

    static int isCanDrive (int age){
        if (age > 18){
            System.out.println("hey you can drive now");
        } else {
            System.out.println("wait till youre in the legal age :) ");
        }
        return age;
    }

    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your age so we can know if youre legal enough to drive");
        int userAge = userInput.nextInt();

        isCanDrive(userAge);
    }

}
