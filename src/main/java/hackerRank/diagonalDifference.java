package hackerRank;
import java.io.IOException;
public class diagonalDifference {

    static int diagonalDifference(int[][] arr) {

int dia1=0;
int dia2=0;

for(int i = 0; i<arr.length;i++){
    for(int j=0; j<arr.length;j++){

        if(i==j){
            dia1 = (dia1+(arr[i][j]));

        }
        if(i+j==(arr.length-1)){
            dia2 = (dia2+(arr[i][j]));

        }

    }

}
return Math.abs(dia1-(dia2));
    }


    public static void main(String[] args) throws IOException {

        int[][] arr = {{11,2,4},{4,5,6},{10,8,-12}};

        int result = diagonalDifference(arr);
        System.out.println(result);
    }
}
