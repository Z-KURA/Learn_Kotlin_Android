fun main(){


    val x = 5
    val y = 3

    val result = x + y

    println(result)

    println(" ARITHMETICAL OPERATOR")

    println(" x + y is ${x+y}")
    println(" x - y is ${x-y}")
    println(" x * y is ${x*y}")
    println(" x / y is ${x/y}") // IT GIVES QUOTIENT
    println(" x % y is ${x%y}") // IT GIVE REMINDER


    println("Relational (Comparison) Operators")

    if (x == y) {
        println("Boht values are Equals")
    } else {
        println("Boht values are Not Equals")
    }

    val isActive1 = true

    if (isActive1) {
        println("THE USER IS ACTIVE")
    } else {
        println("THE USER IS NOT ACTIVE")
    }

    val a = 10
    val b = 10

    if(a != b) {
        println("A IS NOT EQUAL TO B")
    }else{
        println("A IS EQUAL TO B")
    }

    var logic1 = 10
    var logic2 = 20

    if (logic1 > logic2)
        println("Logic1 is Greater")
    else
        println("Logic2 is Gearter")



    logic1 = 30
    logic2 = 40
    if (logic1 == logic2)
        println("Logic1 is equal")
    else
        println("Logic1 and Logic2 is Not Equal")

    var logic3 = 10
    var logic4 = 40

    if(logic1 == logic3 && logic2 == logic4)
        println("Condition is True")
    else
        println("Condition is False")


    if(logic1 == logic3 || logic2 == logic4)
        println("Condition is True")
    else
        println("Condition is False")

    var isActive = true
    var score = 80

    if(isActive && score > 80)
        println("The Active Condition Is Ture!")
    else
        println("The Active Condition Is false")



}