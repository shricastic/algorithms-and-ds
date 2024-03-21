public class ProductFun {
    
    private int product(int a, int b)
    {   
        return a*b;
    }
    
    
    public static void main(String args[])
    {
        int a=2; int b=9;

        ProductFun p = new ProductFun();
        
        System.out.print(p.product(a, b));
    }
}
