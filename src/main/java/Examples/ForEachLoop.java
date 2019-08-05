package Examples;

import java.util.Arrays;

public class ForEachLoop {

    static int[] arr = {4,324,23,423,423,4,2343,24,23,423,423,32,3,2323,343,43,43,43,4,34,34,3,4};
    public static void main(String[] args) {
        Arrays.sort(arr, 4,10);
        for(int i:arr) {
                System.out.println("sorted array from 4 to 10 : " + i);
        }

        Arrays.sort(arr);
        for(int i:arr) {
            System.out.println("sorted array : " + i);
        }

        int index = Arrays.binarySearch(arr, 34);
        System.out.println("position of "+34+" in array is "+index);


    }
}
