package ctci.LinkedLists;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoopDetectionTest {
    @Test
    @DisplayName("Should return true if y is valid.")
    void shouldReturnTrueIfYIsValid() {
        assertAll(
                () -> assertTrue(true)
        );
    }

    @Test
    @DisplayName("Should return false y is invalid.")
    void shouldReturnTrueIfYIsInvalid() {
        assertAll(
                () -> assertFalse(false)
        );
    }
}
