package catslib

object TraverseHelpers {
  import cats.Semigroup
  import cats.data.{ NonEmptyList, OneAnd, Validated, ValidatedNel, Xor }
  import cats.implicits._

  def parseIntXor(s: String): Xor[NumberFormatException, Int] =
    Xor.catchOnly[NumberFormatException](s.toInt)

  def parseIntValidated(s: String): ValidatedNel[NumberFormatException, Int] =
    Validated.catchOnly[NumberFormatException](s.toInt).toValidatedNel
}
