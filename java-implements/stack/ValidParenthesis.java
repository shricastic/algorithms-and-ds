import java.util.Stack;

public class ValidParenthesis {
    
    public boolean checkParanthesis(String str)
    {
        Stack<Character> s = new Stack<Character>();

        for(int i=0 ; i<str.length() ; i++)
        {
            char Current = str.charAt(i);

            if(s.isEmpty()){
                s.push(Current);
            }
            else{
                if((s.peek()=='('&& Current == ')')){
                    s.pop();
                }else if(s.peek()=='{'&& Current=='}'){
                    s.pop();
                }else if((s.peek()=='['&& Current==']')){
                    s.pop();
                }
                else{
                    s.push(Current);
                }
            }
                            
        }

        if (s.isEmpty()) {
            return true;           
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "{}[]({}";

        ValidParenthesis v = new ValidParenthesis();
        System.out.println(v.checkParanthesis(str));        
    }
}
