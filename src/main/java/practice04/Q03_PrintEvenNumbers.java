package practice04;

public class Q03_PrintEvenNumbers {
    /*
        Print even numbers from 20 to 0 but do not use decrement (i--)

        Output:
            Even numbers from 20 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
     */
    public static void main(String[] args) {

        printEvenNumbers(20);

    }

    public static void printEvenNumbers (int num){

        String str = "";

        int i = num;
        while (i >= 0) {
            str = str + i + " ";
            i -= 2;
        }

        System.out.print("Even numbers from " + num + " to 0 are: " + str + " ");


    }
}
