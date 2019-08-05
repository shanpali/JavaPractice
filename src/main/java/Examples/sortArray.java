package Examples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sortArray {
    static int arr[] = {5, 4, 6, 2, 1, 3, 8, 9, -1};
    static int k = 4;
//    Output: 2 4 5 6 9 8 3 1 -1

    public static void printInOrder(int[] arr){
        int[] arr1 = Arrays.copyOfRange(arr,0,k);
        int[] arr2 = Arrays.copyOfRange(arr,k,arr.length);

        System.out.println("arr1 is "+Arrays.toString(arr1));
        System.out.println("arr2 is "+Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("sorted arr1 is "+Arrays.toString(arr1));
        System.out.println("sorted arr2 is "+Arrays.toString(arr2));

        int arr2length = arr2.length;
        System.out.println(arr2length);
        for (int i=0;i<arr.length;i++){

            if(i<k){
                arr[i] = arr1[i];
            }else {
                arr[i] = arr2[arr2length - 1];
                arr2length--;
            }



        }
        System.out.println(Arrays.toString(arr));

    }



    public static void main(String[] args) {

        printInOrder(arr);

    }

//    Simple approach

//
//    // Java program to sort first k elements
//// in increasing order and remaining
//// n-k elements in decreasing
//import java.util.*;
//
//    public class SortExample {
//        static void printOrder(Integer[] arr, int k)
//        {
//            int n = arr.length;
//
//            // Sort first k elements in ascending order
//            Arrays.sort(arr, 0, k);
//
//            // Sort remaining n-k elements in descending order
//            Arrays.sort(arr, k, n, Collections.reverseOrder());
//        }
//
//        public static void main(String[] args)
//        {
//            // Our arr contains 8 elements
//            Integer[] arr = { 5, 4, 6, 2, 1, 3, 8, 9, -1 };
//            int k = 4;
//            printOrder(arr, k);
//            System.out.printf("%s",Arrays.toString(arr));
//        }
//    }


}
