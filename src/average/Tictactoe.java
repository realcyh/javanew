package average;

import java.util.Scanner;

public class Tictactoe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SIZE = 3;
        int[][] board = new int [SIZE][SIZE];
        int numOf0 = 0;
        int numOf1 = 0;
        boolean result = false;
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                board[i][j] = in.nextInt();
            }
        }

        // check row
        for (int i=0; i<board.length; i++) {
            numOf0 = 0;
            numOf1 = 0;
            for (int j=0; j<board[i].length; j++) {
                if (board[i][j]==0) {
                    numOf0++;
                } else {
                    numOf1++;
                }
            }
            if (numOf0==SIZE || numOf1==SIZE) {
                result = true;
                break;
            }
        }

        // check column
        if (!result) {
            for (int i = 0; i < board.length; i++) {
                numOf0 = 0;
                numOf1 = 0;
                for (int j = 0; j < board[i].length; j++) {
                    if (board[j][i] == 0) {
                        numOf0++;
                    } else {
                        numOf1++;
                    }
                }
                if (numOf0 == SIZE || numOf1 == SIZE) {
                    result = true;
                    break;
                }
            }
        }

        // check diagonal
        if (!result) {
            numOf0 = 0;
            numOf1 = 0;
            for(int i=0; i<board.length; i++) {
                if (board[i][i]==0) {
                    numOf0++;
                } else {
                    numOf1++;
                }
            }
            if (numOf0 == SIZE || numOf1 == SIZE) {
                result = true;
            }
        }

        // check re-diagonal
        if (!result) {
            numOf0 = 0;
            numOf1 = 0;
            for (int i=0; i<board.length; i++) {
                if (board[i][SIZE-i-1]==0) {
                    numOf0++;
                } else {
                    numOf1++;
                }
            }
            if (numOf0 == SIZE || numOf1 == SIZE) {
                result = true;
            }
        }

        System.out.println(result);
        if (result) {
            if (numOf0==SIZE) {
                System.out.println("0 wins");
            } else {
                System.out.println("1 wins");
            }
        }


    }
}
