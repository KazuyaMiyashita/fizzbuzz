
import com.kazmiy.fizzbuzz.{FizzBuzzFactory, FizzBuzzable, FizzBuzzValue}
import com.kazmiy.fizzbuzz.encoder.{FizzBuzzEncoderFactory, FizzBuzzEncoder}

object Main {
  def main(args: Array[String]) = {
    val NUM_MAX =  args.lift(0).getOrElse("100").toInt

    val fizzbuzzable: FizzBuzzable = FizzBuzzFactory.default.getInstance
    val fizzbuzzStringEncoder: FizzBuzzEncoder[String] = 
      FizzBuzzEncoderFactory.defaultStringEncoderFactory.getInstance
    val fizzbuzzValues: List[FizzBuzzValue] = (1 to NUM_MAX).map(fizzbuzzable.fizzbuzz).toList
    val fizzbuzzStrings: List[String] = fizzbuzzValues.map(fizzbuzzStringEncoder.encode)
    val output: String = fizzbuzzStrings.mkString("\n")

    println(output)
  }
}
