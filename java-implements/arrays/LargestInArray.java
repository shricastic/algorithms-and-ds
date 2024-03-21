class LargestInArray {
    
    public int largestInArray(int[] arr)
    {
        int largest=0;
        for(int i=0; i<arr.length; i++)
        {
            if (arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        return largest;
    }



    public static void main(String[] args)
    {
        int[] arr={23,5,43,65,32,12};

        LargestInArray l = new LargestInArray();
        System.out.println(l.largestInArray(arr));

    }
    
}
