package im.deepdata.scala.learning

object HelloWorld {

    def f() = {
        "°¢Ë¹µÙ·Ò"
    }

    override def toString(): String =
        "test case"

    def main(args: Array[String]) {
        val oneHalf: Rational = new Rational(2, 4)
        println(oneHalf)
        println(oneHalf.reduction)
        oneHalf + oneHalf

        val test = for (i <- 1 to 10 if (i % 2 == 0); if (i % 3 == 0)) yield { i + 1 }

        println(test)

        def f(): Int = try { return 1 } finally { return 2 }
        def g(): Int = try { 1 } finally { 2 }
        println(f)
        println(g)
        val str = "test" * 5;
        println(str)

        def mkRowSeq(row: Int) = {
            val seq = for (col: Int <- 1 to row) yield {
                val v: String = (row * col).toString;
                " " * (4 - v.length()) + v;
            }
            seq.mkString
        }

        def mkTable() = {
            val v = for (row <- 1 to 9) yield {
                mkRowSeq(row)
            }
            v
        }
        println(mkTable)
        mkTable().foreach(println _)
        var sum = 0;
        List(1, 2, 3).foreach((x) => sum += x)
        List(1, 2, 3).foreach(sum += _)
        println(sum)

        def curriedSum(x: Int)(y: Int) = { println(x + y) }
        println(curriedSum(1)(2))
        val a: Int = 10
        val one = curriedSum(1)_
//        println(one(a))

        def withOp(list: List[Int], op: Int => Unit) = {
            list.foreach(op)
        }
        
        withOp(List(1, 2,3), a => println(a))
        println("github")
        println(oneHalf.reduction())
    }
}