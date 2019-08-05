package hackerRank;

public class birthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {
    int count = 0;

    int max = 0;


    for(int i=0; i<ar.length;i++){
        if(ar[i]>max){
            max = ar[i];
        }
    }

        for(int i=0; i<ar.length;i++){
            if(ar[i]==max){
                count++;
            }
        }


    return count;
    }



    public static void main(String[] args) {

        int[] ar={1,4,5,5,3};
        int result = birthdayCakeCandles(ar);
        System.out.println(result);
    }
}