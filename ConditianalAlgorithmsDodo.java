public class ConditianalAlgorithmsDodo {
    

    public static void main (String[] args){

        //conditianal Algortithms


        Byte x = 6;
        x = (byte) (x + 1); //Type Casting (Forcing Java to Trancate.)
        System.out.println(x);
        
        Byte y = 6;
        y = y++; // its like saying y = (byte) (y + 1);
        System.out.println(y);

        /*
        x++ =! x = x + 1
        its actually a faster way to wriet
        x++ = x = (Byte) (x+1)
        */

        byte p = 127;
        p = (byte) (p * 1);
        System.out.println(p);


        byte z = 127;
        z *= 1; //this is the same as saying z = (byte) (z * 1);
        System.out.println(z);


        String Hello = ("Hello Dodo!");
        System.out.println(Hello);
        String Hello2 = (" How are you? ");
        System.out.println(Hello + Hello2); // adds texts togather
        System.out.println(Hello + Hello2 + 2 + 8); // it'll add it as a string

        /*
        Java Reads from left to right, here's a example.
        */
        
        System.out.println(0 + 0 + "7"); // starts as a int and later changes to a string.

        System.out.println("0" + 0 + 7); // starts as a string so stays as a string.

        System.out.println("22" + 0.325 + 192.948); //works with everything.


        // String is called a complex object in Java and C++


        //A char has sa unicode value

        char i = 'a'; // "" = String while '' = Char
        System.out.println(i);

        // a in char is 97 and you add one for each letter

        char u = 'c';
        System.out.println(u);

        char n = 'l';
        char m = (char) (n+1);
        System.out.println(m);

        char g = 88;
        System.out.println(g);

        System.out.println("\\"); // to print a black slash

        int t = 22;
        if (t > 0) // If Statments
        {
            System.out.print("Positive");
        }
        else if (t == 0) 
        {
            System.out.println("ZERO");
        }
        else
        {
            System.out.println("Negative");
        }




    }

    

}
