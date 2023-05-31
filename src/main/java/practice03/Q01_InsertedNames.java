package practice03;

public class Q01_InsertedNames {
    /*
        Create two words: name1 and name2
        if the name1 has even numbers of characters, then insert the second word in the middle of the first name
        if the first word has odd numbers, then print the "name2 cannot be inserted in the name1"

        e.g:
        name1 = "mehmet"
        name2 = "ahmet"

        Print ==> mehahmetmet
     */
    public static void main(String[] args) {

        String name1 = "Hannah";
        String name2 = "Garret";

        if (name1.length()%2 == 0){

            String firstChars = name1.substring(0, name1.length()/2);
            String secondChars = name1.substring(name1.length()/2);

            String newStr = firstChars + name2 + secondChars;
            System.out.println(newStr);

        } else {
            System.out.println("name2 cannot be inserted in the name1");
        }


    }
}
