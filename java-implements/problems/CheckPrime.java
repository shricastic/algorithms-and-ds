import java.util.*;

public class CheckPrime {
    public boolean isPrime(int n)
    {
        boolean isPrime = true;

        for(int i=2; i<n; i++)
        {
            if(n%i==0)
            {
                isPrime=false;        
            }
        }

        return isPrime;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();

        CheckPrime c=new CheckPrime();
        System.out.println(c.isPrime(n));

    }
}
