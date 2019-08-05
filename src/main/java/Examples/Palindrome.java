package Examples;

public class Palindrome {

    static String str = "shefali";

    public void isPalindrome(String s){
        char[] ch = s.toCharArray();
        String ss = new String();

        for(int i =ch.length-1;i>=0;i--){
            ss = ss + ch[i];
        }

        if(s.equals(ss)){
            System.out.println("This is a palindrome");
        }else {
            System.out.println("This is not a palindrome");
        }
    }

    public static void main(String[] args) {
        Palindrome pl = new Palindrome();
        pl.isPalindrome(str);
    }


}
