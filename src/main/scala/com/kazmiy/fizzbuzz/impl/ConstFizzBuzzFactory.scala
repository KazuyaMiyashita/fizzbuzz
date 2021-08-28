package com.kazmiy.fizzbuzz.impl

import com.kazmiy.fizzbuzz.{FizzBuzzable, FizzBuzzFactory}

private[fizzbuzz] class ConstFizzBuzzFactory extends FizzBuzzFactory {

  override def getInstance: FizzBuzzable = new ConstFizzBuzz

}
