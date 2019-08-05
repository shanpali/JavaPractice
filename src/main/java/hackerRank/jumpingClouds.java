package hackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class jumpingClouds {



    static int jumpingOnClouds(int[] arr) {
        int n = arr.length;

        int[] temp = new int[n];
        for (int i = 1; i < n; i++) {
            if (arr[i] == 1) temp[i] = 1 << 29;
            temp[i] = 1 << 29;
            if (i >= 1 && arr[i-1] == 0) {
                temp[i] = Math.min(temp[i], temp[i-1]+1);
            }
            if (i >= 2 && arr[i-2] == 0){
                temp[i] = Math.min(temp[i], temp[i-2]+1);
            }
        }
        return (temp[n-1]);
    }


    public static void main(String[] args) throws IOException {
        int[] arr = {0, 0, 1, 0, 0, 1, 0,0,0,1,0,1,0,0,0,1};
        int result = jumpingOnClouds(arr);
        System.out.println(result);
    }
}
