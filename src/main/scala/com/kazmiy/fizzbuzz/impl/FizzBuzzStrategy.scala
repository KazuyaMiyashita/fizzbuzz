package com.kazmiy.fizzbuzz.impl

import com.kazmiy.fizzbuzz.{FizzBuzzable, FizzBuzzFactory}

private[fizzbuzz] class FizzBuzzStrategy(
  key: String,
  factoryMap: Map[String, FizzBuzzFactory]
) extends FizzBuzzFactory{

  import FizzBuzzStrategy._

  private val factory: FizzBuzzFactory = try {
    factoryMap(key)
  } catch {
    case e: NoSuchElementException => throw new FizzBuzzStrategyNoSuchKeyException(key)
  }

  override def getInstance: FizzBuzzable = factory.getInstance

}

object FizzBuzzStrategy {
  class FizzBuzzStrategyNoSuchKeyException(key: String)
    extends RuntimeException(s"fizz buzz strategy exception: no such key: $key")
}
