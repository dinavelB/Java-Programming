public class bankAccount {
    private String accountHolder; //declared globally so its value changes.
    public double balance;//same as here

    //.constructor
    public bankAccount(String name){
        accountHolder = name;
        balance = 0.0;
    }

    public void depositMoney (double money){
        if (money > 0){
            balance += money;
            System.out.println("Account deposit sucessfully");
        } else{
            System.out.println("Failed to deposit must be greater than 1.");
        }
    }

    public void withdrawMoney(double money){
        if(money <= balance){
            balance -= money;
            System.out.println("Withdrawed successfully");
        }else {
            System.out.println("Failed");
        }
    }

    public double getBalance (){
        return  balance;
    }

    public void displayAccount(){
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Current balance: $" + balance);
    }

}
