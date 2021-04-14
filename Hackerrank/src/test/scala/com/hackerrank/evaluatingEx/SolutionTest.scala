package com.hackerrank.evaluatingEx

import org.scalatest.FunSuite

class SolutionTest extends  FunSuite {

  test("sol.f") {
    assert(math.abs(Solution.f(20.0000)-2423600.1887) <= 0.1)
    assert(math.abs(Solution.f(5.0000)-143.6895) <= 0.1)
    assert(math.abs(Solution.f(0.5)-1.6487)<=0.1)
    assert(math.abs(Solution.f(-0.5)-0.6065)<=0.1)
  }
}
