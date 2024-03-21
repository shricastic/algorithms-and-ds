import java.util.Scanner;


public class StarsDescending {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=n; i>0; i--)
        {
            int j=i;

            while(j>0)
            {
                System.out.print("*");
                j--;
            }

           System.out.println();
            
        }
        sc.close();
    }
}
