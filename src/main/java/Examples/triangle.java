package Examples;

import org.testng.annotations.Test;

public class triangle {
    @Test
    public void triangle() {
        for (int i = 0; i < 3; i++) {
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

