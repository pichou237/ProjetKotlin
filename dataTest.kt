
data class dataTest(val nom: String, val email: String, val âge: Int)

fun main() {
    val utilisateur = dataTest("Alice", "alice@example.com", 25)
    println(utilisateur.toString())
    println(utilisateur.hashCode())
    println(utilisateur.hashCode())
    println(utilisateur.copy())
}
