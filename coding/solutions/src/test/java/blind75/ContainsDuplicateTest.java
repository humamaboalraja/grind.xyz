package blind75;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.grind.coding.blind75.ContainsDuplicate;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {

    @Test
    @DisplayName("Should return true if found duplicates in various inputs")
    void shouldReturnTrueIfFoundDuplicates() {
        assertAll(
            () -> assertTrue(ContainsDuplicate.containsDuplicate(new int[]{1,2,3,1})),
            () -> assertTrue(ContainsDuplicate.containsDuplicate(new int[]{2,2,3,3})),
            () -> assertTrue(ContainsDuplicate.containsDuplicate(new int[]{3,3,3,3})),
            () -> assertTrue(ContainsDuplicate.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2})),
            () -> assertTrue(ContainsDuplicate.containsDuplicateBruteForce(new int[]{1,1,1,3,3,4,3,2,4,2})),
            () -> assertTrue(ContainsDuplicate.containsDuplicateSorting(new int[]{2,2,3,3})),
            () -> assertTrue(ContainsDuplicate.containsDuplicateSorting(new int[]{1,1,1,3,3,4,3,2}))
        );
    }

    @Test
    @DisplayName("Should return false if it there's no duplicates a simple assertion")
    void shouldReturnFalseIfNoDuplicates() {
        assertAll(
            () -> assertFalse(ContainsDuplicate.containsDuplicate(new int[]{1,2,3,4})),
            () -> assertFalse(ContainsDuplicate.containsDuplicate(new int[]{2,49,1,9})),
            () -> assertFalse(ContainsDuplicate.containsDuplicate(new int[]{4,11,34,5})),
            () -> assertFalse(ContainsDuplicate.containsDuplicateBruteForce(new int[]{13,43,24,2})),
            () -> assertFalse(ContainsDuplicate.containsDuplicateSorting(new int[]{1,2,3,4})),
            () -> assertFalse(ContainsDuplicate.containsDuplicateSorting(new int[]{10,46,51,66,91,35,76}))
        );
    }

}
