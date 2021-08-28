package com.kazmiy.fizzbuzz.impl

import com.kazmiy.fizzbuzz.{FizzBuzzable, FizzBuzzValue}

private[fizzbuzz] class ConstFizzBuzz extends FizzBuzzable {

  import ConstFizzBuzz._

  override def fizzbuzz(n: Int): FizzBuzzValue = n match {
    case 0 => FizzBuzzValue.FizzBuzz
    case 1 => FizzBuzzValue.Other(1)
    case 2 => FizzBuzzValue.Other(2)
    case 3 => FizzBuzzValue.Fizz
    case 4 => FizzBuzzValue.Other(4)
    case 5 => FizzBuzzValue.Buzz
    case 6 => FizzBuzzValue.Fizz
    case 7 => FizzBuzzValue.Other(7)
    case 8 => FizzBuzzValue.Other(8)
    case 9 => FizzBuzzValue.Fizz
    case 10 => FizzBuzzValue.Buzz
    case 11 => FizzBuzzValue.Other(11)
    case 12 => FizzBuzzValue.Fizz
    case 13 => FizzBuzzValue.Other(13)
    case 14 => FizzBuzzValue.Other(14)
    case 15 => FizzBuzzValue.FizzBuzz
    case _ => throw new UnsupportedFizzBuzzException(n)
  }

}

object ConstFizzBuzz {
  class UnsupportedFizzBuzzException(n: Int)
    extends RuntimeException(s"unsupported fizz buzz exception: n=$n")
}
