package Player

import Classes.Classes
import Raca.Racas


class Player {
    val Nome: String
    val Raca:Racas
    val Classe:Classes
    val HabilidadePlayer:Habilidade
    var Vida:Int =10
    var Nivel:Int = 1
    var Xp:Float =0.0f

    constructor(nome:String, habilidade: Habilidade,racas: Racas,classes: Classes){
        this.Nome = nome
        this.Classe = classes
        this.Raca = racas
        var arrayRaca: Array<Int>
        arrayRaca = this.Raca.HabilidadeRaca()
        habilidade.atualizarHabilidade(arrayRaca)
        this.HabilidadePlayer = habilidade
        Vida = HabilidadePlayer.Calcvida(Vida)
    }
    fun exibirplayer(){
        println()
        println("Nome: "+this.Nome)
        println()

        print("Raça: ")
        this.Raca.definirRaca()
        println()
        println()
        print("Classe: ")
        this.Classe.definirClasse()
        println()
        println()
        println("Habilidades:")
        this.HabilidadePlayer.exibir()

        println()
        println("Pontos de Vida: "+this.Vida)
        println()
        println("Nivel: "+ this.Nivel)
    }
    /*
        Apenas para ter a ideia:
        Não deixar que realize o import na main
        deve-se utilizar when para definir classes e racas
        
    */



}
