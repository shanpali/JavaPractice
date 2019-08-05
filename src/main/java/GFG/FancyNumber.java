package GFG;

import org.testng.annotations.Test;

public class FancyNumber {
    String input = "7804569976";
    char[] arr = input.toCharArray();

    @Test
    public void test(){
        for(int i=0;i<=arr.length-3;i++){
            if(arr[i]==arr[i+1] && arr[i+1]==arr[i+2]){
        System.out.println("Number is a fancy number as :" +arr[i]+ " has 3 consecutive occurances");

            }

            if(arr[i+1]==arr[i]+1 && arr[i+2]==arr[i+1]+1){
                System.out.println("Number is a fancy number as we have numbers in incrementing order :" +arr[i]+" "+arr[i+1]+" "+arr[i+2]);

            }

        }
    }

}
