class ReverseNumbers{
    private void reverseNumbers(int n)
    {
        //base condition
        if(n<=0)
        {
            return;
        }
        System.out.println(n);
        this.reverseNumbers(n-1);
    }
    public static void main(String[] args)
    {
        ReverseNumbers r = new ReverseNumbers();
        r.reverseNumbers(10);

    } 

}