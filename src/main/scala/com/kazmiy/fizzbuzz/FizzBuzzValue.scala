package com.kazmiy.fizzbuzz

sealed trait FizzBuzzValue
object FizzBuzzValue {
  object Fizz extends FizzBuzzValue
  object Buzz extends FizzBuzzValue
  object FizzBuzz extends FizzBuzzValue
  case class Other(value: Int) extends FizzBuzzValue
}
