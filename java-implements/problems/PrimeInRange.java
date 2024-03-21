public class PrimeInRange
{
    void getPrime(int start, int end)
    {
        if (start<2)
        {
            start=2;
        }

        for(int i=start; i<end; i++)
        {
            boolean flag=true;

            for(int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    flag=false;
                }
            }
            if (flag==true)
            {
                System.out.print(i+",");
            }
        }

    }

    public static void main(String args[])
    {
        PrimeInRange p = new PrimeInRange();
        p.getPrime(1, 50);

    }

}