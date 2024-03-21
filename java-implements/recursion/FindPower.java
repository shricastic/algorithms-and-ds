class FindPower {
    private int power(int i, int toPower)
    {
        if(toPower==0)
        {
            return 1;
        }

        return i*power(i, toPower-1);

    }

    public static void main(String[] args)
    {
        FindPower f = new FindPower();
        System.out.println(f.power(2,3));
    }
}
