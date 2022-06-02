package fileReadingandOutputting;

/*
asks the user for a file name
tests whether the file exists and tells the user
 if it does exist asks the user whether it should be deleted.
 Either delete or do not delete the file based on the user input.
If they dont delete, ask them if they would like to write to the file
If they want to write, ask what they want to write to the file and write it.
Make sure to provide plenty of console output dialog specifying what status/actions are taken at each step.
 */



import java.io.File;
import java.io.FileOutputStream;

import java.io.PrintWriter;
import java.util.Scanner;




public class fileIOdemo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int userSelection;
        boolean fileExists;
        System.out.println("Hello. Please enter the name of the file you would like to access below. Write out file name as shown.");
        String fileName = kb.next();
        System.out.println("File name acquired: " + fileName);



        File file = new File(fileName);
        fileExists = file.exists();
        if (!fileExists) {
            System.out.println("File: " + fileName + " does not exist.");
            System.exit(0);
        }


///////////////////////////////////////Deleting the File/////////////////////////////////////////////////////////////////
        System.out.println();
        System.out.println(fileName + " sucessfully opened. Delete File?");
        System.out.println("1:Yes");
        System.out.println("2:No, proceed with file");
        userSelection = kb.nextInt();


        if (userSelection == 1) {
            System.out.println("Attempting to remove file.");
            boolean deleteFile = file.delete();
            if (!deleteFile) {
                System.out.println("Something went wrong. Please try again.");

            } else {
                System.out.println("File successfully deleted");

            }
            System.out.println("Program Ending.");
            System.exit(0);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////Writing To the File///////////////////////////////////////////////////////////////
        }if(userSelection == 2){
            System.out.println("Write to the file?");
            System.out.println("1-Yes");
            System.out.println("2-No");
            userSelection = kb.nextInt();
            kb.nextLine();
///////////////////////////////////////User does not want to write to file///////////////////////////////////////////////
            if(userSelection == 2){
                System.out.println("No changes have been made.");
                System.out.println("Program Ending.");
                System.exit(0);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////User does want to write to file///////////////////////////////////////////////////
            }else if(userSelection == 1){
                System.out.println("Writing Mode initiated.");
                try {
                    PrintWriter outputStream = new PrintWriter(new FileOutputStream(fileName, true));
                    System.out.println("Input Text Below. Once finished please enter '/END/'.");
                    boolean continueLoop= true;
                    while (continueLoop) {

                        String input = kb.nextLine();
                        outputStream.println(input);
                        System.out.println("Successfully Added.");
                        if (input.equalsIgnoreCase("/END/")) {
                            outputStream.close();
                            continueLoop = false;
                            System.out.println("Writing Mode Turning Off.");
                            System.out.println("Program Ending.");
                            outputStream.close();
                        }
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



            }
            else{
                System.out.println("Error. Please use 1 or 2.");
                System.out.println("Program Ending. No changes made.");
                System.exit(0);
            }
        }else{
            System.out.println("Error. Please use 1 or 2.");
            System.out.println("Program Ending. No changes made.");
            System.exit(0);
        }
    }
}
