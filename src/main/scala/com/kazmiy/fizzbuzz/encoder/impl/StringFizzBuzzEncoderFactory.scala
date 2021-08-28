package com.kazmiy.fizzbuzz.encoder.impl

import com.kazmiy.fizzbuzz.encoder.{FizzBuzzEncoder, FizzBuzzEncoderFactory}

class StringFizzBuzzEncoderFactory extends FizzBuzzEncoderFactory[String] {
  override def getInstance: FizzBuzzEncoder[String] = new StringFizzBuzzEncoder
}
