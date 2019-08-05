package Learning;

import org.testng.annotations.Test;

public class secondLowest {
    int[] arr  = {50,40,30,20,10};
    int low1= arr[0];
    int low2= arr[0];

    @Test
    public void secondLow(){
        for (int i=0;i<arr.length;i++){
            if (arr[i]<low1){
                low1 = arr[i];
            }
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=low1){
            if (arr[i]<low2){
                low2 = arr[i];
            }
            }
        }

    System.out.println(low1);
    System.out.println(low2);
    }

}
