package practice03;

import java.util.Scanner;

public class Q03_CheckRepeatedLetter {
    /*
            Ask user to enter a name and a character,
            then check how many times the character is repeated in the name using loops in the name

            e.g:
            char ch1 = 'a';
            String name = "John came late"
            Expected Output: Number of a = 2
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name.");
        String name = input.nextLine();

        System.out.println("Please enter a letter.");
        char letter = input.next().charAt(0);

        int counter = 0;

        for (int i = 0; i<name.length(); i++){

            if (name.charAt(i) == letter){
                counter++;
            }

        }
        System.out.println("Number of " + letter + " = " + counter);



    }
}
