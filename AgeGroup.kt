fun main() {
    print("Enter Age: ")
    var userAge : Int = readln().toInt()

    if (userAge in 1..17){
        println("Underage")
    } else if (userAge in 18..30){
        println("Young Adult")
    } else if (userAge in 31..59){
        println("Adult")
    } else if (userAge >= 60){
        println("Senior")
    } else if (userAge <=0){
       println("Invalid Age")
    }

}