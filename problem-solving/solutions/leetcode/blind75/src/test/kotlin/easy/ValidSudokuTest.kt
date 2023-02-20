package easy

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import xyz.grind.coding.easy.ValidSudoku

class ValidSudokuTest {

    private var sudokuBoard = arrayOf(
        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )

    private var secondSudokuBoard = arrayOf(
        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '5'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )

    private var thirdSudokuBoard = arrayOf(
        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '6')
    )

    private var fourthSudokuBoard = arrayOf(
        charArrayOf('7', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '.')
    )

    @Test
    fun `Should return true if a 9 x 9 Sudoku board is valid`() {
        Assertions.assertAll(
            Executable { assertTrue(ValidSudoku.isValidSudoku(sudokuBoard)) },
            Executable { assertTrue(ValidSudoku.isValidSudokuHashSet(sudokuBoard)) }
        )
    }

    @Test
    fun `Should return false if a 9 x 9 Sudoku board is invalid with (Edge cases)`() {
        Assertions.assertAll(
            Executable { assertFalse(ValidSudoku.isValidSudoku(secondSudokuBoard)) },
            Executable { assertFalse(ValidSudoku.isValidSudoku(thirdSudokuBoard)) },
            Executable { assertFalse(ValidSudoku.isValidSudoku(fourthSudokuBoard)) },
            Executable { assertFalse(ValidSudoku.isValidSudokuHashSet(secondSudokuBoard)) },
            Executable { assertFalse(ValidSudoku.isValidSudokuHashSet(thirdSudokuBoard)) },
            Executable { assertFalse(ValidSudoku.isValidSudokuHashSet(fourthSudokuBoard)) }
        )
    }
}
