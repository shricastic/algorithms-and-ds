public class Fibbinacci {
    
    private int fib(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        
        int result=fib(n-2)+fib(n-1);
        return result;
    }
    public static void main(String[] args)
    {
        Fibbinacci f = new Fibbinacci();
        System.out.println(f.fib(4));

    }
}
