package xyz.grind.coding.easy

object ValidSudoku {

    // Commented to Improve test coverage for the solutions that matter
    //    @JvmStatic
    //    fun main(args: Array<String>) {
    //
    //        // Experimenting with the problem's data structures
    //        val sudokuBoard = arrayOf(
    //            charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
    //            charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
    //            charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
    //            charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
    //            charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
    //            charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
    //            charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
    //            charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
    //            charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    //        )
    //        val set: Array<HashSet<String>> = arrayOf(HashSet(9))
    //        val setTwo: Array<HashSet<String>> = arrayOf(HashSet(9))
    //        for (i in set.indices) {
    //            set[i] = HashSet()
    //            setTwo[i] = HashSet()
    //        }
    //        for (i in set.indices) {
    //            for (j in set.indices) {
    //                set[i].add("Something")
    //                setTwo[i].add("Something")
    //            }
    //        }
    //        println(set.contentToString())
    //        println(setTwo.contentToString())
    //        println(isValidSudokuHashSet(sudokuBoard))
    //    }

    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val seen = HashSet<String>()
        for (row in board.indices) {
            for (column in board.indices) {
                val currentVal = board[row][column]
                if (currentVal == '.') continue
                if (!seen.add("$currentVal Found in row $row") ||
                    !seen.add("$currentVal Found in column $column") ||
                    !seen.add(currentVal.toString() + " Found in sub-box " + row / 3 + " - " + column / 3)
                ) return false
            }
        }
        return true
    }

    fun isValidSudokuHashSet(board: Array<CharArray>): Boolean {
        val rows = Array(9) { HashSet<Char>() }
        val columns = Array(9) { HashSet<Char>() }
        val boxes = Array(9) { HashSet<Char>() }

        for (r in 0 until 9) {
            for (c in 0 until 9) {
                val currentValue = board[r][c]
                // this tells us the current square we're in
                val boxIndex = (r / 3) * 3 + (c / 3)
                if (currentValue == '.') continue
                if (rows[r].contains(currentValue) or
                    columns[c].contains(currentValue) or
                    boxes[boxIndex].contains(currentValue)
                ) return false
                rows[r].add(currentValue)
                columns[c].add(currentValue)
                boxes[boxIndex].add(currentValue)
            }
        }

        return true
    }
}
