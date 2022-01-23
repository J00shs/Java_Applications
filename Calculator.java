
//////////////////////////////////////////////////////
////A simple calculator that runs via the terminal////
//////////////////////////////////////////////////////



import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int ans;
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to the Calculator System.");
        System.out.println("To begin, please enter the first integer");
        int number1 = kb.nextInt();
        System.out.printf("The number you entered was: %d.", number1);
        System.out.println("Now enter the next number.");
        int number2 = kb.nextInt();
        System.out.printf("The number you entered was: %d", number2);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Division");
        System.out.println("4-Multiplication");

        int userChoice = kb.nextInt();
        String test = System.out.printf("%d + %d = %d", number1, number2, ans);
        if(userChoice == 1){
            ans = number1 + number2;
            System.out.printf("%d + %d = %d", number1, number2, ans);
        }else if(userChoice == 2){
            ans =  number1 - number2;
            System.out.printf("%d + %d = %d", number1, number2, ans);
        }else if(userChoice == 3){
            ans = number1 / number2;
            System.out.printf("%d / %d = %d", number1, number2, ans);
        }else if(userChoice ==4){
            ans = number1 * number2;
            System.out.printf("%d * %d = %d",number1, number2, ans);
        }else if(userChoice>=5){
            System.out.println("Out of Bounds. Please enter a number from 1-4");
        }

  

        
    
    
    
    } 
        
}
