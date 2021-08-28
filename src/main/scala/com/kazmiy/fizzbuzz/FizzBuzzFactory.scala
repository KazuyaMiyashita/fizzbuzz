package com.kazmiy.fizzbuzz

import com.kazmiy.fizzbuzz.impl.DefaultFizzBuzzFactory

trait FizzBuzzFactory {
  def getInstance: FizzBuzzable
}

object FizzBuzzFactory {
  def default: FizzBuzzFactory = new DefaultFizzBuzzFactory
}
