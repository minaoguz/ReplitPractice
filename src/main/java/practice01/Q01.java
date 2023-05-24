package practice01;

public class Q01 {

    public static void main(String[] args) {
        /*
    Practice 1: Write the Java code that prints on the console "Hello" on the first line and "World" on the second line.
        Sample Output:
        Hello
        World
     */
       String helloWorld = "Hello World.";
       String firstWord = helloWorld.split(" ")[0];
       String secondWord = helloWorld.split(" ")[1];

       System.out.println(firstWord + "\n" + secondWord);


    }
}
