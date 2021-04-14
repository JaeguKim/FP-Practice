def f(coefficients:List[Int],powers:List[Int],x:Double):Double =
{
  coefficients.zip(powers).map{case (c,p) => c * math.pow(x,p)}.sum
}

def area(coefficients:List[Int],powers:List[Int],x:Double):Double =
{
  math.Pi * math.pow(f(coefficients,powers,x),2)
}

def summation(func:(List[Int],List[Int],Double)=>Double,upperLimit:Int,lowerLimit:Int,coefficients:List[Int],powers:List[Int]):Double =
{
  val step = 0.001
  (BigDecimal(lowerLimit) to upperLimit by step).map(x => func(coefficients, powers, x.toDouble)).sum * step
}

def readLine(): String = scala.io.StdIn.readLine()
// The Input-Output functions will be handled by us. You only need to concentrate your effort on the function bodies above.