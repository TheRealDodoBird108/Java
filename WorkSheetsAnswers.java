import java.util.Scanner;
import java.lang.Math;

public class WorksheetTwoAnswers {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("which worksheet do you want to work on");
        int UserInputWorkSheet = input.nextInt();

        if (UserInputWorkSheet == 2)
        
        
        
        {
            /*
            Work Sheet 2
            */
            System.out.println("Which question?");
            int UserInputWorkSheet1 = input.nextInt();
            
            
            if (UserInputWorkSheet1 == 1 || UserInputWorkSheet1 == 2)
                System.out.println("Coudln't answer here I'll answer in a peice of paper");
            
            
                else if (UserInputWorkSheet1 == 3)
            {
                System.out.println(" The question is asking you to find the result of the equation thats going on.\n They declare d1 as a double and it is = 1.03 while d2 is a double that is equal to 0.42.\n d3 is aslo decalred as a double and is = to d1 - d2.\n due to all of the varibles being a double the result will be a double");
    
                double d1 = 1.03;
                double d2 = 0.42;
                double d3 = (d1 - d2);
                System.out.println(d3);
                
                System.out.println(" Now let's try mixing a little float into the equation");
                double d4 = 0.1;
                float f = (float) d4; //Casting to change double to float   
                float d5 = 1 - f; //writing over d4 d4
                System.out.print(d5);

            }
            
            
            else if (UserInputWorkSheet1 == 4)
            {
                System.out.println("Plesae write a amount of time in seconds");
                int Seconds = input.nextInt();
                int Hours = (Seconds / 60);
                int Days = (Hours / 60);
                System.out.println("Seconds = "+ Seconds +"Hours = "+ Hours+"Days = " + Days);


            }
            
            
            else if (UserInputWorkSheet1 == 5)
            {
                System.out.println("Please Input amount of Dollars you have");
                int Dollars = input.nextInt();
                System.out.println("Please Input amount of Quarters you have");
                int Quarter = input.nextInt();
                System.out.println("Please Input amount of Dimes you have");
                int Dime = input.nextInt();
                System.out.println("Please Input amount of Nickles you have");
                int Nickle = input.nextInt();
                
                Double Total = (double) ((Dollars * 100) + (Quarter * 25) + (Dime * 10) + (Nickle * 5));
                System.out.println("Total in pennies is " + Total);

                System.out.println("Total in dollars is " + (Total / 100));
                
            }
            else if (UserInputWorkSheet1 == 6)
            {
                System.out.println("plesae input the hight of the cyclinder cup");
                Double UserInputH = input.nextDouble();
        
                System.out.println("plesae input the hight of the Raduis cup");
                Double UserInputR = input.nextDouble();
        
                final double Pi = 3.14;
        
                double Volume = (UserInputR *UserInputR) * Pi * UserInputH;
                double liter = (1.0/1000)*Volume;
                Double timeQ6 = liter * 2;
                System.out.println(timeQ6);    
                
            }
            else if (UserInputWorkSheet1 == 7)
            {
                    System.out.println("Please input the R1");
                    Double R1 = input.nextDouble();
                    System.out.println("Plesae input the R2");
                    Double R2 = input.nextDouble();
                    System.out.println("Plesae input the R3");
                    Double R3 = input.nextDouble();

                    System.out.println("Resistance Parallel = " + (R1 + R2 + R3)); //Parallel  are R + R .... = R
                    Double RSeries = ((1/R1)+ (1/R2) + (1/R3));
                    System.out.println("Resistance Series = " + (1/RSeries)); //Series are 1/R + 1/R ... = 1/Req
            }
            else if (UserInputWorkSheet1 == 8)
            {
                //Conversion Celsius to Ferenhait and Kelvin
                
                System.out.println("Please insert the degree in celsius");
                int Celsius = input.nextInt(); // 1 cel is = to 1.8 fer
                
                if (Celsius <= 100 && Celsius >= 0)
                {
                    Double Ferenhait = (double) (((9/5) * Celsius) + 32);
                    int Kelvin = Celsius + 273;
                    System.out.println("Kelvin = "+ Kelvin + "\nFerenhait = "+ Ferenhait);
                }
                else
                    System.out.println("A scale up to 100 Degrees");
             }
            else if (UserInputWorkSheet1 == 9)
            {
                /*
                Assume that you have an octal number (base 8) and you would like to convert it into its equivalent 
                decimal number (base 10) and binary number (base 2). 
                For example: (27)8 is equal to (23)10 in decimal and (10111)2 in binary.
                Write a sequential Java program to convert a two digit 
                octal number into its equivalent binary and decimal numbers.
                */
               /* System.out.println("Please input a base 8 number (Octal)");
                int Octal = input.nextInt();
                int XQuestion9 = 0;
                int z = 1;
                int p = 0;
                int ResultQ9W2 = 0;
                int OctalCharPosition = 0;
                
                while (XQuestion9 == 0) //While loop to be able to end the program
                    {
                        String OctalString = String.valueOf(Octal); //Octal but in string to get char and length.
                        int OctalLength = OctalString.length(); //The length of the number we are converting.
                        
                        for(int XForLoopQ9W2 = 0; XForLoopQ9W2 == 0;) //for loop that only ends with Varible defined is not equal to zero
                        {
                            if (z != OctalLength)
                            {
                                OctalCharPosition = parseInt(OctalString.charAt(OctalLength - z)); //Change the value from char to int in the specific position of the char
                                System.out.println(OctalCharPosition);
                                ResultQ9W2 += (int) (OctalCharPosition* (Math.pow(8, (0 + p))));// adds one to the power every time
                                System.out.println(ResultQ9W2);
                                if (OctalCharPosition >= 8 || OctalCharPosition < 0)
                                {
                                    break;
                                }
                                z++;
                                p++;
                            }
                            else if (z >= OctalLength)
                            {
                                OctalCharPosition = OctalString.charAt(OctalLength - z);
                                ResultQ9W2 += (int) (OctalCharPosition* (Math.pow(8, 0 + z)));
                                System.out.println("The Final Result will be " + ResultQ9W2 + " Base");
                                XForLoopQ9W2++;
                            }
                         }

                    XQuestion9++;

                }

                */
            }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            }
            
            
            
            
            
            
            
            
    
            
            else if (UserInputWorkSheet != 1 || UserInputWorkSheet != 2){ // u can just use a else statment but i wanted to show how to say if something is not equal to soemthing
                System.out.println("Give a Valid Input retard");
                return;

            }
        
            
            



            






    }

    private static int parseInt(char charAt) {
        return 0;
    }
    
}
