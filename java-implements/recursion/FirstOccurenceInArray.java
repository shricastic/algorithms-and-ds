class FirstOccurenceInArray {
    
    private int findKey(int[] arr, int i, int key)
    {
        if(arr[i]==key)
        {
            return i;
        }
        if(i==arr.length)
        {
            return -1;
        }
        
        return findKey(arr, i+1, key);
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,8,9};
        FirstOccurenceInArray f = new FirstOccurenceInArray();
        System.out.println(f.findKey(arr, 0, 5));
    }
}
