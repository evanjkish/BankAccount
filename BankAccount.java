import java.util.*;

public class BankAccount {
    private double checkingBal;
    private double savingsBal;
    private static int numOfAccounts = 0;
    private static double totalBal = 0.0;

    public BankAccount() {
        this.checkingBal = 0.0;
        this.savingsBal = 0.0;
        numOfAccounts ++;
    }

    //getters
    public double getCheckingBal() {
        return this.checkingBal;
    }
    public double getSavingsBal() {
        return this.savingsBal;
    }
    public static double getTotalBal() {
        return totalBal;
    }

    //methods
    public void deposit(double amount, String account){
        if (account == "checking"){
            this.checkingBal += amount;
            totalBal += amount;
        } else if (account == "savings"){
                this.savingsBal += amount;
                totalBal += amount;
        } else {
            System.out.println("please specify an account");
        }
    }

    public void withdraw(double amount, String account){
        if (account == "checking" && this.checkingBal >= amount){
            this.checkingBal -= amount;
            totalBal -= amount;
        } else if (account == "savings" && this.savingsBal >= amount){
                this.savingsBal -= amount;
                totalBal -= amount;
        } else {
            System.out.println("please specify an account with the minimum balance");
        }
    }
}