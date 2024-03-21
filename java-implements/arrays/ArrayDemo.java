class ArrayDemo{
    public void updateArray(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            arr[i]+=1;
        }
    }

    public void printArray(int[] arr)
    {
        for(int i=0; i<arr.length;i++)
        {
            System.out.println(arr[i]);

        }
    }

    public static void main(String[] args)
    {
        int[] marks = new int[]{80,90,30};

       
     
        ArrayDemo a = new ArrayDemo();
        a.updateArray(marks);
        a.printArray(marks);

    }


}