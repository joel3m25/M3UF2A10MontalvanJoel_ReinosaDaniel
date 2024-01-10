import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class EuclideanAlgorithmTest {

    @Test
    fun testEuclideanAlgorithm_PositiveNumbers() {
        val result = algorismeEuclides(412, 184)
        assertEquals(4, result, "El MCD de 412 y 184 hauria de ser 4")
    }

    @Test
    fun testEuclideanAlgorithm_OneNumberIsZero() {
        val result = algorismeEuclides(0, 184)
        assertEquals(184, result, "El MCD de 0 y 184 hauria de ser 184")
    }

    @Test
    fun testEuclideanAlgorithm_BothNumbersAreZero() {
        val result = algorismeEuclides(0, 0)
        assertEquals(0, result, "El MCD de 0 y 0 hauria de ser 0")
    }
}
