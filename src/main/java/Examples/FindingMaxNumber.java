package Examples;

import java.util.Arrays;

public class FindingMaxNumber {
    
    static int[] arr = {60, 546, 54, 78, 6 ,96, 599, 34,87,23,12};
    private static int maxNum;
    static String str;

    public static void returnMax(int[] arr){
        int max = 0;
        int x = 0;
        int y = 0;
        int index = 0;
        int[] gg = new int[arr.length];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for(int i=0;i<arr.length;i++) {
            x = arr[i];
            for(int j=0;j<arr.length;j++){

                    y = arr[j];
                    if (y == gg[i]) {
                        y = arr[j + 1];
                    }


                if(singleNumber(x)>singleNumber(y)) {
                    y=x;

                }else{
                    x=y;

                }
                gg[i] = x;
            }

            System.out.print(x);




        }
        System.out.println(Arrays.toString(gg));


    }

    public static int singleNumber(int num){

        if (num < 10) {
            maxNum = num;
        } else {
            num = num / 10;
            if (num > 10) {
                num = num / 10;
            }
            maxNum=num;
        }
        return maxNum;
    }
    
    public static void main(String[] args) {
        returnMax(arr);
//        System.out.println(singleNumber(9));
    }
    
    
}
