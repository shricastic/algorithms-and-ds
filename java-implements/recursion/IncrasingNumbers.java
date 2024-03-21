public class IncrasingNumbers {
    private void printNumbers(int i)
    {
        
        //base case
        if(i==1)
        {
            System.out.println(i);
            return;
        }

        this.printNumbers(i-1);

        System.out.println(i);
        
        
    }
    public static void main(String[] args)
    {
        IncrasingNumbers i = new IncrasingNumbers();
        i.printNumbers(10);
        
    }
}
