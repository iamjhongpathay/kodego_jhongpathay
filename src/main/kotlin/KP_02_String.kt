fun main(){
    //String Functions

    var string1 : String = "This is my String"
    var string2 : String = "This is my String too!"

    //Element
    println(string1[11]) //getting the character of index 11

    //length
    println(string1.length)
    println(string2.length)

    //Equality
    println(string1 == string2)

    //uppercase/lowercase
    println(string1.uppercase())    //output: THIS IS MY STRING
    println(string2.lowercase())    //output: this is my string too!

    //startsWith/endsWith
    println(string2.startsWith("that")) //if string2 is starts with the word of "that" = return FALSE
    println(string2.endsWith("too!")) //if string2 is ends with the word/letters/special characters of "too!" = return TRUE

    //Concatenate
    println(string1+ " " +string2)

    //substring
    println(string2.substring(1, 10)) //getting the characters from (Start Index to End Index)

    //replace
    println(string2.replace("This", "That"))
}

//Source: https://www.youtube.com/watch?v=i4r09877JLo
        //https://www.geeksforgeeks.org/kotlin-string/?ref=gcse