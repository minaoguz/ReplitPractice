package practice04;

import java.util.Arrays;

public class Q01_ReturnsDuplicateCharsInStringArray {
    /*
    Write a code that returns the duplicate chars in a String array. (interview question)

    Input:
    String str = "Javaisalsoeasy"

    Output:
    [a, s]

 */
    public static void main(String[] args) {

        String str = "Java is also easy";

        str = str.replaceAll("\\s", "");

        String repeatedChr = "";

        for (int i = 0; i < str.length(); i++) {

            String chr = str.substring(i, i + 1);

            if (str.indexOf(chr) != str.lastIndexOf(chr) && !repeatedChr.contains(chr)) {
                repeatedChr = repeatedChr + chr;

            }

        }

        String[] arr = new String[repeatedChr.length()];

        int i = 0;
        while (i<arr.length){
            arr[i] = repeatedChr.substring(i,i+1);

            i++;
        }

        System.out.println(Arrays.toString(arr));


    }

    /*
     public static void main(String[] args) {
        String str="Java is so easy";

        String str2 []=str.split("");

        String repeatedChr = "";

        for (int i = 0; i <str2.length ; i++) {

            char ch= str.charAt(i);

            if (str.indexOf(ch)!=str.lastIndexOf(ch) && !repeatedChr.contains( str2[i]) ) {

                repeatedChr=repeatedChr+ch;

            }

        }

        System.out.println(repeatedChr);

    }
     */



}
