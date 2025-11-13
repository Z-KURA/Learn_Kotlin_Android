fun main(){

    val max = getMax(2, 5, 7)
    println(max)


}

fun getMax(a: Int, b: Int): Int{

    if(a > b){
        return a
    }else
        return b

}

fun getMax (a : Double, b : Double): Double{

    if(a > b)
        return a
    else
        return b
}

fun getMax(a: Int,b: Int, c: Int): Int{

    return if (a > b && a > c) {
        a
    }else if (b > a && b > c){
        b
    }else{
        c
    }


}