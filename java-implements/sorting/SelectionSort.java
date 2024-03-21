import java.util.Arrays;

class SelectionSort{
    private void selectionSort(int[] arr)
    {

        for(int turn=0; turn<arr.length-1; turn++)
        {
            int minPos=turn;
            for(int j=turn+1; j<arr.length-1; j++)
            {
                if(arr[minPos]>arr[j])
                {
                    minPos = j;
                }
            }

            int temp = arr[turn];
            arr[turn]=arr[minPos];
            arr[minPos]=temp;
            
            
        }
    }
    public static void main(String[] args)
    {
        int[] arr={ 64, 34, 25, 12, 22, 11, 90 }; 

        SelectionSort s = new SelectionSort();
        s.selectionSort(arr);

        System.out.println(Arrays.toString(arr));

    }
}