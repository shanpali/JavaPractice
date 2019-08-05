package Examples;

import java.util.Arrays;

public class Solution {
    static String str = "(()()()()(()())";

    public static void longestValidParentheses(String s) {

        int n= 0;
        char[] str1 = str.toCharArray();
        System.out.println(Arrays.toString(str1));

        for(int i=0;i<str1.length;i++){
            char x = str1[i];
            if(x=='('){
                n=n+1;
            }
        }



    }

    public static void main(String[] args){
        longestValidParentheses(str);
    }

}