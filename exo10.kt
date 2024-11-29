/*
*  9. Écrire un programme qui utilise un tableau pour stocker les notes d'un élève et calcule la moyenne.
* */

fun main() {
    // Crée une liste mutable pour stocker les notes
    val notes = mutableListOf<Double>()

    // Saisie de la taille du tableau
    println("Entrez la taille du tableau : ")
    val len: Int = readLine()!!.toInt()

    var somme: Double = 0.0

    // Boucle pour entrer les notes
    for (index in 0 until len) {
        println("Entrez la ${index + 1}e note :")
        var note: Double = readLine()!!.toDouble()

        while(note>20 || note<0){
            println("Entrez la ${index + 1}e note :")
             note = readLine()!!.toDouble()
        }

        // Ajout des notes dans la liste
        notes.add(note)

        // Somme des notes pour le calcul de la moyenne
        somme += note
    }

    // Affiche les notes saisies
    println("Notes : $notes")

    // Calcul de la moyenne
    val moyenne: Double = somme / len
    println("La moyenne est : $moyenne")
}
