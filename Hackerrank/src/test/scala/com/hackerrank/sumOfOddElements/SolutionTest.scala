package com.hackerrank.sumOfOddElements

import org.scalatest.FunSuite

class SolutionTest extends FunSuite{

  test("sumOfOddElements") {
    assert(Solution.f(List(3,2,4,6,5,7,8,0,1)) == 16)
  }
}
