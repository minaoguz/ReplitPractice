package practice04;

import java.util.Scanner;

public class Q07_ReverseTheNumber {

    // Write code to reverse the number which user entered.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a integer.");
        int num = input.nextInt();

        if (num<0){
            System.out.println("Please enter positive integer.");

        } else {
            String strNum = String.valueOf(num);

            String reverse = "";

            int i = strNum.length()-1;
            while (i>=0){

                char chr = strNum.charAt(i);
                reverse += chr;


                i--;
            }

            int reverseNum = Integer.parseInt(reverse);
            System.out.println("Reverse the number you entered is " + reverseNum);

        }

    }
}
