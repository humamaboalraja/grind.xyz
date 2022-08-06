package xyz.grind.coding.blind75;

import java.util.Arrays;
import java.util.HashSet;

public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board){

        HashSet<String> seen = new HashSet<String>();
        for(int row = 0; row < board.length; row++) {
            for(int column = 0; column < board.length; column++) {
                char currentVal = board[row][column];
                if(currentVal == '.') continue;
                if(!seen.add(currentVal + " Found in row " + row) ||
                   !seen.add(currentVal + " Found in column " + column) ||
                   !seen.add(currentVal + " Found in sub-box " + row/3 + " - " + column/3)) return false;
                }
            }
        return true;
    }

    public static boolean isValidSudokuHashSet(char[][] board) {

        int boardLength = 9;
        HashSet<Character>[] rows = new HashSet[boardLength];
        HashSet<Character>[] columns = new HashSet[boardLength];
        HashSet<Character>[] boxes = new HashSet[boardLength];

        for(int i = 0; i < boardLength; i++) {
            rows[i] = new HashSet<>();
            columns[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int r = 0; r < boardLength; r++) {
            for(int c = 0; c < boardLength; c++) {
                char currentValue = board[r][c];
                if(currentValue == '.') continue;

                if(rows[r].contains(currentValue)) return false;
                rows[r].add(currentValue);

                if(columns[c].contains(currentValue)) return false;
                columns[c].add(currentValue);

                // this tells us the current square we're in
                int boxIndex = (r / 3) * 3 + (c / 3);
                if(boxes[boxIndex].contains(currentValue)) return false;
                boxes[boxIndex].add(currentValue);

            }
        }

        return true;

    }

}
