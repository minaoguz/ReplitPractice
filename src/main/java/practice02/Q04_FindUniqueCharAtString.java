package practice02;

import java.util.Scanner;

public class Q04_FindUniqueCharAtString {
    /*
            Ask user to type a name, the length of name should be 3.
        Then check if the name has same characters.
        If the String has same characters
        Print “String has duplicate characters”
        Else
        Print “String has unique characters”
        Please use ternary.
       Input :
        ala
        OutPut:
        String has duplicate characters
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write your name.");
        String name = input.nextLine();

        int counter = 0;

        for (int i = 0; i<name.length(); i++){

            char chr = name.charAt(i);

            if (name.indexOf(chr) == name.lastIndexOf(chr)){
                continue;

            }else {
                counter++;
            }

        }

        if (counter == 0){
            System.out.println("String has unique characters.");
        }else {
            System.out.println("String has duplicate characters.");
        }



    }

}
