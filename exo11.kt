/*
* Créer une fonction qui prend un tableau de nombres et retourne le plus grand nombre.
* */

fun trouverPlusGrandNombre(array: Array<Int>): Int {
    // Vérifie si le tableau n'est pas vide
    if (array.isEmpty()) {
        throw IllegalArgumentException("Le tableau ne doit pas être vide")
    }

    // Utilisation de la fonction maxOrNull() pour trouver le plus grand nombre
    val max = array.maxOrNull()

    // Retourne le plus grand nombre (non null car le tableau n'est pas vide)
    return max!!
}

fun main() {
    // Exemple de tableau
    val nombres = arrayOf(10, 55, 8, 23, 99, 45)

    // Appel de la fonction et affichage du plus grand nombre
    val plusGrand = trouverPlusGrandNombre(nombres)
    println("Le plus grand nombre du tableau est : $plusGrand")
}
