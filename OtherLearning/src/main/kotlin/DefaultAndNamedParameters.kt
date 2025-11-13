fun main(){

    get("Anil")



    get1(message = "World") // IT CALLED NAMED PARAMETER,
                            // WE CAN ASSIGN A VALUE WITH THE NAME OF VARIABLE THEN WE DONT HAVE TO DEFINE THAT THE world IS NOT THE VALUE OF name VARIABLE ,
                            // IT BELONGS TO THE message VARIABLE

    get3() // IN THAT WE USED NAME PARAMETER AND FOR THE MESSAGE VALUE WE CALL OTHER FUNCTION TO GET THAT VALUE FOR MY MESSAGE PARAMETRES
}


fun get(name: String, message: String = "Hello"){ // IT CALLED DEFAULT PARAMETER
                                                    // IN WHICH WE DONT HAVE TO PASS THE MESSAGE ON MAIN WHILE CALLING THIS FUNCTION IN MAIN FUNCTION

    println("name = $name &&  message = $message")

}


fun get1(name: String = "Anil", message: String){

    println("name = $name &&  message = $message")
}


fun get3(name: String = "Anil", message: String = message() ) { // WE CALLED BELOW MESSAGE FUNCTION TO GET THE VALUE AND ASSIGN TO ITS message NAMED PARAMETERE



    println("name = $name &&  message = $message")
}

fun message() = "Hi Dear World!"
