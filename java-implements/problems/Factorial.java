public class Factorial {
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

    public static void main(String args[])
    {
        Factorial f=new Factorial();

        System.out.print(f.factorial(5));

    }
}
