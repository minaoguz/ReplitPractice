package practice01;

import java.util.Scanner;

public class Q03_3_ConvertNameSpecialForm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name.");
        String name = input.nextLine();

        System.out.println("Please enter your surname.");
        String lastName = input.nextLine();

        boolean isNameInitialUpperCase = name.charAt(0) >= 'A' && name.charAt(0) <= 'Z';
        boolean isLastNameInitialUpperCase = lastName.charAt(0) >= 'A' && lastName.charAt(0) <= 'Z';
        boolean nameCondition = isNameInitialUpperCase && isLastNameInitialUpperCase;

        if (nameCondition == false){
            System.out.println("Initials for name and surname should be uppercase.");

        } else {
            String hiddenName = name.substring(1).replaceAll("[a-zA-Z]", "*");
            String hiddenLastName = lastName.substring(1).replaceAll("[a-zA-Z]", "*");

            String nameInitial = name.substring(0,1);
            String lastNameInitial = lastName.substring(0,1);

            String newHiddenName = nameInitial + hiddenName;
            String newHiddenLastName = lastNameInitial + hiddenLastName;

            String newName = newHiddenName + " " + newHiddenLastName;

            System.out.println(newName);
        }






    }
}
