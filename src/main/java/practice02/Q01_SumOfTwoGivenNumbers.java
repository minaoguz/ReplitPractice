package practice02;

import java.util.Scanner;

public class Q01_SumOfTwoGivenNumbers {
    public static void main(String[] args) {

        /*
        Write a Java program to compute and print sum of two given numbers (more than or equal to zero).
        If given integers or the sum have more than 10 digits, print "numberDigitsOverflow".
        EXAMPLE:
        INPUT      :
        Input two integers:
        25
        46

        OUTPUT :
        Sum of the numbers: 71
*/

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two integers.");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        boolean numberCondition = num1 >= 0 && num2 >= 0;

        String stringNumber1 = String.valueOf(num1);
        int digitCountNum1 = stringNumber1.length();

        String stringNumber2 = String.valueOf(num2);
        int digitCountNum2 = stringNumber2.length();

        boolean numberDigitsOverflow = digitCountNum1 < 11 && digitCountNum2 < 11;

        int sumOfNumbers = num1 + num2;

        String stringSumOfNumbers = String.valueOf(sumOfNumbers);
        int digitCountSum = stringSumOfNumbers.length();

        boolean sumOverflow = digitCountSum < 11;

        if (numberCondition && numberDigitsOverflow && sumOverflow) {
            System.out.println("Sum of the numbers = " + sumOfNumbers);

        } else if (numberCondition == false) {
            System.out.println("Numbers must be positive integers.");

        } else if (numberDigitsOverflow == false || sumOverflow == false){
            System.out.println("Overflow");
        }



    }
}
