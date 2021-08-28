package com.kazmiy.fizzbuzz.impl

import com.kazmiy.fizzbuzz.{FizzBuzzable, FizzBuzzFactory}
import com.kazmiy.fizzbuzz.impl.FizzBuzzStrategy

private[fizzbuzz] class DefaultFizzBuzzFactory extends FizzBuzzFactory {

  private val factoryKey: String = sys.env.getOrElse("FIZZBUZZ_FACTORY_KEY", "calc")
  private val calcFizzBuzzFactory = new CalcFizzBuzzFactory
  private val constFizzBuzzFactory = new ConstFizzBuzzFactory
  private val factoryMap = Map(
    "calc" -> calcFizzBuzzFactory,
    "const" -> constFizzBuzzFactory
  )

  override def getInstance: FizzBuzzable = 
    new FizzBuzzStrategy(factoryKey, factoryMap).getInstance

}
