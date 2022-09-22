fun main(){

    //Nested Loops
    //While loop inside of While loop
    var ctr1 : Int = 1
    while (ctr1 <= 5){                //Output:
                                          //@@@@@
        var ctr2 : Int = 1                //@@@@@
        while (ctr2 <= 5){                //@@@@@
            print("@")                    //@@@@@
            ctr2++                        //@@@@@
        }

        println()
        ctr1++
    }

    //Multiplication Table from 1 to 10
    //For loop inside of For loop
    for (j in 1..10) {
//    var j : Int = 2

        for (i in 1..10) {
            print("${i * j} ")
        }

        println()
    }
}

//Source: https://www.youtube.com/watch?v=Jhv1RcNIDxs
        //https://www.geeksforgeeks.org/java-nested-loops-with-examples/?ref=gcse
        //https://www.ictdemy.com/kotlin/basics/loops-in-kotlin