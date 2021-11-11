/*
weight is 23 Kg, or less, per each bag, cost 50 egp extra per kg
max is 32kg else rejected
*/

import java.util.Scanner;  

public class Assigment3part8 {

    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        
        int NoCharge = 22;
        int MaxWeight = 32;

        System.out.println("How much does the first bag weight?");

        int Userinput1= Input.nextInt();
        
        
        System.out.println("How much does the second bag weight?");
        
        
        int Userinput2= Input.nextInt();

        if (Userinput1 > NoCharge){
            if (Userinput1 <= MaxWeight)
            {
                int AmountOfKgExtra = Userinput1 - NoCharge;
                int ExtraFees = AmountOfKgExtra * 50;
                System.out.println("You have to pay " + ExtraFees + "For the first bag");
            }
            else if (Userinput1 > MaxWeight)
            {
                System.out.print("REJECTED");
            }
            if (Userinput2 >= NoCharge){
                if (Userinput2 < MaxWeight)
                {
                    int AmountOfKgExtra2 = Userinput2 - NoCharge;
                    int ExtraFees = AmountOfKgExtra2 * 50;
                    System.out.println("You have to pay " + ExtraFees + "For the second bag");
                }
                else if (Userinput2 > MaxWeight)
                {
                    System.out.print("REJECTED");

                 }
            

        }
        




    }
     
    }
}
