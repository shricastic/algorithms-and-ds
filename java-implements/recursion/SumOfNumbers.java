public class SumOfNumbers {
    
    private int sumOfNumbers(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+sumOfNumbers(n-1);
    }

    public static void main(String[] args)
    {
        SumOfNumbers s= new SumOfNumbers();
        System.out.println(s.sumOfNumbers(5));
    }
}
