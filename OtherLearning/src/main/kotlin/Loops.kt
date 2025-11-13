fun main(){

    DoWhile()

    get()
}

fun get(){

    println("RANGE")
    for (i in 1..10){ // IN THIS THE I WILL ITERATE TILL 10 , 1..10 IT IS THE RANGE
        println(i)          // IT WILL PRINT I TO ( 1 TO 10 ) TIME BECAUSE, I GET A RANGE
    }

    println("UNITL")
    for(j in 1 until 10){  // IT WILL PRINT ( 1 TO 9 ) BECAUSE UNTIL NOT EXCLUDE THE LAST DIGIT
        println(j)
    }

    print("DOWNTO")
    for (K in 10 downTo  1 ){ // IT WILL PRINT DOWN_WORD DIRECTION OR REVERSE PATTERN ( 9 TO 1 )
        println(K)                  // IT ALSO NOT EXCLUDE THE FIRST DIGIT
    }

    println("STEP")
    for(l in 1 until 10 step 3){ // IT WILL PRINT ( 1 TO 10 ) , BUT AFTER EVERY PRINT IT WILL INCREMENT BY THESE STEP
        println(l)                    // AND PRINT THAT THIRD INCREMENTED VALUES .
    }


}


fun DoWhile(){

//    println("While_Loop")
//    var number = 10
//
//   do {
//       println(number)
//   } while (true)

    var number = 0

    println("CONTINUE STATEMENT")
        while(number < 10){
            number++
            if(number  == 5){
                continue     // IN THIS STATEMENT IF THIS CONDITION IS TRUE , THEN IT WILL STOP ITS BELOW CODE FOR EXECUTION , BUT AGAIN IT WILL EXECUTE
            }                           // AND SKIP THAT IF CONDITION UNTIL ITS TURE AND WHOLE CODE WILL STOP WHEN THAT WHILE LOOP CONDITION IS FALSE
            println("$number")
        }

    var number1= 0
    println("BREAK STATEMENT")
    while(number1 < 10){
        number1++
        if(number1  == 5){
            break              // WHEN THIS CONDITION IS TRUE IT WILL STOP WHOLE EXECUTION CODE
        }
        println("$number1")
    }

    println("WHILE INSIDE A WHILE")
    var number2 = 0
    while (number2 < 5){
        number2++
        println("$number2")

        var j = 0

        while (j < 2){
            if(j == 0) break // IT WILL ONLY BREACK THIS WHILE LOOP , AND NOT EFFECT ON OUTER LOOP
            j++
            println(j)
        }
    }

    println("WHILE INSIDE A WHILE")
    var number3 = 0
    outer@while (number3 < 5){
        number3++
        println("$number3")

        var k = 0

        while (k < 2){
            if(k == 0) break@outer // WHEN IT WILL TRUE IT WILL BREAK OUTR LOOP WHERE IT WILL PLACE IN OUTER LOOP IT DEFINE
            k++
            println(k)
        }
    }
}

