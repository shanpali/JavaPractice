package Examples;

import org.testng.annotations.Test;

public class triangle5 {
    @Test
    public void triangle5() {
        int depth = 9;
        for (int i=0; i<depth;i++){
            for(int j=depth-i;j>0;j--){
                System.out.print(" ");
            }
            for(int p=0;p<=i;p++) {
                System.out.print(depth-p);
            }

            for(int p=1;p<=i;p++) {
                    System.out.print(depth-i+p);
            }

            System.out.println();
        }
    }
}

