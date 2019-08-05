package Examples;

import java.io.StringWriter;
import java.util.Arrays;

public class Anagram {

    static String str1 = "Stressed";
    static String str2 = "Desserts";
    boolean status=true;

    public void checkkAna(){

     if(str1!=str2){
         status=false;
     }

     else {
         char[] newstr1 = str1.toLowerCase().toCharArray();
         Arrays.sort(newstr1);
         char[] newstr2 = str2.toLowerCase().toCharArray();
         Arrays.sort(newstr2);
         status = Arrays.equals(newstr1, newstr2);
     }
        if(status==true){
            System.out.println("is anagram");
        }
        else {
            System.out.println("not anagram");
        }
    }



    public void checkAnagram(String str11, String str22){

    char[] ch1 = str11.toCharArray();
    char[] ch2 = str22.toCharArray();
    int a1 = 0;
    int a2 = 0;

    if(ch1.length!=ch2.length){
        System.out.println("Not an anagram");
    }else{

    for (int i=0;i<ch1.length;i++){
        a1 = a1+(int) ch1[i];
        a2 = a2+(int) ch2[i];
    }

        System.out.println("a1 value is :"+a1 +" and a2 : "+a2);
        if (a1==a2){
            System.out.println("This is an ANAGRAM");
        }else{
            System.out.println("Not an anagram");
        }
    }
}

    public static void main(String[] args) {
    Anagram an = new Anagram();
    an.checkAnagram(str1,str2);
//    an.checkkAna();


    }


}
