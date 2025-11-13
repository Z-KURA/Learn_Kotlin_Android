fun get(a: Int, b: Int){

    val max = if (a > b) a else b

    if(a > b)
        println("Maximum number that is $max is a")
    else
        println("Maximum number that is $max is b")


}

fun get1(a: Int, b: Int): Int {

    if(a > b) {
       return a
    }else {
        return b
    }
}

fun get2(a: Int, b: Int): Int {

    val max = if(a < b) a else b

    return max
}

fun get3(a: Int, b: Int) = if(a > b) a else b




fun main(){

   val max =  get(4, 7)
    println(max)

    val max1 = get1(4, 7)
    println(max1)

    println(get2(20, 10))

    println(get3(26, 54))

}