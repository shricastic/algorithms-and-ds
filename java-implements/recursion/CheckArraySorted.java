public class CheckArraySorted {
    static int start=0;
    private boolean checkSorted(int arr[], int i)
    {
       if(i==arr.length-1)
       {
        return true;
       }

       if(arr[i]>arr[i+1])
       {
        return false;
       }

        return checkSorted(arr, i+1);
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        CheckArraySorted c = new CheckArraySorted();

        System.out.println(c.checkSorted(arr, start));
    }
}
