package blind75;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.grind.coding.blind75.ProductExceptSelf;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ProductExceptSelfTest {

    @Test
    @DisplayName("Should return return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i]")
    void shouldReturnTrueIfFoundDuplicates() {
        assertAll(
            () -> assertArrayEquals(ProductExceptSelf.productOfArrayExceptSelfBruteForce(new int[]{2,3,4,5,6}), new int[]{360, 240, 180, 144, 120}),
            () -> assertArrayEquals(ProductExceptSelf.productExceptSelfLeftRightProducts(new int[]{3493,324,1234,987}), new int[]{394618392, -40640002, 1117019484, 1396557288}),
            () -> assertArrayEquals(ProductExceptSelf.productExceptSelfLeftRightProducts(new int[]{3493,324,1234,987,-1,-9}), new int[]{-743401768, -365760018, 1463240764, -315886296, -1752838456, 282458760}),
            () -> assertArrayEquals(ProductExceptSelf.productExceptSelfLeftRightProducts(new int[]{-1,1,0,-5,5}), new int[]{0, 0, 25, 0, 0}),
            () -> assertArrayEquals(ProductExceptSelf.productExceptSelf(new int[]{2,3,4,5,6}), new int[]{360, 240, 180, 144, 120}),
            () -> assertArrayEquals(ProductExceptSelf.productExceptSelf(new int[]{3493,3124,1234,987}), new int[]{-490066504, -40640002, -2114627604, 580669000}),
            () -> assertArrayEquals(ProductExceptSelf.productExceptSelf(new int[]{3493,324,1234,987,-1,-9}), new int[]{-743401768, -365760018, 1463240764, -315886296, -1752838456, 282458760}),
            () -> assertArrayEquals(ProductExceptSelf.productExceptSelf(new int[]{-1,1,0,-5,5}), new int[]{0, 0, 25, 0, 0})
        );
    }

}
