fun main(args: Array<String>) {
    var loopChecker : Boolean = true
    while(loopChecker == true) {
        try {
            print("Enter number: ")
            var number: Int = readln().toInt()
            fibonacciGenerator(number)
            loopChecker = false
        }
        catch (e: NumberFormatException) {
            println("INVALID. Please enter a NUMBER")
            loopChecker = true
        }
    }
}
fun fibonacciGenerator(sequence : Int) {
    var sequence1 = 1
    var sequence2 = 1

        while (sequence1 <= sequence) {
            print("$sequence1 ")

            val fibonacciSequence = sequence1 + sequence2
            sequence1 = sequence2
            sequence2 = fibonacciSequence
        }
}

//Coded by DOMINIC O. RAMOS copyrights © https://github.com/Dramos02