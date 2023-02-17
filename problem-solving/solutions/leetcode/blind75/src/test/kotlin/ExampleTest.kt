import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import xyz.grind.coding.Example

class ExampleTest {
    private val utils = Example

    @Test
    fun `addUpTo should add up to x`() {
        assertEquals(utils.addUpTo(2), "4 is bigger than a pie")
    }

    @Test
    fun `check max recursive utility`() {
        assertEquals(utils.checkMax(Int.MAX_VALUE), 10)
        assertEquals(utils.checkMax(3), 20)
        assertEquals(utils.checkMax(0), 0)
    }

    @Test
    fun `should multiply matrix and store it in a map`() {

        val matrix = arrayOf(
            intArrayOf(31, 2, 3, 4),
            intArrayOf(93, 42, 74, 82),
            intArrayOf(1, 2, 3, 4),
            intArrayOf(1, 2, 3, 4)
        )

        assertEquals(
            utils.multiplyMatrixTemplate(matrix),
            mapOf(
                0 to Pair(0, 3),
                1 to Pair(1, 3),
                2 to Pair(2, 3),
            )
        )
    }

    @Test
    fun `should measure performance`() {
        assertFalse(utils.measureIterateTwoMillionTimesPerformance(10_000) == 50)
    }

    @Test
    fun `should check if an integer array contains duplicates`() {
        assertTrue(utils.containsDuplicate(intArrayOf(1, 2, 3, 4, 5, 6, 6, 6, 7)))
        assertFalse(utils.containsDuplicate(intArrayOf(1, 2, 3, 4, 5, 6, 7)))
    }

    @Test
    fun `should check if two strings are anagrams by sorting`() {
        assertTrue(utils.isAnagramSorted("thestring", "gnirtseht"))
        assertFalse(utils.isAnagramSorted("gnirtseht", "gnirtsehs"))
    }

    @Test
    fun `should check if two strings are anagrams by using a character array`() {
        assertFalse(utils.isAnagram("multiple", "mm"))
        assertTrue(utils.isAnagram("thestring", "gnirtseht"))
        assertFalse(utils.isAnagram("gnirtseht", "gnirtsehs"))
    }

    @Test
    fun `should check if two strings are anagrams by using alphabet character array`() {
        assertFalse(utils.isAnagramAlphabet("multiple", "mm"))
        assertTrue(utils.isAnagramAlphabet("thestring", "gnirtseht"))
        assertFalse(utils.isAnagramAlphabet("gnirtseht", "gnirtsehs"))
    }

    @Test
    fun `should find a target in a logarithmic time complexity`() {
        assertEquals(utils.searchRecursively(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 8), 7)
        assertEquals(utils.searchRecursively(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 9), 10), - 1)
    }

    @Test
    fun `should find a target in a logarithmic time complexity recursive implementation case`() {
        assertEquals(utils.recursiveSearch(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 8, 1, 10), 7)
    }

    @Test
    fun `should find a target in a logarithmic time complexity iterative`() {
        assertEquals(utils.search(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 2), 1)
        assertEquals(utils.search(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), 8), 7)
        assertEquals(utils.search(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 9), 10), - 1)
    }
}
