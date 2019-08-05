package Examples.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeSortExample {


    public static void main(String[] args) {
        int[] arr = {6,2,3,5,8,9,6,4};
        int n = arr.length;
        if(n<=1){
            return;
        }else{
            mergeSort(arr);
            System.out.println(Arrays.toString(arr));
        }


    }

    public static void mergeSort(int[] arr){
        int mid = 0;
        int n = arr.length;
        int[] temp = new int[n];
        if(n<=1){
            return;
        }
        mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for (int i=0; i<mid;i++){
                left[i] = arr[i];
        }
        for (int i=mid; i<n;i++){
            right[i-mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(left,right,arr);


    }

    public static void merge(int[] left, int[] right, int[] arr){
        int i = 0,j =0,k = 0;
        int n = arr.length;
        int[] temp = new int[n];
        int nL = left.length;
        int nR = right.length;

while (i <nL && j < nR) {
    if (left[i] < right[j]) {
        temp[k] = left[i];
        i = i + 1;
    } else if (right[j] < left[i]) {
        temp[k] = right[j];
        j = j + 1;
    }
    k = k+1;
}

            while (i<nL){
                temp[k] = left[i];
                i = i+1;
                k = k+1;
            }
        while (j<nR){
            temp[k] = right[j];
            j = j+1;
            k = k+1;
        }

        for(int x=0;x<arr.length;x++){
            System.out.println(temp[x]);

        }


    }

}
