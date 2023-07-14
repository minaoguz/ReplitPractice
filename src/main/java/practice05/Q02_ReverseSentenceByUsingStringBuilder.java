package practice05;

public class Q02_ReverseSentenceByUsingStringBuilder {

    public static void main(String[] args) {

        // Write a java program which accept a sentence as parameter, then reverses sentence by using StringBuilder
        // and checks if sentence is palindrome or not

        StringBuilder sb = new StringBuilder("I love Java.");
        String strSb = sb.toString();
        String reverseSb =sb.reverse().toString();

        if (strSb.equals(reverseSb)){
            System.out.println("This sentence is palindrome");
        } else {
            System.out.println("This sentence is not palindrome");
        }


    }

}
