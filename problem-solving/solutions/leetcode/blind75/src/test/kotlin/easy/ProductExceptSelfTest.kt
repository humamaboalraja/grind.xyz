package easy

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import xyz.grind.coding.easy.ProductExceptSelf

class ProductExceptSelfTest {

    @Test
    fun `Should return return an array answer such that answer'i' is equal to the product of all the elements of nums except nums'i'`() {
        Assertions.assertAll(
            Executable { assertArrayEquals(ProductExceptSelf.productOfArrayExceptSelfBruteForce(intArrayOf(2, 3, 4, 5, 6)), intArrayOf(360, 240, 180, 144, 120)) },
            Executable { assertArrayEquals(ProductExceptSelf.productExceptSelfLeftRightProducts(intArrayOf(3493, 324, 1234, 987)), intArrayOf(394618392, -40640002, 1117019484, 1396557288)) },
            Executable { assertArrayEquals(ProductExceptSelf.productExceptSelfLeftRightProducts(intArrayOf(3493, 324, 1234, 987, -1, -9)), intArrayOf(-743401768, -365760018, 1463240764, -315886296, -1752838456, 282458760)) },
            Executable { assertArrayEquals(ProductExceptSelf.productExceptSelfLeftRightProducts(intArrayOf(-1, 1, 0, -5, 5)), intArrayOf(0, 0, 25, 0, 0)) },
            Executable { assertArrayEquals(ProductExceptSelf.productExceptSelf(intArrayOf(2, 3, 4, 5, 6)), intArrayOf(360, 240, 180, 144, 120)) },
            Executable { assertArrayEquals(ProductExceptSelf.productExceptSelf(intArrayOf(3493, 3124, 1234, 987)), intArrayOf(-490066504, -40640002, -2114627604, 580669000)) },
            Executable { assertArrayEquals(ProductExceptSelf.productExceptSelf(intArrayOf(3493, 324, 1234, 987, -1, -9)), intArrayOf(-743401768, -365760018, 1463240764, -315886296, -1752838456, 282458760)) },
            Executable { assertArrayEquals(ProductExceptSelf.productExceptSelf(intArrayOf(-1, 1, 0, -5, 5)), intArrayOf(0, 0, 25, 0, 0)) },
            Executable { assertArrayEquals(ProductExceptSelf.productExceptSelfTwo(intArrayOf(2, 3, 4, 5, 6)), intArrayOf(360, 240, 180, 144, 120)) },
            Executable { assertArrayEquals(ProductExceptSelf.productExceptSelfTwo(intArrayOf(3493, 3124, 1234, 987)), intArrayOf(-490066504, -40640002, -2114627604, 580669000)) },
            Executable { assertArrayEquals(ProductExceptSelf.productExceptSelfTwo(intArrayOf(3493, 324, 1234, 987, -1, -9)), intArrayOf(-743401768, -365760018, 1463240764, -315886296, -1752838456, 282458760)) },
            Executable { assertArrayEquals(ProductExceptSelf.productExceptSelfTwo(intArrayOf(-1, 1, 0, -5, 5)), intArrayOf(0, 0, 25, 0, 0)) }
        )
    }
}
