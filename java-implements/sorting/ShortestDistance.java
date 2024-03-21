class ShortestDistance{

    private int shortestDistance(String str)
    {
        int x=0;
        int y=0;
        for(int i=0; i<str.length();i++)
        {
            char direction=str.charAt(i);

            switch(direction)
            {
                case 'N': y+=1;
                break;

                case 'S': y-=1;
                break;

                case 'W': x-=1;
                break;

                case 'E': x+=1;
                break;

                default: continue;

            }
        } 

        int result= (x*x)+(y*y);

        result=(int) Math.sqrt(result);

        return result;
        
        
    }

    public static void main(String[] args)
    {
        ShortestDistance s= new ShortestDistance();

        System.out.println(s.shortestDistance("WNEENESENNN"));
    }
}
