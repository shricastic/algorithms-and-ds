import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
    
    public void nextGreater(int[] arr, int[] greater)
    {
        Stack<Integer> s = new Stack<>();
        greater[greater.length-1] = -1;

        for(int i=arr.length-1; i>=0; i--)
        {
            int current = arr[i];
            if(s.isEmpty()){
                greater[i]=-1;
                s.push(i);
            }
            else if(current > arr[s.peek()]){
                s.push(i);
                greater[i]=-1;
            }
            else if(current < arr[s.peek()]){
                greater[i]=arr[s.pop()];
                s.push(i);
            }      
        }


    }

    public static void main(String[] args) {
    
        int[] arr = {6,8,0,1,3};
        int[] greater = new int[arr.length];

        NextGreater n = new NextGreater();
        n.nextGreater(arr, greater);

        System.out.println(Arrays.toString(greater));
    }
}
