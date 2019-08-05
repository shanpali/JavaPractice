package hackerRank;

public class RepeatedString {

    static long repeatedString(String s, long n) {

        int sL= s.length();
        long mod = 0;
        long count = 0;

        char[] carr = s.toCharArray();

        for(int i =0; i<sL; i++){
            if(carr[i]=='a'){
                count++;
            }
        }
        long div = (long)(n/s.length());
        count = count*div;
        mod = n%sL;

        for(int i =0; i<mod; i++){
            if(carr[i]=='a'){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "a";
        long n = 100000000;

        long result = repeatedString(s, n);
        System.out.println(result);
    }

}
