package easy

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import xyz.grind.coding.easy.TwoSum

class TwoSumTest {
    @Test
    fun `Should return array that contains two elements that sum up to target uf found these elements`() {
        Assertions.assertAll(
            Executable {
                assertArrayEquals(TwoSum.twoSumBruteForce(intArrayOf(20, 2, 3, 8, 5, 3), 28), intArrayOf(0, 3))
            },
            Executable {
                assertArrayEquals(TwoSum.twoSumBruteForce(intArrayOf(2, 7, 11, 15), 9), intArrayOf(0, 1))
            },
            Executable {
                assertArrayEquals(TwoSum.twoSumBruteForceTwo(intArrayOf(3, 2, 4), 6), intArrayOf(1, 2))
            },
            Executable {
                assertArrayEquals(TwoSum.twoSumBruteForceTwo(intArrayOf(3, 1, 20, 89), 90), intArrayOf(1, 3))
            },
            Executable {
                assertArrayEquals(TwoSum.twoSum(intArrayOf(20, 2, 3, 8, 5, 3), 28), intArrayOf(0, 3))
            },
            Executable {
                assertArrayEquals(TwoSum.twoSum(intArrayOf(2, 7, 11, 15), 9), intArrayOf(0, 1))
            },
            Executable {
                assertArrayEquals(TwoSum.twoSum(intArrayOf(3, 2, 4), 6), intArrayOf(1, 2))
            },
            Executable {
                assertArrayEquals(TwoSum.twoSum(intArrayOf(3, 1, 20, 60), 80), intArrayOf(2, 3))
            }
        )
    }

    @Test
    fun `Should return zero if no the array doesn't contain two numbers that sum up to target`() {
        Assertions.assertAll(
            Executable {
                assertEquals(TwoSum.twoSum(intArrayOf(20, 2, 3, 8, 5, 3), 1324)[0], 0)
            },
            Executable {
                assertEquals(TwoSum.twoSum(intArrayOf(2, 7, 11, 15), 4332)[0], 0)
            },
            Executable {
                assertEquals(TwoSum.twoSum(intArrayOf(3, 2, 4), 87)[0], 0)
            },
            Executable {
                assertEquals(TwoSum.twoSum(intArrayOf(3, 1, 20, 89), 2434)[0], 0)
            }
        )
    }

    @Test
    fun `Should check handling edge cases`() {
        Assertions.assertAll(
            Executable {
                assertArrayEquals(TwoSum.twoSumBruteForce(intArrayOf(), 0), intArrayOf())
            },
            Executable {
                assertArrayEquals(TwoSum.twoSumBruteForceTwo(intArrayOf(), 0), intArrayOf())
            }
        )
    }
}
