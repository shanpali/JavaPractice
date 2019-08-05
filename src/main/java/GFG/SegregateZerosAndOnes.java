package GFG;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SegregateZerosAndOnes {

    int[] arr = {1,0,0,1,0,1,1,1,0,0,0,1,1};
    int[] temp = new int[arr.length];

    @Test
    public void test(){
        int lst = arr.length-1;
        int fst =0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==0){
                temp[fst]=arr[i];
                fst++;

            }
            if(arr[i]==1){
                temp[lst]=arr[i];
                lst--;

            }

        }
//    for (int i : temp) {
//      System.out.println(i);
//    }
    System.out.println(Arrays.toString(temp));
    }


}
