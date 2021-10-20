import java.util.Scanner;
/*
right now you can see the import command in line 1, In Java not every program needs a input.
Unlike other programing languges like python, you have to import a libary that allows the input of a user,
import java.until.scanner, takes any charecters and changes them into binary code (as we learned in
thecnical foundation of com sci) and allows it the user to input it.
*/
public class InputTxtDodo {
    public static void main(String[] args ) {
        Scanner keyboard = new Scanner(System.in); //This allows the computer to store users input in varibles.
        // First print out the question you would want to ask.
        System.out.println("What's the capital of Egypt?");
        keyboard.next();
        System.out.println("Pick a number between 1 and 10");
        keyboard.nextInt();
        System.out.println("Enter a number between 0.0 and 1.0");
        keyboard.nextDouble();
        System.out.println("Ask me a question!");
        keyboard.next();


    }
}


/*
try writing a miss input on one of the numbers questionsa and watch what happens!
*/