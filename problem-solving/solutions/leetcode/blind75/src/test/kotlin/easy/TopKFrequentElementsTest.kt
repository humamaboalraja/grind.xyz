package easy

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import xyz.grind.coding.easy.TopKFrequentElements

class TopKFrequentElementsTest {
    @Test
    fun `Should return the k most frequent elements`() {
        Assertions.assertAll(
            Executable {
                assertArrayEquals(
                    TopKFrequentElements.topKFrequentElementsHeap(
                        intArrayOf(1, 1, 1, 2, 2, 3, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10),
                        4), intArrayOf(10, 9, 1, 2)
                )
            },
            Executable {
                assertArrayEquals(
                    TopKFrequentElements.topKFrequentElementsHeap(
                        intArrayOf(98798, 34243),
                        2
                    ), intArrayOf(98798, 34243)
                )
            },
            Executable {
                assertArrayEquals(
                    TopKFrequentElements.topKFrequentElementsHeap(
                        intArrayOf(1, 1, 1, 2, 3, 9, 11, 11),
                        2
                    ), intArrayOf(1, 11)
                )
            },
            Executable {
                assertArrayEquals(
                    TopKFrequentElements.topKFrequentElements(
                        intArrayOf(1, 1, 1, 2, 3, 9, 11, 11), 2
                    ), intArrayOf(1, 11)
                )
            },
            Executable {
                assertArrayEquals(
                    TopKFrequentElements.topKFrequentElements(
                        intArrayOf(1, 1, 1, 2, 2, 3, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10), 4),
                        intArrayOf(10, 9, 1, 2)
                )
            },
            Executable {
                assertArrayEquals(
                    TopKFrequentElements.topKFrequentElements(
                        intArrayOf(98798, 34243), 2), intArrayOf(34243, 98798)
                )
            },
            Executable {
                assertArrayEquals(
                    TopKFrequentElements.topKFrequentElements(intArrayOf(9876543), 1), intArrayOf(9876543)
                )
            }
        )
    }

    @Test
    fun `Should return the k most frequent elements (edge cases)`() {
        Assertions.assertAll(
            Executable {
                assertArrayEquals(
                    TopKFrequentElements.topKFrequentElementsHeap(intArrayOf(4), 1), intArrayOf(4))

            },
            Executable {
                assertArrayEquals(
                    TopKFrequentElements.topKFrequentElementsHeap(intArrayOf(98798, 34243), 2), intArrayOf(98798, 34243))
            },
            Executable {
                assertArrayEquals(
                    TopKFrequentElements.topKFrequentElementsHeap(
                        intArrayOf(1, 1, 1, 2, 3, 9, 11, 11), 2), intArrayOf(1, 11))
            },
            Executable {
                assertArrayEquals(
                    TopKFrequentElements.topKFrequentElements(
                        intArrayOf(11), 1), intArrayOf(11))
            },
            Executable {
                assertArrayEquals(
                    TopKFrequentElements.topKFrequentElements(
                        intArrayOf(1, 1, 1, 2, 2, 3, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10), 4
                    ), intArrayOf(10, 9, 1, 2)
                )
            },
            Executable {
                assertArrayEquals(
                    TopKFrequentElements.topKFrequentElements(intArrayOf(98798, 34243), 2), intArrayOf(34243, 98798)
                )
            },
            Executable {
                assertArrayEquals(
                    TopKFrequentElements.topKFrequentElements(intArrayOf(9876543), 1), intArrayOf(9876543))
            }
        )
    }
}
