package phase1_core_java;

public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;
    private String accountType;

    public BankAccount(String accountNumber, String holderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public BankAccount(String accountNumber, String holderName) {
        this(accountNumber, holderName, 0.0, "Saving");
    }

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Error !! Amount must be positive, please check your amount");
            return;
        }else {
            balance += amount;
            System.out.println(amount + " added successfully in your account.\n New Balance :" +balance);
        }
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Error !! Amount must be positive, please check your amount");
            return;
        }else if(amount > balance){
            System.out.println("Insufficient balance...");
            return;
        }else {
            balance -= amount;
            System.out.println(amount + " debited from your account. \n New balance: "+ balance);
        }
    }

    public void displayAccountDetails(){
        System.out.println("------- ACCOUNT DETAILS --------");
        System.out.println("Account Number : "+ accountNumber + "\nHolder Name : "+ holderName + "" +
                "\n Balance : " +balance+"\n Account Type : "+ accountType);
        System.out.println("Balance : "+ balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("1", "Swati", 45000, "Salary");
        BankAccount acc2 = new BankAccount("2","Dami");

        acc1.deposit(15000);
        acc2.deposit(10000);

        acc1.withdraw(5000);
        acc2.withdraw(15000);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

    }
}

