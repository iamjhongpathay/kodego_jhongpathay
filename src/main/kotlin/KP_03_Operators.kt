fun main(){
    var num1 : Int = 21
    var num2 : Int = 9

    //Arithmetic Operators
    var answer1 : Int = num1 + num2 //Addition
    var answer2 : Int = num1 - num2 //Subtraction
    var answer3 : Int = num1 * num2 //Multiplication
    var answer4 : Int = num1 / num2 //Division
    var answer5 : Int = num1 % num2  //Modulo = Remainder
    println("Answer is: $answer5")

        //Complex Operations
        //                          1st   3rd  2nd
        var complexFormula : Int = (2*10)  +  (10/2)
        println(complexFormula)


    //Comparison Operators
    var expression1 : Boolean = 10 < 20  //Less than                =True
    var expression2 : Boolean = 10 > 20  //Greater than             =False
    var expression3 : Boolean = 20 <= 20 //Less than or Equal to    =True
    var expression4 : Boolean = 10 >= 20 //Greater than or Equal to =False
    var expression5 : Boolean = 10 != 20 //Not Equal to             =True
    println(expression5)


    //Logical Operators
    var number1 : Int = 25
    var number2 : Int = 35
    //                             True       AND           True
    var logic1 : Boolean = (number1 < number2) && (number1 <= number2) //Logical AND = Returns True if both statement is True
    //                             True       OR           False
    var logic2 : Boolean = (number1 < number2) || (number1 == number2) //Logical OR = Returns True if one of the statement is True
    //                    NOT
    var logic3 : Boolean = !(number1 < number2) //Logical NOT = Reverse the Result, if True it reversed into False
    println(logic3)


    var number3 : Int = 10

    //Increment Operator
    var incrementNum : Int = ++number3 //++ (plus one)
    println(incrementNum)              //= 11

    //Decrement Operator
    var decrementNum : Int = --number3 //-- (minus one)
    println(decrementNum)              //= 9

}

//Source: https://www.youtube.com/watch?v=i4r09877JLo
        //https://www.geeksforgeeks.org/kotlin-operators/?ref=gcse