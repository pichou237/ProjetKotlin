/*
*   Écrire une fonction qui prend une chaîne de caractères et retourne sa longueur.
* */

fun lenghtString( arrayString : String) : Int{
    var len = arrayString.length
    return len
}

fun main(){
    println("Entrez un chaine de caractere : ")
    var string : String = readln()

    println("$string est de longueur ${lenghtString(string)}")
}