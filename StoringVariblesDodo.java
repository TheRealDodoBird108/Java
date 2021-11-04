/*
We learned about allowing the user to write down inputs, now we want to store their inputs to allow them for
us to use it throughout the program.
*/
import java.util.Scanner;

public class StoringVariblesDodo {
    public static void main(String[] args){
        //First we have to tell the computer what varibles we will be using.
        String Name;
        int Age;
        Double Weight, Income;
        
        Scanner Input = new Scanner(System.in);
        System.out.print("Hello! What is your Name?\t");
        Name = Input.next();
        System.out.println("");
        System.out.println("How old are you?");        
        Age = Input.nextInt();
        System.out.println("how much do you weight in cm? also much to earn weekly?");
        Weight = Input.nextDouble();
        Income = Input.nextDouble();
        System.out.println(String.format("Therefore, You are telling me you are"));
        //continue this part, we did this on InputTxtDodo



    }
    
}
