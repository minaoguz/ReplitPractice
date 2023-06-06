package practice04;

public class Q06_PrintsAsciiValuesOfCharacters {

    // Write code that prints ascii values of characters from 'a' to 'z'
    public static void main(String[] args) {

        int i = (char) 'a';

        while (i <= (char) 'z' ){

            System.out.println("Ascii value of " + (char) i + " = " + i);

            i++;
        }
    }

}
