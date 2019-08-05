package Examples;

import org.testng.annotations.Test;

public class triangle4 {
    @Test
    public void triangle4() {
        int depth = 15;

        for (int i=1; i<=depth;i++){
            for(int p=1;p<=i;p++) {
                System.out.print(" ");
            }
            for(int j=(depth-i)*2;j>0;j--){
                System.out.print("M");
            }
            for(int p=1;p<=i;p++) {
                System.out.print(" ");
            }
            for(int p=1;p<=i;p++) {
                System.out.print(" ");
            }
            for(int j=(depth-i)*2;j>0;j--){
                System.out.print("O");
            }
            System.out.println();
        }
        for (int i=1; i<=depth-1;i++){
            for(int j=depth-i;j>0;j--){
                System.out.print(" ");
            }
            for(int p=1;p<=i*2;p++) {
                System.out.print("N");
            }
            for(int j=(depth-i)*2;j>0;j--){
                System.out.print(" ");
            }
            for(int p=1;p<=i*2;p++) {
                System.out.print("I");
            }
            System.out.println();
        }
    }
}

