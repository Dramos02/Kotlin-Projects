fun main(){
    var ingredients = ArrayList<String>()
    var instructions = ArrayList<String>()
    var x : Int = 1

    print("Enter RecipeName: ")
    var dishName : String = readln().toString()

    for(ctr in 1 .. 5){
        print("Add ingredients: ")
        var items : String = readln().toString()
        ingredients.add(items)
        print("Add Instructions: ")
        var steps : String = readln().toString()
        instructions.add(steps)
        println()
    }


    for (index in 0 until ingredients.size){
        println(ingredients[index] + "\t\t" + ingredients[index])
    }
    println("===================================")
}
//Copyrights © https://github.com/Dramos02
