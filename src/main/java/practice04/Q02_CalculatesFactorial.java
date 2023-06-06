package practice04;

public class Q02_CalculatesFactorial {
    /*
        Write a return method that accepts an integer as input and calculates factorial and prints like output.
        Input: 6
        Output: 6! = 6*5*4*3*2*1 = 720
     */
    public static void main(String[] args) {
        calculateFactorial(5);

    }

    public static void calculateFactorial(int num){

        String fac = "";

        int f = 1;

        int i = num;
        while (i>0){

            f = f*i;
            fac = fac + i + "*";

            i--;
        }

        fac = fac.substring(0,fac.length()-1);

        System.out.println(num + "!" + " = " + fac + " = " + f);

    }

}
