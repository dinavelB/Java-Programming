import java.util.Scanner;

public class studentGradeCalculator {

    public static int setScores(int scoreOne, int scoreTwo, int scoreThree) {

        int addScores = scoreOne + scoreTwo + scoreThree;
        int average = addScores / 3;

        int total = average;

        return total;
    }

    public static void ranks(int total) {
        int a = 90;
        int b = 80;
        int c = 70;

        if (total >= a) {
            System.out.println("A");
        } else if (total >= b) {
            System.out.println("B");
        } else if (total >= c) {
            System.out.println("C");
        } else{
            System.out.println("D");
        }

    }

    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter your score 1:");
        int scoreOne = userInput.nextInt();
        System.out.println("Enter your score 2:");
        int scoreTwo = userInput.nextInt();
        System.out.println("Enter your score 3:");
        int scoreThree = userInput.nextInt();

        System.out.println("Youre grade is: ");
        ranks(setScores(scoreOne, scoreTwo, scoreThree));
    }
}

