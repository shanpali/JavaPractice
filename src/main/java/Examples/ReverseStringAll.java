package Examples;

public class ReverseStringAll {
    public static String str = "Shefali is chudel";

    public static void reverse(String str){

        char[] starr = str.toCharArray();

        for(int i=str.length()-1 ; i>=0;i--){
            System.out.print(starr[i]);

        }
    }

    public static void main(String[] args) {
        reverse(str);
    }
}
