import java.text.DecimalFormat

fun main(){
    print("Enter name Of Student: ")
    var studentName : String = readln().toString()

    print("Enter units enrolled: ")
    var unitsEnrolled : Int = readln().toInt()

    print("Enter price per unit: ")
    var pricePerUnit : Double = readln().toDouble()

    var df = DecimalFormat("#,###,###.00")
    var computedTuitionFee : Double = unitsEnrolled * pricePerUnit
    var cashPayment: Double = computedTuitionFee - 0.1 * computedTuitionFee
    var twoInstallment: Double = computedTuitionFee + 0.05 * computedTuitionFee
    var thirdInstallment: Double = computedTuitionFee + 0.1 * computedTuitionFee

    println("\n$studentName, you could available the following payment mode: "
            + "\nComputed Tuition fee: ${df.format(computedTuitionFee)}"
            + "\n\nPayment Mode: "
            + "\nCash Payment: ${df.format(cashPayment)}"
            + "\n2-installment: ${df.format(twoInstallment)}"
            + "\n3-installment: ${df.format(thirdInstallment)}")
}

//Coded by DOMINIC O. RAMOS copyrights © https://github.com/Dramos02