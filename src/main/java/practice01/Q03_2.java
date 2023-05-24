package practice01;

import java.util.Scanner;

public class Q03_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter credit card numbers.");
        String ccn = input.nextLine();

        int counter = 0;
        for (int i = 0; i < ccn.length(); i++) {

            if (ccn.charAt(i) == ' '){
                continue;
            }else {
                counter++;
            }


        }


        if (counter!=16){
            System.out.println("Invalid credit card number.");
        } else {
            String hiddenCardNumbers = ccn.substring(0,ccn.length()-4).replaceAll("\\d", "*");
            String lastFourDigits = ccn.substring(ccn.length()-4);
            String newCcNumber = hiddenCardNumbers + lastFourDigits;

            System.out.println(newCcNumber);

        }













    }
}
