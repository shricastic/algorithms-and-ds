import java.util.*;

class BubbleSort {
 
    private void bubbleSort(int[] arr)
    {
        for(int turn=0; turn<arr.length-1; turn++)
        {
            for(int i=0; i< arr.length-1-turn; i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                else{continue;}
                
                
            }
            
        }


    }
    public static void main(String[] args)
    {
        int[] arr={ 64, 34, 25, 12, 22, 11, 90 }; 

        BubbleSort b = new BubbleSort();
        b.bubbleSort(arr);

        System.out.print(Arrays.toString(arr));
        
    }
}
