import java.util.Stack;

public class ReverseString {
    
    public String reverse(String str)
    {
        Stack<Character> stack = new Stack<Character>();
        String newString = "";
        for(int i=0; i<str.length(); i++)
        {
            stack.push(str.charAt(i));
        }
        while(stack.empty()!=true)
        {
            char c = stack.pop();
            newString+=c;
        }
        return newString;
    }


    public static void main(String[] args) {
        
        String str = "abc";

        ReverseString r = new ReverseString();
        System.out.println(r.reverse(str));
        
    }
}
