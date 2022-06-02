package ArrayListPracticing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayListPractice {
    public static void main(String[] args) {
        int userInput;
        int listSize;
        Scanner kb = new Scanner(System.in);
        ArrayList <Integer> grades = new ArrayList<>();
        System.out.println("Enter grades below. Use  -1 to end input.");

////////   Adding to ArrayList   ///////////////////
        boolean done = false;
        while(!done){
            listSize= grades.size();
            userInput = kb.nextInt();
            grades.add(userInput);
            if(userInput==-1){
                grades.remove(listSize);
                done = true;
            }

        }
/////////////////////////////////////////////////////

////////   Calculating Average   ///////////////////
/*
   Integer grade =  the current int at the current index
   grades = the ArrayList we're accessing
 */
        int addNumbers = 0;
        int average =0;

        for (Integer grade : grades) {
            addNumbers += grade;
        }
        average = grades.size();
        System.out.println("The average of the grades were: " + (addNumbers/average));

/////////////////////////////////////////////////////

////////  Finding Min and Max   ////////////////////
        Collections.sort(grades);
        System.out.println("The lowest grade was: "+ grades.get(0));
        System.out.println("The highest grade was: "+ grades.get(grades.size()-1));




    }
}
