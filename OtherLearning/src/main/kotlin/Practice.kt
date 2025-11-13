/*
CREATE A RANGE OF NUMBER
THEN CHECK EACH NUMBER FROM THAT RANGE, AND FIND EVEN OR ODD,
IF IT IS ODD THEN SKIP THAT OTHERWISE PRINT EVEN NUMBER
ALSO GIVE ME TOTAL NUMBER OF EVEN NUMBERS.
 */


fun main() {

    arbitrary()

}

fun arbitrary() {

    var i = 1
    var totalSumCount = 0

    while (i in 0..100) {

        if (i % 2 == 0) {
            totalSumCount++

            println("$i")

            i++
        } else {
            i++
            continue
        }
    }
    println("Total Count Of Even Number:  $totalSumCount")

    println("")
    println("")
    println("FIND BIGGEST NUMBER IN MY_ARRAY")

    println("")


    val max = biggest(arrayOf(1,2,3,4,5,6,7,8,9))
    println("My Biggest Number: $max")


    var min = smallest(arrayOf(1,2,3,4,5,6,7,8,9,3,2,23,43,47,567,4,523,))
    println("My Smallest Number: $min")

}

fun biggest(arr1 : Array<Int>): Int {

    var biggestNumber = arr1[0]

    for (i in arr1) {                                        // IT WILL SEARCH ONE BY ONE IN MY ARR1
        if (i  > biggestNumber) {                            // THE I WILL COMPARE EVERY VALUE WITH MY BIGGEST NUMBER
            biggestNumber = i                                // IF I iS GREATER THAN THE VALUE OF I IS ASSIGN TO BIGGEST_NUMBER
        }
    }
    return biggestNumber
}

fun smallest(arr2 : Array<Int>): Int {

    var smallestNumber = arr2[0]

    for (i in arr2) {
        if (i < smallestNumber) {
            smallestNumber = i
        }
    }
    return smallestNumber
}



