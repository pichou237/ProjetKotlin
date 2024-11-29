/**
 * 7. Créer une classe 'Personne' avec des attributs pour le nom et l'âge.
 *   Instancier un objet de cette classe et afficher ses attributs.
 */



class Personne() {

    //attributs
     var Name : String ?=null
     var age : Int ?= null

    //constructeeur
    constructor( Name : String , age : Int):this(){
        this.Name = Name
        this.age = age
    }

    fun SePresenter(){
        println("je m'appele $Name , j'ai $age")
    }

}

fun main(){
    // instantiation d'une personne
    var personne1: Personne = Personne()

    personne1.SePresenter()

    personne1.Name = "steph"
    personne1.age = 19

    personne1.SePresenter()
}