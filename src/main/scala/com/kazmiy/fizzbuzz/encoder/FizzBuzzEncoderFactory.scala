package com.kazmiy.fizzbuzz.encoder

import com.kazmiy.fizzbuzz.encoder.impl.StringFizzBuzzEncoderFactory

trait FizzBuzzEncoderFactory[A] {
  def getInstance: FizzBuzzEncoder[A]
}

object FizzBuzzEncoderFactory {
  def defaultStringEncoderFactory: FizzBuzzEncoderFactory[String] = new StringFizzBuzzEncoderFactory
}
