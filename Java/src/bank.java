import java.util.Scanner;

public class bank {
    public static  void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name =  sc.nextLine();

        bankAccount myAccount = new bankAccount(name);

        while (true){
            System.out.println("Choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Info");
            System.out.println("5. Exit:");

            int response = sc.nextInt();
            if(response ==  1){
                System.out.println("Enter your deposit");
                double money = sc.nextDouble();
                myAccount.depositMoney(money);
            } else if (response == 2){
                System.out.println("Withdraw a amount:");
                    double money = sc.nextDouble();
                    myAccount.withdrawMoney(money);

            }else if (response == 3){
                System.out.println("Your balance is: " + myAccount.getBalance());
            }else if (response == 4){
                System.out.println("Your Account Info: ");
                    myAccount.displayAccount();

            } else if(response == 5){
                System.out.println("Exiting...");
            }

        }
    }
}
