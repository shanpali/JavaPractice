package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromArray {
    static int[] arr = {2,3,1,3,21,2};

    public static void main(String[] args) {
        removeDup(arr);
    }

    public static void removeDup(int[] arr){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i =0; i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],0);
            }else{
                int value  = map.get(arr[i]);
                map.put(arr[i], value+1);
            }
        }

        for (Map.Entry<Integer, Integer> mp : map.entrySet() ) {
            int i = mp.getKey();
            if(mp.getValue()>0){
        System.out.println(i+" is duplicate");
            }
        }
    }
}
