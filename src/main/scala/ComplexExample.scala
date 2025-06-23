// Version 1 — Methods with parentheses (look like Java methods)
//class Complex(real: Double, imaginary: Double):
//  def re() = real
//  def im() = imaginary

//@main def ComplexNumbers: Unit =
//  val c = Complex(1.2, 3.4)
//  println("imaginary part: " + c.im())


// Version 2 — Methods without parentheses (look like fields)
class Complex(real: Double, imaginary: Double):
  def re = real
  def im = imaginary
  override def toString() =
    "" + re + (if im >= 0 then "+" else "") + im + "i"

@main def ComplexNumbers: Unit =
  val c = Complex(1.2, 3.4)
  println("Overridden toString(): " + c.toString)


