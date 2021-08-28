package com.kazmiy.fizzbuzz.encoder.impl

import com.kazmiy.fizzbuzz.FizzBuzzValue
import com.kazmiy.fizzbuzz.encoder.FizzBuzzEncoder

class StringFizzBuzzEncoder extends FizzBuzzEncoder[String] {
  override def encode(value: FizzBuzzValue): String = {
    value match {
      case FizzBuzzValue.Fizz => "Fizz"
      case FizzBuzzValue.Buzz => "Buzz"
      case FizzBuzzValue.FizzBuzz => "FizzBuzz"
      case FizzBuzzValue.Other(n) => n.toString
    }
  }
}
