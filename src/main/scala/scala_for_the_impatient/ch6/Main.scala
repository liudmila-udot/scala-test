package scala_for_the_impatient.ch6

object Main extends App {

    /*    println(Accounts.newUniqueNumber())
    println(Accounts.newUniqueNumber())
    println(Accounts.newUniqueNumber())
    Array("", "")
    println(new Account().id)
    println(new Account().id)
    println(new Account().id)

    val acct = Account2(1000.0)
    val d = acct.description
    println(d)
    */
    /*println(Conversions.milesToKilometers(2))
    println(Conversions.inchesToCentimeters(7))
    println(InchesToCentimeters.convert(7))
    println(Conversions.gallonsToLiters(3))*/
    println(Point(2,4).x)
    println(Suit.values)
    println(for (s <- Suit.values) yield (s, Suit.red(s)))
}
