fun main(){

    var text: String? = null

    println(text?.length) // ONLY SAFE IT WILL FIRST CHECK THAT MY TEXT IS NULL OR NOT, NOW AFTER QUESTION MARK IT IS SAFE FOR NOT THORWING ERROR
                          // IF IT NULL THEN IT STOP THERE AND GIVE ERROR ON RUNTIME THAT NULLPOINTEREXCEPTION

    text = "Anil"
    if (text.length != null){
        println("The Text has Length!")
    }else
        println("The Text is empty!")



    var text2: String? = null

    // THIS IS THE ELVIS OPERATOR

    var text3 = text2 ?: "The Text2 Is Null"
    println(text3)




}