import java.util.*;

public class TestBankAccount {
    public static void main(String[] args){

        BankAccount ally = new BankAccount();

        ally.deposit(100.0, "checking");
        System.out.println(ally.getCheckingBal());

        ally.withdraw(255.0, "checking");

        System.out.println(ally.getTotalBal());


    }
}