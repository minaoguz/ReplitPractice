package practice04;

public class Q05_PerfectNumber {
    /*
        Write code checking the number is Perfect number or not.

        Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number
     itself is equal to that number.
     */
    public static void main(String[] args) {

        int num = 28;

        int sum = 0;

        int i = 1;
        while (i<=num/2){

            if (num % i == 0){
                sum += i;
            }

            i++;
        }

        if (num == sum){
            System.out.println(num + " is perfect number.");

        } else {
            System.out.println(num + " is not perfect number.");
        }

        System.out.println(isPerfectNumber(496));
        System.out.println(isPerfectNumber(8128));


    }


    public static boolean isPerfectNumber(int num){
        int sum = 0;

        int i = 1;
        while (i<=num/2){

            if (num % i == 0){
                sum += i;
            }

            i++;
        }

        boolean perfectNum = sum == num;
        return perfectNum;

    }

}
