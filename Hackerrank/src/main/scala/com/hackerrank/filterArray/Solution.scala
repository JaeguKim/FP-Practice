package com.hackerrank.filterArray

object Solution extends  App {
  def f(delim:Int,arr:List[Int]):List[Int] = {arr.filter(e=>e<delim)}
}
