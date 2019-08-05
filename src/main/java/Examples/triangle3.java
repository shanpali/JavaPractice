package Examples;

import org.testng.annotations.Test;

public class triangle3 {
    @Test
    public void triangle3() {
        int depth = 8;

        for (int i=1; i<=depth;i++){
            for(int p=1;p<=i;p++) {
                System.out.print(" ");
            }
            for(int j=(depth-i)*2;j>0;j--){
                System.out.print("y");
            }
            for(int p=1;p<=i;p++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=1; i<=depth-1;i++){
            for(int j=depth-i;j>0;j--){
                System.out.print(" ");
            }
            for(int p=1;p<=i*2;p++) {
                System.out.print("*");
            }
            for(int j=depth-i;j>0;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

