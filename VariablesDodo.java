public class VariablesDodo {

/*
        before starting we have to answer a couple questions,
        1. What is a String? (Str) - String can consist of any letter or symbol or integer but cannot be used 
        in a mathamatical operation, the computer will only recognize it as text, strings can be A1, abc, 38>,.sj
        , 38ng;/, ]';[]' and so on.
        2. What is an Integer? (Int) - An intger consists fron numbers with no decimal points, can be used in
        mathamatical operations. Integer can 2, 5, 1, 7, 3, 4
        3. What is a float? (Double) - a float is numbers that exist with decimals such as 2.2412, 2.00, 85.31
        */    
        public static void main( String[] args ) {
        System.out.println("I want to learn how to create varibles, let's see how!!");
        /*
        While making a varible I have to think of 3 thigns, what you'll call the varible and 
        what it is and what is it = to
        */
        System.out.println("Me and my friend Ahmed have a certain amount of money.\nwe want to figure out how much we have togather.");
        System.out.println("I know that I have 15 dollors, while my friend has 20. I should probably declare our money as a varible.");
        int MyMoney = 15;
        int AhmedsMoney = 20;
        System.out.println("Now that I declared them as varibles and assigned them as integers I'm going to add them up");
        int TotalMoney = MyMoney + AhmedsMoney;
        System.out.println("The total amount of money we both have is" + TotalMoney); //I put money total right after the text, which made it print as one whole line.
        /*
        Now that I know the integers let's think of another scenerio
        */
        System.out.println("Now me and my friend Ahmed went to buy steak with our money combined, it costed us 10.75 dollors");
        System.out.println("I should probably declare that as a varible.");
        Double Steak = 10.75;
        System.out.println("Let's see how much that we have left?");
        Double Remainder = TotalMoney - Steak;
        System.out.println("Therefore the total money that we have left is " + Remainder);
        System.out.println("Now let's see how much we will have if we split the money we have left.");
        Double SplittingMoney = Remainder / 2;
        System.out.println("Therefore I have " + SplittingMoney + "While Ahmed has " + SplittingMoney + "left");





    }
}
