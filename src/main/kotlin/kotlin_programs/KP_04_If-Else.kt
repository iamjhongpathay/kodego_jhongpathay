fun main(){
    //If Condition
    var number : Int = 9
    if(number < 10) { //(number Less than to 10)
        println("Hello")
    }

    //If Condition with Range
    var idNumber : Int = 1
    //      true       AND     true
    if((idNumber >= 1) && (idNumber <=3)){ //(idNumber is Greater than or Equal to 1) AND (idNumber is Less than or Equal to 3)
        println("Valid ID Number")
    }

    //If-Else
    var grade : Int = 74
    if(grade >= 75) { //(grade is Greater than or Equal to 75)
        println("You Passed!")
    }else{ //grade is Less than to 75
        println("You Failed!")
    }

    //If-Else-If
    var studentGrade : Int = 101
    if((studentGrade >= 96) && (studentGrade <= 100)){
        println("1.0")
    }else if((studentGrade >=86) && (studentGrade <= 95)){
        println("1.75")
    }else if((studentGrade >= 76) && (studentGrade <= 85)){
        println("2.25")
    }else if(studentGrade < 75){
        println("5.0")
    }else{
        println("Invalid Grade!")
    }

    //If-Else-If using String Variable
    var gender : String = "M"
    if(gender == "M"){
        println("Male")
    }else if(gender == "F"){
        println("Female")
    }else{
        println("Invalid Choice")
    }

    //If-Else-If using readln() as user input
    println("Choose M or F to know your gender:")
    var userInput : String = readln()
    //                    OR
    if((userInput == "M") || (userInput == "m")){
        println("You are a Male!")
    }else if((userInput == "F") || (userInput == "f")){
        println("You are a Female!")
    }else{
        println("Invalid Choice")
    }
}

//Source: https://www.youtube.com/watch?v=gc-fbBzdOHY
//https://www.geeksforgeeks.org/kotlin-if-else-expression/?ref=gcse