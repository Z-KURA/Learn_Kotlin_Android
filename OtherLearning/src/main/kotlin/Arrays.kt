

fun main(){

    arr()
}

fun arr(){

    var arr = arrayOf("Anil", "Govind", "Pradeep")

    println(arr.contentToString()) // PRINT WHOLE ARRAY

    println(arr[1]) // PRINT THE VALUE WHICH BELONG TO THAT 1 INDEX

    println(arr.size)  // IT WILL GIVE SIZE OF ARRAY
                        // GENERALY WE COUNT ARRAY FROM 0, BUT SIZE WILL ALWAYS GIVE ONE INCREMENTED
                        // IT GIVE SIZE ARRAY IS 3, BUT WE HAVE 0,1,2 THAT ALL .


    var arr1 = arrayOf("Govind", "Pradeep", 1,23,4,6,'a', 'g', 'p')

    println(arr1.contentToString())

    // println(arr1[23])         // IT GIVE THE ERROR : INDEX 23 IS OUT OF BOUND

    for (i in arr1){
        if(i is String)  {   // IT WILL CHECK DATA TYPE OF THAT I AND THEN PRINT THAT I VALUE IF IT IS THE STRING.
            println(i)
        }
    }

}