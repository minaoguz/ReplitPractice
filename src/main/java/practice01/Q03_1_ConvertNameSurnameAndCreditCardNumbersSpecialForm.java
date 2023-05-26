package practice01;

import java.util.Scanner;

public class Q03_1_ConvertNameSurnameAndCreditCardNumbersSpecialForm {
    public static void main(String[] args) {
        /*
        * Ask user; Name, Surname and credit card numbers than convert it to special form.
        * (Initials for name and surname should be uppercase)
        (Check credit card number, if there aren’t 16 digit print “Invalid credit card number”
        Input :
        John White 1234234534561478
        Output :
        Name : J*** W****
        CCN  : **** **** **** 1478
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name.");
        String name = input.nextLine();

        System.out.println("Please enter your surname.");
        String lastName = input.nextLine();

        System.out.println("Please enter credit card numbers.");
        String ccn = input.nextLine();

        boolean isNameInitialUpperCase = name.charAt(0) >= 'A' && name.charAt(0) <= 'Z';
        boolean isLastNameInitialUpperCase = lastName.charAt(0) >= 'A' && lastName.charAt(0) <= 'Z';
        boolean nameCondition = isNameInitialUpperCase && isLastNameInitialUpperCase;
        boolean ccnCondition = ccn.replaceAll("[^0-9]", "").length() == 16;


        if (nameCondition == false){
            System.out.println("Initials for name and surname should be uppercase.");

        } else if (ccnCondition == false) {
            System.out.println("Invalid credit card number.");

        } else {
            String hiddenName = name.substring(1).replaceAll("[a-zA-Z]", "*");
            String hiddenLastName = lastName.substring(1).replaceAll("[a-zA-Z]", "*");

            String nameInitial = name.substring(0, 1);
            String lastNameInitial = lastName.substring(0, 1);

            String newHiddenName = nameInitial + hiddenName;
            String newHiddenLastName = lastNameInitial + hiddenLastName;

            String newName = newHiddenName + " " + newHiddenLastName;

            String hiddenCardNumbers = ccn.substring(0, ccn.length() - 4).replaceAll("\\d", "*");
            String lastFourDigits = ccn.substring(ccn.length() - 4);
            String newCcNumber = hiddenCardNumbers + lastFourDigits;

            System.out.println("Name: " + newName);
            System.out.println("CCN: " + newCcNumber);
        }




    }

}
