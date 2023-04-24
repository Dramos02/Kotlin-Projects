import java.math.RoundingMode
import java.text.DecimalFormat
fun main(){

    print("Enter Product: ")
    var prodName : String = readln().toString()

    print("Enter Price: ")
    var prodPrice : Double = readln().toDouble()

    var df = DecimalFormat("#,###,###.00")
    var df2 = DecimalFormat("#,###,###.0")
    df2.roundingMode = RoundingMode.DOWN
    df.roundingMode = RoundingMode.DOWN

    var discount1st : Double =  prodPrice * 0.00; var netPrice1st : Double = prodPrice - discount1st
    var discount2nd: Double =  prodPrice * 0.05 ; var netPrice2nd: Double = prodPrice - discount2nd
    var discount3rd : Double = prodPrice * 0.10; var netPrice3rd : Double = prodPrice - discount3rd
    var discount4th : Double = prodPrice * 0.15 ; var netPrice4th : Double = prodPrice - discount4th
    var discount5th : Double= prodPrice * 0.20; var netPrice5th : Double=  prodPrice -discount5th

    println("\nPrice of $prodName is ${df.format(prodPrice)}")
    if (prodPrice in 0.0..10000.0){
        println("Discount is ${df.format(discount1st)}"
                +"\nNet Price is ${df2.format(netPrice1st)}")
    }else if (prodPrice in 10001.0..20000.0){
        println("Discount is ${df.format(discount2nd)}"
                +"\nNet Price is ${df2.format(netPrice2nd)}")
    }else if (prodPrice in 20001.0..50000.0){
        println("Discount is ${df.format(discount3rd)}"
                +"\nNet Price is ${df2.format(netPrice3rd)}")
    }else if (prodPrice in 50001.0..100000.0){
        println("Discount is ${df.format(discount4th)}"
                +"\nNet Price is ${df2.format(netPrice4th)}")
    }else if (prodPrice > 100000){
        println("Discount is ${df.format(discount2nd)}"
                +"\nNet Price is ${df2.format(netPrice2nd)}")
    }
}

//Coded by DOMINIC O. RAMOS copyrights © https://github.com/Dramos02