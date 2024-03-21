public class Factorial {
    
    private int recursion(int n)
    {
        if(n==1)
        {
            return 1;
        }   
        return n*recursion(n-1);
    }

    public static void main(String[] args)
    {
        Factorial f= new Factorial();
        System.out.println(f.recursion(5));
    }
}
