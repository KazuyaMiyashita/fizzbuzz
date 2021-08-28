package com.kazmiy.fizzbuzz.encoder

import com.kazmiy.fizzbuzz.FizzBuzzValue

trait FizzBuzzEncoder[A] {
  def encode(value: FizzBuzzValue): A
}
