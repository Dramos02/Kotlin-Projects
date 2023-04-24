import java.text.DecimalFormat
fun main(args: Array<String>) {
    print("Enter Length: ")
    var l : Double = readln().toDouble()
    print("Enter Width: ")
    var w : Double = readln().toDouble()
    calculatePerimeter(l,w)
    calculateArea(l,w)

}

fun calculatePerimeter(length: Double, width: Double) {
    var df = DecimalFormat("#,###,###.00")
    var perimeterRectangle  = 2*(length + width)
    println("\nPerimeter is ${df.format(perimeterRectangle)} meters")
}

fun calculateArea(length: Double, width: Double){
    var df = DecimalFormat("#,###,###.00")
    var areaRectangle  = length * width
    println("Area is ${df.format(areaRectangle)} meters")
}

//Coded by DOMINIC O. RAMOS copyrights © https://github.com/Dramos02