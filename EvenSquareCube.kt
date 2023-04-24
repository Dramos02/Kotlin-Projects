fun main(){
    var ctr : Int = 2 ; var square : Int = 0 ; var cube : Int = 0 ; var totalSquare : Int = 0 ; var totalCube: Int = 0

    println("Number\tSquare\tCube")
    while (ctr <= 10){
        square = ctr * ctr
        cube = square * ctr
        println("$ctr\t\t$square\t\t$cube")
        totalSquare += square
        totalCube += cube
        ctr+=2
    }
    println("Total\t$totalSquare\t\t$totalCube")
}

//Coded by DOMINIC O. RAMOS copyrights © https://github.com/Dramos02