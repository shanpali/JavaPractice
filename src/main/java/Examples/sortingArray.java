package Examples;

import java.util.Arrays;

public class sortingArray {
    static int[] arr = {0, 0, 1, 1};

    static int[] arr1 = new int[arr.length];

    public static void sortedArray(int[] arr) {

        for (int k = 0; k < arr.length-1; k++) {

            if(arr[k]<=arr[k+1]){
                arr1[k] = arr[k];
            }else{
                arr1[k]=arr[k+1];
            }


        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void main(String[] args) {
        sortedArray(arr);
    }
}