package com.hackerrank.listReplication

import java.util

object Solution extends App {

  def f(num:Int,arr:List[Int]):List[Int] = {
    var res = List[Int]()
    arr.foreach(e => (1 to num).foreach(_ => res = res :+ e))
    res
  }

}
