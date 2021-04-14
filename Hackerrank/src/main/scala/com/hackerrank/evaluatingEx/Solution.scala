package com.hackerrank.evaluatingEx

object Solution {

  def factorial(x:Int): Int = {
    if (x == 0) 1
    else x*factorial(x-1)
  }

  def f(x:Double) = {(0 to 9).foldLeft(0.0){(acc,v)=>acc+math.pow(x,v)/factorial(v)}}

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val n = stdin.readLine.trim.toInt

    for (nItr <- 1 to n) {
      val x = stdin.readLine.trim.toDouble
      println(f(x))
    }
  }
}
