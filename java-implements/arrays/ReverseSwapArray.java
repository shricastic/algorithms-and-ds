import java.util.Arrays;

class ReverseSwapArray {
    
    public void reverseArray(int[] arr)
    {
        int start=0;
        int end= arr.length-1;

        while(start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;end--;
        }
    }
    public static void main(String[] args)
    {
        int[] arr={7, 10, 12, 23,9, 30, 42, 64};

        ReverseSwapArray a = new ReverseSwapArray();
        a.reverseArray(arr);

        System.out.println(Arrays.toString(arr));

    }
}
