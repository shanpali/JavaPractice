package Examples.Sorting;

import org.testng.annotations.Test;

public class pattern2 {

//    12344321
//    123**321
//    12****21
//    1******1

    int num = 5;
    int n = 0;

    @Test
    public void printPattern() {


            for (int i = 1; i <= (num); i++) {

                for (int j = 1; j <= (num-n); j++) {
                    System.out.print(j);
                }

                for (int p=1; p<i;p++) {
                    System.out.print("**");
                }

                for (int j = (num-n); j >= 1; j--) {

                    System.out.print(j);
                }

                System.out.println("");
                n=n+1;
            }

        }



}
