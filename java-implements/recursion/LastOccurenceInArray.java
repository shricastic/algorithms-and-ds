class LastOccurenceInArray {
    
    private int lastOccurence(int arr[], int i, int key)
    {
        if(arr[i]==key)
        {
            return i;
        }
        if(i==arr.length)
        {
            return -1;
        }

        return lastOccurence(arr, i-1, key);
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,8,9};
        LastOccurenceInArray l = new LastOccurenceInArray();
        System.out.println(l.lastOccurence(arr, arr.length-1, 5));
    }
}
