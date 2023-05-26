package practice01;

import java.util.Scanner;

public class Q02_CalculateBMI {
    public static void main(String[] args) {
        /*
            Ask user to their weight and height and type a program with calculates mass index
                * HINT : Body Mass Index = Weight (kg) / Square of height (m)

                Then give a message to user as following:

                If BMI is less than 18.5 , you re weak
                If BMI is between 18.5 and 25 , your weight is ideal
                If BMI is between 25 and 30, you re fat
                If BMI is more than or equal to 30, obese
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight.");
        double weight = input.nextDouble();

        System.out.println("Please enter your height.");
        double height = input.nextDouble();

        double bmi = weight / (height*height);

        if (bmi<18.5){
            System.out.println("You are weak.");

        } else if (bmi>= 18.5 && bmi<25) {
            System.out.println("Your weight is ideal.");

        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are fat.");

        }else {
            System.out.println("Obese.");
        }


    }
}
