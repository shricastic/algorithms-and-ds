import java.util.*;

class P20_CheckParanthesis{

	boolean checkPara(String str){

		Stack<Character> stack = new Stack<>();

		for(int i = 0; i<str.length(); i++){
			char currSymbol = str.charAt(i);

			if(currSymbol=='('){
				stack.push(')');
			} else if(currSymbol=='['){
				stack.push(']');
			} else if(currSymbol=='{'){
				stack.push('}');
			} else{
				if(stack.empty()!=true){
					if(stack.peek() == currSymbol){
					stack.pop();
					}else{
						return false;
					}	
				}else{
					return false;
				}
			}
		}
		return stack.empty();
	}

	public static void main(String[] args){
		String test = "({})";
		
		P20_CheckParanthesis c = new P20_CheckParanthesis();
		System.out.println(c.checkPara(test));
	}

}