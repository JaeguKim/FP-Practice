package com.hackerrank.helloWorldNTimes

import scala.collection.IterableOnce.iterableOnceExtensionMethods

// App trait can be used to quickly turn objects to executable programs
object Solution extends App {

  def f(n: Int) = (1 to n).foreach(_ => println("Hello World"))

  var n = scala.io.StdIn.readInt()
  f(n)
}
