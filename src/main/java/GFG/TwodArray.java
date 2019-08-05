package GFG;

public class TwodArray {

    static int[][] board = {{1, 3}, {2, 5}, {1, 6}, {4, 8}, {3, 9}, {1, 5}, {7, 9}};

    public void printArray(){
        for(int row = 0; row < board.length;row++){
            for(int col = 0; col<board[row].length;col++){
                System.out.println(board[row][col]);
            }
        }
    }

    public static void main(String[] args) {
        TwodArray c= new TwodArray();
        c.printArray();
    }

}
