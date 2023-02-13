package challenges

import org.junit.Test
import kotlin.test.assertEquals

class MagicSquareFormingKtTest {

    @Test
    fun `should find the minimum cost for forming a magic square`() {
        val expected = 1
        val actual = formingMagicSquare(
            arrayOf(
                arrayOf(5, 3, 4),
                arrayOf(1, 5, 8),
                arrayOf(6, 4, 2)
            )
        )

        assertEquals(expected, actual)
    }
}