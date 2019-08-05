package Examples;

import org.testng.annotations.Test;

public class NextBigNumber {
    int[] arr = {2,4,6,69,3,1,7,33,22,55,44,13};


    @Test
    public void printNextBigNumber(){
        boolean flag=false;

        for(int i =0;i<arr.length;i++){
            flag=false;
            for(int j =i+1;j<arr.length;j++){

                if(arr[j]>arr[i]){
                    System.out.println(arr[i]+":"+arr[j]);
                    flag=true;
                    break;
                }
            }
            if(!flag) {
                System.out.println(arr[i] + ":" + "-1");
            }






        }
    }

}
