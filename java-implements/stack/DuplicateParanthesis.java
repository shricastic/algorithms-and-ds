import java.util.Stack;

public class DuplicateParanthesis {
    
    public boolean checkDuplicate(String str)
    {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            
            char ch = str.charAt(i);

            if(ch==')'){
                int count=0;
                while(stack.pop()!='('){
                    count++;
                }
                if(count<1){
                    return true;
                }
            } else{
                stack.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)+b)";
        
        DuplicateParanthesis d = new DuplicateParanthesis();
        System.out.println(d.checkDuplicate(str));
        
    }
}
