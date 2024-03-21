public class Palindrome {

    private boolean checkPalindrome(String str)
    {
        for(int i=0; i<str.length()/2; i++)
        {
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i))
            {
                return false;
            }  
        }
        return true;
    }


    public static void main(String[] args)
    {
        String str = "noon";

        Palindrome p = new Palindrome();
        System.out.println(p.checkPalindrome(str));
    }
    
}
