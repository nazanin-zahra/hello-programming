package homework

import kotlin.test.assertEquals

object HomeWork47 {

    // الگوریتمی بنویسید که ارایه های مرتب شده a و b را با هم ادغام کرده و برگرداند.
    @JvmStatic
    fun main(args: Array<String>) {
        val a = listOf<Int>(2, 4, 6, 7, 8)
        val b = listOf<Int>(-2, -0, 3, 10)

        val byNazanin = byNazanin(a, b)
        val expected = (a + b).sorted()

        assertEquals(expected, byNazanin)
        print(byNazanin)
    }

    private fun byNazanin(a: List<Int>, b: List<Int>): List<Int> {
        val out = mutableListOf<Int>()
        var x = true
        var n = 0
        var i = 0
        var j = 0
        while (j < b.size || i < a.size) {
            var condition = false
            while (!condition) {
                if (i >= a.size || a.size == 0) {
                    n = b.get(j)
                    out.add(n)
                    x = false
                    condition = true
                }
                if (j >= b.size || b.size == 0) {
                    n = a.get(i)
                    out.add(n)
                    condition = true
                    x = true
                }
                if (!condition) {
                    if (a[i] > b[j]) {
                        n = b.get(j)
                        out.add(n)
                        x = false
                        condition = false
                    }
                    if (a[i] < b[j] || a[i] == b[j]) {
                        n = a.get(i)
                        out.add(n)
                        condition = false
                        x = true
                    }
                }
                if (!x)
                    j += 1
                if (x)
                    i += 1
            }
        }
        return out
    }
}