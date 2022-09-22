fun main(){
    //For Loop

    for(number in 1 .. 5){
        println(number)
    }
    println()
    for(letters in 'B' .. 'X'){
        println(letters)
    }

    //Accessing the String Elements
    var string = "Jefferson"
    for(i in string.indices){
        print("${string[i]} ")
    }


}

//Source: https://www.youtube.com/watch?v=gc-fbBzdOHY
        //https://www.geeksforgeeks.org/kotlin-for-loop/?ref=gcse
        //https://www.geeksforgeeks.org/kotlin-string/?ref=gcse
        //https://www.ictdemy.com/kotlin/basics/loops-in-kotlin