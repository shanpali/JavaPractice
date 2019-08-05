package hackerRank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class countingValleysTest {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        System.out.println("n : "+n);
        System.out.println("s : "+s);
        int count = 0;
        int total=0;
        char[] arr = s.toCharArray();

        for(int i=0; i<arr.length;i++){

                if(arr[i]=='D'){
                    count--;
                    if(count==-1){
                        total++;
                    }
                }else if(arr[i]=='U'){
                    count++;
                }

            }

return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = "DU";
        int n = s.length();

        int result = countingValleys(n, s);

        System.out.println(result);
    }
}

