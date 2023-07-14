package practice05;

public class Q03_SumOfIntegers {

    public static void main(String[] args) {

        // Write a return method that accepts more than one integer as parameter and prints the sum of integers

        System.out.println(sum(1, 2, 3, 4, 5));

    }

    public static int sum(int... numbers){

        int sum = 0;

        for (Integer w : numbers){
            sum += w;

        }
        return sum;
    }

}
