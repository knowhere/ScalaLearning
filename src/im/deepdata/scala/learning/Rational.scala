package im.deepdata.scala.learning

class Rational(val a: Int, val b: Int) {
    require(b != 0)
    val numer: Int = a
    val denom: Int = b

    def this(a: Int) = this(a, 1)

    override def toString(): String = { numer + "/" + denom }

    def reduction(): Rational = {
        val g: Int = gcd(numer, denom)
        new Rational(numer / g, denom / g)
    }
    private def gcd(a: Int, b: Int): Int = {
        if (b == 0) a else gcd(b, a % b)
    }

    def +(that: Rational) = {
        println("+")
    }
}