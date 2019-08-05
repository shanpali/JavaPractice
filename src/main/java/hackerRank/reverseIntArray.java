package hackerRank;

import org.testng.annotations.Test;

public class reverseIntArray {



@Test
    public void reverseArray() {

    int[] arr = {1, 2, 3, 4};
    int[] s = reverseArray(arr);

    for(int i=0;i<s.length;i++){
        System.out.print(s[i]);
    }

}
    public int[] reverseArray(int[] a) {
        int[] reverse = new int[a.length];
        int p = a.length-1;
        for (int i = a.length - 1; i >= 0; i--) {
            reverse[p-i] = a[i];
        }
        return reverse;
    }
}
