// Écrire une fonction qui prend deux nombres entiers en paramètres et retourne leur somme

fun SumTwoNumber (a:Int ,b:Int): Int {
    return a+b
}

// function principal
fun main(){
    var num1:Int = 20
    var num2:Int = 10

    val sum: Int =SumTwoNumber(num1,num2)

    println("$num1 + $num2 = $sum")
}