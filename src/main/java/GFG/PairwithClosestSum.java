package GFG;

import org.testng.annotations.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PairwithClosestSum {
    int[] arr = {2,5,7,3,8,9,11,14,10};
    int sum = 32;
    Map<String, Integer> items = new HashMap<>();

    @Test
    public void test(){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int diff = (sum-(arr[i]+arr[j]));
                items.put(""+arr[i]+" and "+arr[j],Math.abs(diff));
            }
        }
        int minValueInMap=(int) Collections.min(items.values());
        items.forEach(
                (k, v) -> {
                    if (v == minValueInMap) {
                        System.out.println(k+" is having closest sum to :" +sum);
                    }
                });
    }

}
