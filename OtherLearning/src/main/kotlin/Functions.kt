import javax.xml.crypto.Data

fun function(name :String, age:Int){  // PASSING PARAMETER

    println("Hello $name and You are $age")

}


fun main(){

    function("Anil", 28) // ASSIGNING VALUE TO PARAMETERS

    var isNetwork = false

    if(isNetwork){
        getData(
            data = " Get Some Data "
        )
    }else
        println("No Internet") //  I GET THIS OUTPUT BECAUSE IN MY CONDITION I GET FALSE VALUE

}

fun getData(data : String){

    println(data)

}