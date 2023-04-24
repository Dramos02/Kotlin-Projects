import java.text.DecimalFormat

fun main(){
    var sales = ArrayList<Double>()
    var athletes = ArrayList<String>()
    var x : Int = 1

    for(ctr in 1 .. 5){
        print("Enter Athlete$ctr: ")
        var athleteName : String = readln().toString()
        athletes.add(athleteName)
        print("Enter Sales: ")
        var athleteSales : Double = readln().toDouble()
        sales.add(athleteSales)
        println()
    }

    var df = DecimalFormat("$#,###,###.00")
    var totalSales : Double = 0.00
    println("TopSportsMan")
    println("Name\t\tSales")
    println("===================================")

    for (index in 0 until athletes.size){
        println(athletes[index] + "\t\t" + df.format(sales[index]))
        totalSales += sales[index]
    }
    println("===================================")
    println("Total\t\t${df.format(totalSales)}")
}

//Coded by DOMINIC O. RAMOS copyrights © https://github.com/Dramos02