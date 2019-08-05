package GFG;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class distinctPairFromTwoArrays {
    int[] arr1 = {2,4,6,8,12,14};
    int[] arr2 = {3,5,7,12,8,9};

//    o/p = {8,8),{12,3}.{14,5}
    // Sum of   both the values in a pair should be same
    Map<String,Integer> map = new HashMap();
    @Test
    public void test(){

        for(int i=0;i<arr1.length;i++){

            for(int j=0;j<arr2.length;j++){

                if(arr1[i]/10==0){
                    if(arr1[i]==arr2[j]){
                        map.put(arr1[i]+"",arr2[j]);
                    }
                }else if((arr1[i]/10)+(arr1[i]%10)==arr2[j]){
                    map.put(arr1[i]+"",arr2[j]);
                }else if((arr2[j]/10)+(arr2[j]%10)==arr1[i]){
                    map.put(arr1[i]+"",arr2[j]);
                }

            }
        }
        if(map.isEmpty()){
            System.out.println("No pair exists");
        }else{
            map.forEach((k,v)->System.out.println(k + " : " + v));
        }

    }


}
