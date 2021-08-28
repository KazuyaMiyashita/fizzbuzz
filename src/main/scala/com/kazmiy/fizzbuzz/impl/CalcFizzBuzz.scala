package com.kazmiy.fizzbuzz.impl

import com.kazmiy.fizzbuzz.{FizzBuzzable, FizzBuzzValue}

private[fizzbuzz] class CalcFizzBuzz extends FizzBuzzable {

  override def fizzbuzz(n: Int): FizzBuzzValue = (n%3, n%5) match {
    case (0, 0) => FizzBuzzValue.FizzBuzz
    case (0, _) => FizzBuzzValue.Fizz
    case (_, 0) => FizzBuzzValue.Buzz
    case _ => FizzBuzzValue.Other(n)
  }

}
