public class reverse {
    public static void main(String args[])
    {
        int n = 12234;

        while(n>0)
        {
            int temp = n%10;
            System.out.print(temp);
            n/=10;
        }
    }
    
}
