package Examples;

import org.testng.annotations.Test;

public class triangle2 {
    @Test
    public void triangle2() {
        for (int i = 3; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                if ( (i + j) % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }


            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                if ( (i + j) % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }


            }
            System.out.println();
        }
    }
}

