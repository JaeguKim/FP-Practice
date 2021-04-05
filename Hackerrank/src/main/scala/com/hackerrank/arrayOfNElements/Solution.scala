package com.hackerrank.arrayOfNElements

import scala.util.Random

object Solution extends App {

  // List.fill(num){1}
  def f(num:Int) : List[Int] = {
    val list = (1 to num).toList // Write your code here
    print(list + "\n")
    return list
  }
}
