package Examples;

import java.util.Stack;

public class ReverseStrWithStack {

    static  String str = "Shefali pagal he";
    static int in = 555;

    public static void main(String[] args) {
//reverseString(str);
        reverseStringcharArr(str);
    }

    public static void reverseString(String str){

        Stack stk = new Stack();
        String[] starr = str.split(" ");

        for(int i = 0 ; i < starr.length ; i++){

            stk.push(starr[i]);
        }


       while(!stk.empty()){
           System.out.print(stk.pop());
           System.out.print(" ");

       }


    }

    public static void reverseStringcharArr(String str){

        Stack stk = new Stack();
        char[] starr = str.toCharArray();

        for(int i = 0 ; i < starr.length ; i++){

            stk.push(starr[i]);
        }
        stk.push(in);
        while(!stk.empty()){
            System.out.print(stk.pop());
            if(!stk.empty()&&stk.peek()==" "){
            System.out.print(" ");
            }

        }


    }

}
