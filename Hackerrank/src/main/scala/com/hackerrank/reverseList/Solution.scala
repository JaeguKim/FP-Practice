package com.hackerrank.reverseList

object Solution extends App {

  // def f(list: List[Int]): List[Int] = list.foldLeft(Nil: List[Int])((acc, v) => v :: acc)
  def f(arr:List[Int]):List[Int] = {(0 to arr.size-1).map(i=>arr(arr.size-1-i)).toList}
}
