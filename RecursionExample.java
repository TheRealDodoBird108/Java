public class ReccursionSucks {

    public static void main(String[] args){
    Sayhi(5);


    }
    public static int Sayhi(int x){
        if (x == 0)
        System.out.println("done!");
        else
        {
            System.out.println("hi");
            x--;
            Sayhi(x);
        }
        return x;
    }
}
