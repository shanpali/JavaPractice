package Examples;


public class ReverseStringForSpaces {
    public static String str = "Shefali is chudel";

    public static void reverse(String str){

        String[] starr = str.split(" ");
        for(int i=starr.length-1 ; i>=0;i--){
            System.out.print(starr[i]);
            System.out.print(" ");

        }
    }

    public static void Second(String str){
      char[] arrr = str.toCharArray();
      for(int i =arrr.length-1;i>0;i--){
      System.out.print(arrr[i]);
      }
    }

    public static void main(String[] args) {

        Second(str);
    System.out.println("\n");
        reverse(str);
    }
}
