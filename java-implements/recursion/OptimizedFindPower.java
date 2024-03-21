class OptimizedFindPower {
    
    private int optimisedPower(int n, int i)
    {
        if(i==0)
        {
            return 1;
        }

        int halfPower=optimisedPower(n, i/2);

        int halfPowersq= halfPower*halfPower;

        if(n%2!=0)
        {
            halfPowersq=n*halfPower;
        }

        return halfPowersq;
    }

    public static void main(String[] args)
    {
        OptimizedFindPower p = new OptimizedFindPower();
        System.out.println(p.optimisedPower(5, 5));
    }
}
