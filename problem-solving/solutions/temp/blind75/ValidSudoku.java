package xyz.grind.coding.blind75;

import java.util.Arrays;
import java.util.HashSet;

public class ValidSudoku {

    public static void main(String[] args) {

        // Experimenting with the problem's data structures
        char[][] sudokuBoard = new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        HashSet<String>[] set = new HashSet[9];
        HashSet<String>[] setTwo = new HashSet[9];

        for(int i = 0; i < 9; i++) {
            set[i] = new HashSet<>();
            setTwo[i] = new HashSet<>();
        }
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                set[i].add("Something");
                setTwo[i].add("Something");
            }
        }

        System.out.println(Arrays.toString(set));
        System.out.println(Arrays.toString(setTwo));
        System.out.println(isValidSudokuHashSet(sudokuBoard));

    }

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

        /*
            Checking the structure after adding the board rows, columns, and sub-boxes

            System.out.println(Arrays.toString(rows));
            System.out.println(Arrays.toString(columns));
         */

        return true;

    }

}
