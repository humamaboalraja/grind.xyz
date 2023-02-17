package blind75;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.grind.coding.blind75.TwoSum;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TwoSumTest {
    @Test
    @DisplayName("Should return array that contains two elements that sum up to target uf found these elements")
    void shouldReturnArrayWithTwoIntegersThatSumUpToTarget() {
        assertAll(
            () -> assertArrayEquals(TwoSum.twoSumBruteForce(new int[]{20,2,3,8,5,3}, 28), new int[]{0, 3}),
            () -> assertArrayEquals(TwoSum.twoSumBruteForce(new int[]{2,7,11,15}, 9), new int[]{0,1}),
            () -> assertArrayEquals(TwoSum.twoSumBruteForceTwo(new int[]{3,2,4}, 6), new int[]{1,2}),
            () -> assertArrayEquals(TwoSum.twoSumBruteForceTwo(new int[]{3,1,20,89}, 90), new int[]{1,3}),
            () -> assertArrayEquals(TwoSum.twoSum(new int[]{20,2,3,8,5,3}, 28), new int[]{0, 3}),
            () -> assertArrayEquals(TwoSum.twoSum(new int[]{2,7,11,15}, 9), new int[]{0,1}),
            () -> assertArrayEquals(TwoSum.twoSum(new int[]{3,2,4}, 6), new int[]{1,2}),
            () -> assertArrayEquals(TwoSum.twoSum(new int[]{3,1,20,89}, 90), new int[]{1,3})
        );
    }

    @Test
    @DisplayName("Should return null if no the array doesn't contain two numbers that sum up to target")
    void shouldReturnEmptyArrayIfNoTwoIntegersSumUpToTarget() {
        assertAll(
            () -> assertNull(TwoSum.twoSum(new int[]{20,2,3,8,5,3}, 1324)),
            () -> assertNull(TwoSum.twoSum(new int[]{2,7,11,15}, 4332)),
            () -> assertNull(TwoSum.twoSum(new int[]{3,2,4}, 87)),
            () -> assertNull(TwoSum.twoSum(new int[]{3,1,20,89}, 2434))
        );
    }

}

