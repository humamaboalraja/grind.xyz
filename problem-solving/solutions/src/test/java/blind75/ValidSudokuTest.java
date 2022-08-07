package blind75;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.grind.coding.blind75.ValidSudoku;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidSudokuTest {

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

    char[][] secondSudokuBoard = new char[][]{
        {'5','3','.','.','7','.','.','.','5'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
    };

    char[][] thirdSudokuBoard = new char[][]{
        {'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','6'}
    };

    char[][] fourthSudokuBoard = new char[][]{
        {'7','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','.'}
    };

    @Test
    @DisplayName("Should return true if a 9 x 9 Sudoku board is valid.")
    void shouldReturnTrueIfSudokuBoardIsValid() {
        assertAll(
            () -> assertTrue(ValidSudoku.isValidSudoku(sudokuBoard)),
            () -> assertTrue(ValidSudoku.isValidSudokuHashSet(sudokuBoard))
        );
    }

    @Test
    @DisplayName("Should return false if a 9 x 9 Sudoku board is invalid with (Edge cases).")
    void shouldReturnFalseIfSudokuBoardIsInvalid() {
        assertAll(
            () -> assertFalse(ValidSudoku.isValidSudoku(secondSudokuBoard)),
            () -> assertFalse(ValidSudoku.isValidSudoku(thirdSudokuBoard)),
            () -> assertFalse(ValidSudoku.isValidSudoku(fourthSudokuBoard)),
            () -> assertFalse(ValidSudoku.isValidSudokuHashSet(secondSudokuBoard)),
            () -> assertFalse(ValidSudoku.isValidSudokuHashSet(thirdSudokuBoard)),
            () -> assertFalse(ValidSudoku.isValidSudokuHashSet(fourthSudokuBoard))
        );
    }
}
