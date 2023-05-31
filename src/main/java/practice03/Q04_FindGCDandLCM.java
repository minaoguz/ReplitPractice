package practice03;

public class Q04_FindGCDandLCM {
    /*
    Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
    Input:
    30 and 40
    Expected Output:
    GCD for 30 and 40 = 10
    LCM for 30 and 40 = 120
     */

    public static void main(String[] args) {

        int x = 12;
        int y = 9;

        int gcd = 1;

        for (int i = 1; i<=x && i<=y; i++){

            if (x%i==0 && y%i==0){
                gcd = Math.max(i,gcd);

            }

        }

        int lcm = (x*y)/gcd;

        System.out.println("GCD for " + x + " and " + y + " = " + gcd);
        System.out.println("LCM for " + x + " and " + y + " = " + lcm);

    }
}
