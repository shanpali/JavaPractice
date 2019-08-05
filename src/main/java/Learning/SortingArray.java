package Learning;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SortingArray {
    double[] arr = {19.3,12.1, 13.2,14.2,14.1,16.7};

    @Test
    public void sortDobleArray(){

        for (double db : arr ) {
            System.out.println(db);
        }

    Arrays.sort(arr);
        for (double db : arr ) {
            System.out.println(db);
        }
    }

}
