class BinarySearch {
    public int binSearch(int[] arr, int key)
    {
        int start=0;
        int end= arr.length-1;

        while(start<=end)
        {
            int mid=(start+end);

            if(key==arr[mid]){
                return mid;}
            else if(key>arr[mid]){
                start = mid+1;}
            else{
            end = mid-1;}
        }

        return -1;
    }

    public static void main(String args[])
    {
        int[] arr={7, 10, 12, 23, 23, 30, 42, 64};

        BinarySearch b= new BinarySearch();
        System.out.println(b.binSearch(arr, 64));
    }
}
