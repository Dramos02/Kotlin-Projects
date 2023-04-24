import java.text.DecimalFormat

fun main(){
    print("Enter Length: ")
    var length : Double = readln().toDouble()

    print("Enter Width: ")
    var width : Double = readln().toDouble()

    var perimeterRectangle : Double = 2*(length + width)
    var areaRectangle : Double = length * width

    var df = DecimalFormat("#,###,###.00")

    println("\nPerimeter is ${df.format(perimeterRectangle)} meters"
            +"\nArea is ${df.format(areaRectangle)} meter")

}

//Coded by DOMINIC O. RAMOS copyrights © https://github.com/Dramos02