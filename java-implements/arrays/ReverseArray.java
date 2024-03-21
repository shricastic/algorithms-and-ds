import java.util.Arrays;

class ReverseArray {
    public int[] reverseArray(int[] arr)
    {
        int[] temp = new int[(arr.length)];
        int j=0;
        for(int i=arr.length-1; i>=0; i--)
        {
           
            if(j<arr.length)
            {
                temp[j]=arr[i];
                j++;
            }

        }
         return temp;

    }
    public static void main(String[] args)
    {
        int[] arr={7, 10, 12, 23, 23, 30, 42, 64};

        ReverseArray r= new ReverseArray();
        arr=r.reverseArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}
