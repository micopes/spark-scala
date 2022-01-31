// Data Structure

// Tuple - Immutable List

val captainStuff =  ("Picard", "Enterprise-D", "NCC-1701-D")
println(captainStuff)

// Refer to the individual fields with a One-based index
// _1부터 시작.
println(captainStuff._1)
println(captainStuff._2)
println(captainStuff._3)

// 튜플 사용 방법 2
val picardsShip = "Picard" -> "Enterprise-D"
println(picardsShip._2)

val aBunchOfStuff = ("Kirk", 1964, true)

// Lists - 파이썬에서는 컨테이너(서로 다른 자료형을 담을 수 있는 자료형)인데 Scala는 다르다?
// 이렇게 하면 List[Any] 타입이 된다.
val shipList2 = List("Enterprise", true)

// 강의에서는 List[String]으로 목록을 인스턴스화 하였기 때문에 해당 유형으로 제한
var shipList = List("Enterprise", "Defiant", "Voyager", "Deep Space Nine")

println(shipList(1))
println(shipList2(0))

println(shipList.head) // first element
println(shipList.tail) // else 모두.

for (ship <- shipList) {println(ship)}

// map : List의 모든 elements에 해당 함수를 적용
val backwardShips = shipList.map( (ship: String) => {ship.reverse})
for (ship <- backwardShips) {println(ship)}

// reduce() to combine together all the items in a collections using some func
val numberList = List(1, 2, 3, 4, 5)
val sum = numberList.reduce( (x: Int, y: Int) => x + y)
println(sum)

// filter() removes stuff
val iHateFives = numberList.filter( (x: Int) => x != 5)

val iHateThrees = numberList.filter( (x: Int) => x != 3)

// Concatenate lists '++'
val moreNumbers = List(6, 7, 8)
val lotsOfNumbers = numberList ++ moreNumbers

val reversed = numberList.reverse
val sorted = reversed.sorted
val lotsOfDuplicates = numberList ++ numberList
val distinctValues = lotsOfDuplicates.distinct
val maxValue = numberList.max
val total = numberList.sum
val hasThree = iHateThrees.contains(3)

// MAPS, key-values
val shipMap = Map("Kirk" -> "Enterprise", "Picard" -> "Enterprise-D", "Sisko" -> "Deep Space Nine", "Janeway" -> "Voyager")
println(shipMap("Janeway")) // Key를 통해 Value를 구한다. 파이썬의 딕셔너리 같은 것.
println(shipMap.contains("Archer"))
val archersShip = util.Try(shipMap("Archer")) getOrElse "Unknown" // 파이썬의 try ... except 문 같은 것.
println(archersShip)

// Exercise :
// 1. 1 ~ 20 List 생성
// 2. 3의 배수만 출력 -> 3으로 나누어 떨어지는 것만 출력

var oneToTwenty = List(1)
var x = 2
for (x <- 2 to 20) {
  oneToTwenty = oneToTwenty :+ x
}

val res = oneToTwenty.filter(( (x: Int) => (x % 3 == 0)))
println(res)












