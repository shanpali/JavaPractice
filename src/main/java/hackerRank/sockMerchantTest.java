package hackerRank;

import java.io.IOException;
import java.util.Arrays;

public class sockMerchantTest {



    public static void main(String[] args) {
        int n = 0;
        int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3 };
        n = ar.length;

        int result = sockMerchant(n, ar);

        System.out.println(result);
    }


    static int sockMerchant(int n, int[] ar) {
        int count = 0;
        Arrays.sort(ar);
        for(int i=0;i<n-1;i++){
            if(ar[i]==ar[i+1]){
                count++;
                i++;
            }
            if(i==n){
                return count;
            }
        }
        return count;
    }

}
