//problem solved using sliding window approach
class P3_LongestSubstring{

    void longestSub(String s){
        //get String bu sliding window approch
        for(int size=1; i<s.length(); size--){
            int Start = 

            while(){

            }
        }
    }

    boolean checkRepetition(){
        //check if string has repeated characters
    }


    Public static void main(String[] args){

        String s = "abcabcbb"
        P3_LongestSubstring p = new P3_LongestSubstring();
        p.longestSub(s)
        System.out.println();
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static int lengthOfLongestSubstring(String str)
{
    int n = str.length();
    int res = 0;
     
    for(int i = 0; i < n; i++)
    {
 
        boolean[] visited = new boolean[256];
         
        for(int j = i; j < n; j++)
        {
            if (visited[str.charAt(j)] == true)
                break;
 
            else
            {
                res = Math.max(res, j - i + 1);
                visited[str.charAt(j)] = true;
            }
        }
        visited[str.charAt(i)] = false;
    }
    return res;
}

    public static void main(String args[]) {
        // Your code goes here
        String s = "Hello";
        Main ob = new Main();
        System.out.println(ob.lengthOfLongestSubstring(s));
    }
}