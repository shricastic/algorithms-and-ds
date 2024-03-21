public class PairsInArray {
    
    private void pairsOfArray(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            int j=i+1;

            while(j<arr.length)
            {
                int current=arr[i];
                int next=arr[j];
                System.out.print("("+current+","+next+"),");
                j++;
            }   
        }
    }
    


    public static void main(String[] args)
    {
        int[] arr={2,4,6,8,10};

        PairsInArray p= new PairsInArray();
        p.pairsOfArray(arr);
        
    }
}
