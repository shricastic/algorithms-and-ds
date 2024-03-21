public class Binomial {
    private int factorial(int i)
    {
        int temp=1;
        while(i>0)
        {
            temp*=i;
            i--;
        }

        return temp;
    }

    private int binomial(int n, int r)
    {   
        return factorial(n)/(factorial(r)*factorial((n-r)));
    }

    public static void main(String args[])
    {
        Binomial b = new Binomial();

        System.out.println(b.binomial(5, 3));
    }
}
