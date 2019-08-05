package Learning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class conflictingAppoitnments {

    static int[][] board = {{6, 9}, {2, 5}, {1, 6}, {4, 8}, {3, 9}, {1, 5}, {7, 9},{8,11},{11,12}};
    Map<Integer, Integer> mp = new HashMap<>();
    int low=board[0][0], high = 1;

    public void printArray(){

    for (int row = 0; row < board.length; row++) {
      low = board[row][0];
      high = board[row][1];
      for (int i = low; i <= high; i++) {
        if (!mp.containsKey(i)) {
          mp.put(i, 0);
        } else {
          int value = mp.get(i);
          mp.put(i, value + 1);
        }
      }
    }
        System.out.println(Arrays.toString(mp.entrySet().toArray()));
    }

    public static void main(String[] args) {
        conflictingAppoitnments c= new conflictingAppoitnments();
        c.printArray();
    }

}
