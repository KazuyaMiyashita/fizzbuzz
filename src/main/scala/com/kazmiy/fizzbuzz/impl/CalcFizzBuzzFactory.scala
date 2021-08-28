package com.kazmiy.fizzbuzz.impl

import com.kazmiy.fizzbuzz.{FizzBuzzable, FizzBuzzFactory}

private[fizzbuzz] class CalcFizzBuzzFactory extends FizzBuzzFactory {

  override def getInstance: FizzBuzzable = new CalcFizzBuzz

}
