package com.hackerrank.filterPositionsInList

object Solution extends App {
  def f(arr:List[Int]):List[Int] = {(1 to arr.size).filter(i=>i%2==0).map(i=>arr(i-1)).toList}

}
