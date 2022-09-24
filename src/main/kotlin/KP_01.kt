fun main (){
    /*
        Author: Jefferson
        Date Created: 9/1/2022
        Filename:KP_01.kt
     */

    //var = changeable, val = NOT changeable
    // Variable Name    //Data Type       //Data
    var firstName :        String =     "Jefferson"     //explicit declaration w/"String"
    var lastName = "Pathay"                             //implicit declaration  w/o"String"
    var age : Int = 26
    var grade : Double = 75.00
    var section : Char = 'A'
    var isEnrolled : Boolean = true

    println("My name is $firstName $lastName")
    println("My age is $age")
    println("My grade is $grade")
    println("Section $section")
    println("Enrolled? $isEnrolled")
    println()

    //User Input
    print("Enter your name: ")
    var name : String = readln()
    print("Enter your age: ")
    var myAge : Int = readln().toInt()
    println()
    println("My name is $name")
    println("My age is $myAge")
    println()

    //Arithmetic Operation
    print("Enter first number: ")
    var firstNumber : Int = readln().toInt()
    print("Enter second number: ")
    var secondNumber : Int = readln().toInt()

    var sum : Int = firstNumber + secondNumber
    println("The sum is $sum")
}



/*
    [1]Git

    To Terminal:

        git init                                        //creating a new git repository

        git --version
        git branch
        git status                                      //checking the status of files

        git branch <new branch name>          //Creating another branches
        git checkout <new branch name>        //Switching the branch from master to <new branch name>


        //Creating Git on a local computer
        git config --global user.name 'Jefferson Pathay'
        git config --global user.email 'jeffersonpathay@gmail.com'


        git config --list                               //Press ENTER -> (END) -> to quit Press "Q"

        git add .\src\main\kotlin\KP_01.kt              //Adding the file into STAGING

        git commit -m"KP_01.kt 1st commit"              //Committing the added file from STAGING into REPOSITORY    //m = message



    [2] GitHub

        //Linking the project into GitHub repository
        git remote add origin https://github.com/iamjhongpathay/kodego.jeffersonpathay.git

        git push -u origin master                       //Pushing/Uploading the project/file into GitHub repository. "master" branch

                Steps:
                        git add
                        git commit -m""
                        git push -u origin master


 */

//Source: https://www.youtube.com/watch?v=G8sd0EMU5cc
//https://www.youtube.com/watch?v=bGl4xw6OGXw