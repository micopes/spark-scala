// Flow Control

// If / Else
if (1 > 3) println("Impossible!") else println("The world makes sense.")

if (1 > 3){
  println("Impossible")
  println("Really?")
} else {
  println("The world makes sense.")
  println("still.")
}

// Matching - switch case 문 같은 것
val number = 2
number match {
  case 1 => println("One")
  case 2 => println("Two")
  case 3 => println("Three")
  case _ => println("Something else")
}

// For 문
for (x <- 1 to 4) {
  val squared = x*x
  println(squared)
}

// While 문
var x = 10
while (x > 0) {
  println(x)
  x -= 1
}

x = 0
do { println(x); x+=1} while (x <= 10) // ';' 도 파이썬 같이 사용

// Expression - 함수형 프로그래밍에서 중요한 부분
{val x = 10; x + 20}

println({val x = 10; x + 20})

// Fibonacci
var x = 0
var y = 1
var i = 1
for (i <- 1 to 10){
  println(x)
  val temp = x
  x = y
  y = x + temp
}



