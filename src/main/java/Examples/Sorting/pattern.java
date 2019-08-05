package Examples.Sorting;

import org.testng.annotations.Test;

public class pattern {

//    1
//    2*2
//    3*3*3
//    4*4*4*4
//    4*4*4*4
//    3*3*3
//    2*2
//    1
    int num = 5;

    @Test(invocationCount = 5)
    public void printPattern() {

            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {

                    System.out.print(i);
                    if (j < i) {
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }

            for (int i = num; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {

                    System.out.print(i);
                    if (j < i) {
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }
        }



}
