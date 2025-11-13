fun main(){

    println(sum(1, 3))


   println(sum1(1,3,4,5,6,4,2,4,6,67,4,6,7,7,8,8,2,3,6,66,6,4, 1)) // IT NOT ASKING FOR ARGUMENTS BECAUSE OF VARARG also hold multiple value// SO WE DONT HAVE TO WRITE PARAMETERS FOR EACH

}

fun sum(a: Int, b: Int) = a+b // ONLY HAVE SMALL DATA

fun sum1(vararg numbers: Int): Int {

    var result = 0

    for (number in numbers) {  // IT RUNS A LOOP IN ABOVE SUM1 ARGUMENTS TO GET A NUMBER EVERY TIME AND LOOP REMAIN RUNNING UNTIL THE NUMBERS ARE OVER
        result += number  // IT WILL GET NUMBER ONE BY ONE AND ADD TO RESULT
    }

    return result

}

