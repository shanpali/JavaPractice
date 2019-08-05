package Examples;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

//@Listeners(UI.Listner_test.class)
public class PairSum {

    int[] arr = {2, 4, 5, 6, 3, 7, 8, 11, 44, 33, 1};
    int sum = 5;
    @Test
    public void findPairs() {
    Boolean flag=false;
        for (int i = 0; i < arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    flag=true;
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                }
            }
        }
        if(!flag)
        System.out.println("No such pair");
    }
    
    @Test
    public void sumOfpairs(){
        int arr[] = {2,1,5,7,9,3,8,18,66};
        int key = 9;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++) {
            if (!map.containsKey(key - arr[i])) {
                map.put(arr[i], 0);
            } else {
                map.put(arr[i], key - arr[i]);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()!=0) {
                System.out.println(entry.getValue() + " " + entry.getKey());
            }
        }
    }
}
