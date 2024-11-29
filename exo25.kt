/*
*       25. Créer une fonction qui affiche les nombres de 1 à 100, mais pour les multiples de 3 afficher 'Fizz',
*               pour les multiples de 5 afficher 'Buzz', et pour les multiples de 15 afficher 'FizzBuzz'.
* */

fun main (){

    // boucle for
    for (index in 1..100){
        if((index % 3 == 0) && (index % 5 == 0)){
            println("FizzBuzz")
        }
        if((index % 3 == 0) && (index % 5 != 0)){
            println("Fizz")
        }
        if((index % 3 != 0) && (index % 5 == 0)){
            println("Buzz")
        }
        if((index % 3 != 0) && (index % 5 != 0)){
            println("$index")
        }
    }
}