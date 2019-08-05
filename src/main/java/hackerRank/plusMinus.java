package hackerRank;

public class plusMinus {




    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
double nL = arr.length;
double p = 0;
double n = 0;
double z = 0;

for(int i=0;i<arr.length;i++){
    if(arr[i]==0){
        z++;
    }else if(arr[i]>0){
        p++;
    }else if(arr[i]<0){
        n++;
    }
}


p = p/nL;
n = n/nL;
z = z/nL;

        System.out.format("%.6f", p);
        System.out.println();
        System.out.format("%.6f", n);
        System.out.println();
        System.out.format("%.6f", z);


    }


    public static void main(String[] args) {
int[] arr = {-4,-3,3,5,6,0,0,2,0};
        plusMinus(arr);

    }
}
