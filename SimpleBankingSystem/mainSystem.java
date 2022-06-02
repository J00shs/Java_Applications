package SimpleBankingSystem;



////////////////////////////////////////
///////Banking System via terminal//////
////////////////////////////////////////

import java.util.Scanner;


public class mainSystem {

    public static int depositSystem(){
        System.out.println();
        System.out.println();
        System.out.println("Deposit System");
        System.out.println("Input deposit amount below");

        //User inputs cash amount
        int inputError = 0;
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        System.out.println("You've entered $" + input );
        if(input >0) {
            return input;
        }else {
            return inputError;
        }
    }

    public static int withdrawalSystem(int userDeposit) {
        System.out.println();
        System.out.println();
        System.out.println("Withdrawal System");
        System.out.println("You currently have $" + userDeposit + ".How much would you like to withdrawal?");
        Scanner kb = new Scanner(System.in);
        int withdrawalAmt = kb.nextInt();
        int difference = 0;
        if (withdrawalAmt <= userDeposit) {
            difference = userDeposit - withdrawalAmt;
        }
        System.out.println("Your account balance is $"+ difference);
        return difference;

    }


    public static void main(String[] args) {



        System.out.println("Welcome to the Bank System.");
        System.out.println("Please choose one of the options below.");
        System.out.println("0-Exit System\n1-Deposit\n2-Withdrawal");
        Scanner kb = new Scanner(System.in);
        int choice =  kb.nextInt();
        while(choice != 0) {
            int deposit = 0;
            if (choice == 1) {
                deposit = depositSystem();
                System.out.println("What would you like to do next?");
                System.out.println("0-Exit System\n1-Deposit\n2-Withdrawal");
                choice = kb.nextInt();

            }
            if (choice == 2) {
                System.out.println(withdrawalSystem(deposit));
                System.out.println("What would you like to do next");
                System.out.println("0-Exit System\n1-Deposit\n2-Withdrawal");
                choice = kb.nextInt();
            }
        }


    }
}

