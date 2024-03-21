import java.util.*;

public class prime {

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        boolean isPrime= true;

        for(int i=2; i<=n-1; i++)
        {
            if(n%i==0)
            {
                isPrime=false;
            }
        }
        
        System.out.print(isPrime);
    }
}
