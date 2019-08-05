package GFG;

import java.util.Stack;

public class BalancedParanthesis {

    static String s = "{{[([]())]}}";

    public void checkForBalance(String s){

        char[] ch = s.toCharArray();
        Stack stk = new Stack();

        for(int i=0; i<ch.length;i++){

            if(ch[i]=='{' || ch[i]=='[' || ch[i]=='('){
                stk.push(ch[i]);

            }else if((ch[i]=='}' && stk.peek().equals('{')) || (ch[i]==']' && stk.peek().equals('[')) || (ch[i]==')'  && stk.peek().equals('('))){
                stk.pop();
            }

        }
        Boolean flag = stk.isEmpty();
        if(flag){
            System.out.println("Given String is balanced");
        }else{
            System.out.println("Given String is not balanced");
        }
    }

    public static void main(String[] args) {
        BalancedParanthesis bl = new BalancedParanthesis();
        bl.checkForBalance(s);
    }

}
