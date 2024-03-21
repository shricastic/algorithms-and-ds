//this approach is implemented using bruteforce 
class P3_1LongestSubstring{

	int checkLongestSub(String str){

		int res = 0;
		for(int i=0; i<str.length(); i++){


			for(int j=i ; j<str.length(); j++){

				if(checkRepetition(str, i, j)==true){
					res = Math.max(res, j-i);
				}
			}
		}

		return res;
	}

	boolean checkRepetition(String str, int start, int end){

		int[] chars = new int[128];

		for(int i = start; i<end; i++){
			char c = str.charAt(i);
			chars[c]++;

			if(chars[c]>1){
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args){

		String s = "abcabcbb";

		P3_1LongestSubstring p = new P3_1LongestSubstring();
		System.out.println(p.checkLongestSub(s));
	}


}