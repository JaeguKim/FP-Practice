package com.hackerrank.filterPositionsInList

import org.scalatest.FunSuite

object SolutionTest extends FunSuite {

  test("Solution.f") {
    assert(Solution.f(List(2,5,3,4,6,7,9,8)) == List(5,4,7,8))
  }
}
