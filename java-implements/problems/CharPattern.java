import java.util.Scanner;

public class CharPattern {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int lines=sc.nextInt();
        sc.close();

        int n=65;

        for(int i=0; i<=lines; i++)
        {
            int j=i;
            while(j>0)
            {
                System.out.print((char)n++);
              
                j--;
            }
            System.out.println();
        }

        
        
    }
}
