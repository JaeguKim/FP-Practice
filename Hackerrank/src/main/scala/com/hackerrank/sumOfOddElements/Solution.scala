package com.hackerrank.sumOfOddElements

object Solution {

  // def f(arr:List[Int]):Int = {arr.filter(_ % 2 != 0).sum}
  def f(arr:List[Int]):Int = {arr.foldLeft(0){(acc,v)=>if(v%2!=0)acc+v else acc}}
}
