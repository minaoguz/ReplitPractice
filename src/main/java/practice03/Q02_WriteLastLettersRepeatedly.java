package practice03;

import java.util.Scanner;

public class Q02_WriteLastLettersRepeatedly {
    /*
            Ask user for a String and print a new String made of 3 copies of the last 2 letters
            The String length will be at least 2
            Sample:
            INPUT: Mustafa
            OUTPUT: fafafa
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.next();

        if (name.length()>2){

            String lastTwo = name.substring(name.length()-2);
            for (int i = 0; i<3; i++){
                System.out.print(lastTwo);
            }


        }



    }
}
