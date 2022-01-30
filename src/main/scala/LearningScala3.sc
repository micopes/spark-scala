// Functions

// format dev <function name>(parameter name: type...) : return type = { }

def squareIt(x: Int) : Int = {
  x * x
}

def cubeIt(x: Int): Int = {x*x*x}

println(squareIt(2))

println(cubeIt(2))

def transformInt(x: Int, f: Int => Int): Int= {
  f(x)
}

val result = transformInt(2, cubeIt)
println(result)

// '=>' lambda function(anonymous function)

transformInt(3, x => x*x*x)

transformInt(10, x => x / 2)

transformInt(2, x => {val y = x * 2; y*y})

// to Upper String
// 1. Traditional Function
def UpperStr(x: String): String = {
  x.toUpperCase()
}
val str = "abcdef"
UpperStr(str)
// 2. A functional Literal
def transmitUpper(x: String, f: String => String): String = {
  f(x)
}
val str2 = "abcdefg"
transmitUpper(str2, UpperStr)
// 3. Inline lambda function
val str3 = "abcdefghi"
transmitUpper(str3, x => {x.toUpperCase()})

