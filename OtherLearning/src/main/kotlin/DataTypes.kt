fun main(){

    val byteMinLength = Byte.MIN_VALUE
    val byteMaxLength = Byte.MAX_VALUE

    println(byteMinLength)
    println(byteMaxLength)
    println(" ")

    val shortMinLength = Short.MIN_VALUE
    val shortMaxLength = Short.MAX_VALUE

    println(shortMinLength)
    println(shortMaxLength)
    println(" ")

    val intMinLength = Int.MIN_VALUE
    val intMaxLength = Int.MAX_VALUE

    println(intMinLength)
    println(intMaxLength)
    println(" ")

    val longMinLength = Long.MIN_VALUE
    val longMaxLength = Long.MAX_VALUE

    println(longMinLength)
    println(longMaxLength)
    println(" ")

    val doubleMinLength = Double.MIN_VALUE
    val doubleMaxLength = Double.MAX_VALUE

    println(doubleMinLength)
    println(doubleMaxLength)
    println(" ")

    val floatMinLength = Float.MIN_VALUE
    val floatMaxLength = Float.MAX_VALUE

    println(floatMinLength)
    println(floatMaxLength)
    println(" ")


    val floatNumber = 2f // CUS COMPILER KNOW THAT ITS FLOAT VALUE, WE ADD F TO THE END OF VALUE THAT WHY.
                            // OTHERWISE IT GET ITS DEFAULT DATA TYPE WHICH IS INT
                            // ALSO WE ASSIGN LIKE THIS     val floatNumber: Float = 2.0 &&   ( val floatNumber = 2f or 2.0 )
    println(floatNumber)

    val doubleNumber = 2.0
    println(doubleNumber)


}