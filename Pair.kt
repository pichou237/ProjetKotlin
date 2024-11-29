// Écrire une fonction qui détermine si un nombre est pair ou impair.

fun PairImpair(a:Int):Boolean{
    if (a%2 == 0){
        return true
    }else{
        return false
    }
}

fun main(){

    println("Entrer un nombre :")
    var num:Int = readLine()!!.toInt()

    if (PairImpair(num)){
        println("$num est paire")
    }else{
        println("$num est Impaire")
    }

}