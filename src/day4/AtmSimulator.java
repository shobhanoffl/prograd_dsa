/*
Write a Java program that simulates an ATM machine. The program should handle the following exceptions:
InsufficientFundsException: Thrown when a user tries to withdraw an amount greater than their account balance.
InvalidAmountException: Thrown when a user tries to withdraw a negative or zero amount.
The program should have the following functionalities:
Initialise the account balance with a default value.
Provide options for the user to deposit or withdraw funds.
Handle exceptions appropriately and display meaningful error messages to the user.
 */
package day4;

import java.util.Scanner;

class Account{
    float bal = 50000;

    public float showBalance(){
        return bal;
    }

    public boolean deposit(float amt) throws InvalidDepositException{
        if(amt>0){
            bal+=amt;
            return true;
        }else{
            throw new InvalidDepositException("Enter a Valid Amount");
        }
    }

    public void withdraw(float amt) throws InvalidAmountException,InsufficientFundsException{
        if(amt>bal){
            throw new InsufficientFundsException("Balance is Insufficient");
        }else if(amt<=0){
            throw new InvalidAmountException("Enter a Valid Amount to Withdraw");
        }
    }
}

public class AtmSimulator {
    public static void main(String[] args) throws InvalidDepositException, InvalidAmountException, InsufficientFundsException {
        boolean isExit = false;
        while(!isExit){
            System.out.println("Enter 1 to Deposit and 2 to Withdraw and 3 to Exit");
            Scanner sc = new Scanner(System.in);
            int option=sc.nextInt();
            Account newUser = new Account();
            if(option==1){
                System.out.println("Enter the Amount to Deposit");
                float deposit = sc.nextFloat();
                if(newUser.deposit(deposit)){
                    System.out.println("Amount Deposited");
                };
                System.out.println(newUser.showBalance());
            } else if (option==2) {
                System.out.println("Enter the Amount to Withdraw");
                float withdraw = sc.nextFloat();
                newUser.withdraw(withdraw);
                System.out.println(newUser.showBalance());
            } else {
                System.out.println("Thank You");
                isExit=true;
            }
        }
    }
}

class InvalidDepositException extends Exception{
    public InvalidDepositException(String msg){
        super(msg);
    }
}

class InvalidAmountException extends Exception{
    public InvalidAmountException(String msg){
        super(msg);
    }
}

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String msg){
        super(msg);
    }
}