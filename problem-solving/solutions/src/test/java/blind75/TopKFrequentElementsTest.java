package blind75;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.grind.coding.blind75.TopKFrequentElements;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TopKFrequentElementsTest {

    @Test
    @DisplayName("Should return the k most frequent elements")
    void shouldReturnTrueIfFoundDuplicates() {
        assertAll(
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElementsBruteForce(new int[]{1,1,1,2,2,3,9,9,9,9,9,10,10,10,10,10,10,10,10}, 4), new int[]{10, 9, 1, 2}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElementsBruteForce(new int[]{34243, 98798}, 2), new int[]{34243, 98798}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElementsBruteForce(new int[]{1,1,1,2,3,9,11,11}, 2), new int[]{1, 11}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElementsHeap(new int[]{1,1,1,2,2,3,9,9,9,9,9,10,10,10,10,10,10,10,10}, 4), new int[]{10, 9, 1, 2}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElementsHeap(new int[]{98798,34243}, 2), new int[]{98798, 34243}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElementsHeap(new int[]{1,1,1,2,3,9,11,11}, 2), new int[]{1, 11}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElements(new int[]{1,1,1,2,3,9,11,11}, 2), new int[]{1, 11}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElements(new int[]{1,1,1,2,2,3,9,9,9,9,9,10,10,10,10,10,10,10,10}, 4), new int[]{10, 9, 1, 2}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElements(new int[]{98798,34243}, 2), new int[]{98798, 34243}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElements(new int[]{9876543}, 1), new int[]{9876543})
        );
    }

    @Test
    @DisplayName("Should return the k most frequent elements (edge cases)")
    void shouldReturnFalseIfNoDuplicates() {
        assertAll(
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElementsBruteForce(new int[]{10}, 1), new int[]{10}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElementsBruteForce(new int[]{98798,34243}, 2), new int[]{98798, 34243}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElementsBruteForce(new int[]{1,1,1,2,3,9,11,11}, 2), new int[]{1, 11}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElementsHeap(new int[]{4}, 1), new int[]{4}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElementsHeap(new int[]{98798,34243}, 2), new int[]{98798, 34243}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElementsHeap(new int[]{1,1,1,2,3,9,11,11}, 2), new int[]{1, 11}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElements(new int[]{11}, 1), new int[]{11}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElements(new int[]{1,1,1,2,2,3,9,9,9,9,9,10,10,10,10,10,10,10,10}, 4), new int[]{10, 9, 1, 2}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElements(new int[]{98798,34243}, 2), new int[]{98798, 34243}),
            () -> assertArrayEquals(TopKFrequentElements.topKFrequentElements(new int[]{9876543}, 1), new int[]{9876543})
        );
    }

}
