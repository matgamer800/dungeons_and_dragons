package Player

class Habilidade {
    var Forca:Int
    var Destreza:Int
    var Constituicao:Int
    var Inteligencia:Int
    var Sabedoria:Int
    var Carisma:Int

    constructor(forc:Int,dest:Int,const:Int,inte:Int,sabe:Int,cari:Int){
        var pontos:Int = 0
        this.Forca = 0
        this.Destreza = 0
        this.Constituicao = 0
        this.Inteligencia = 0
        this.Sabedoria = 0
        this.Carisma = 0
        var cust:Int = 27
        

        for (i in 0..6) {
            when (i) {
                1 -> pontos = forc
                2 -> pontos = dest
                3 -> pontos = const
                4 -> pontos = inte
                5 -> pontos = sabe
                6 -> pontos = cari
            }
            if(pontos > cust){
                pontos = 0
            }
            //para pontos maiores que os custos maiores, deixamos em 9
            else if (pontos > 9){
                pontos = 9
            }
            when (pontos){
                0 -> pontos = 8
                1 -> pontos = 9
                2 -> pontos = 10
                3 -> pontos = 11
                4 -> pontos = 12
                5 -> pontos = 13
                7 -> pontos = 14
                9 -> pontos = 15
            }

            when (i){
                1 -> {
                    cust = cust - forc
                    this.Forca = pontos
                }
                2 -> {
                    cust = cust - dest
                    this.Destreza = pontos
                }
                3 -> {
                    cust = cust - const
                    this.Constituicao = pontos
                }
                4 -> {
                    cust = cust - inte
                    this.Inteligencia = pontos
                }
                5 -> {
                    cust = cust - sabe
                    this.Sabedoria = pontos
                }
                6 -> {
                    cust = cust - cari
                    this.Carisma = pontos
                }
            }

        }

    }

    fun exibir(){
        println("Força " + this.Forca)
        println("Destreza "+ this.Destreza)
        println("Cosntituição "+this.Constituicao)
        println("Inteligencia "+ this.Inteligencia)
        println("Sabedoria "+this.Sabedoria)
        println("Carisma "+this.Carisma)
    }

    fun atualizarHabilidade(hab:Array<Int>){
        var forc =hab[0]
        var dest = hab[1]
        var const = hab[2]
        var inte = hab[3]
        var sabe = hab[4]
        var cari = hab[5]

        this.Forca = Forca + forc
        this.Destreza = Destreza + dest
        this.Constituicao = Constituicao + const
        this.Inteligencia = Inteligencia + inte
        this.Sabedoria = Sabedoria + sabe
        this.Carisma = Carisma + cari
    }

    fun Calcvida(vida:Int) : Int{

        var pont:Int = 0
        var pontos:Int = 0

        for (i in 1 .. 6) {

            when (i) {
                1 -> pontos = this.Forca
                2 -> pontos = this.Destreza
                3 -> pontos = this.Constituicao
                4 -> pontos = this.Inteligencia
                5 -> pontos = this.Sabedoria
                6 -> pontos = this.Carisma
            }
            when (pontos) {
                1 -> pont = pontos - 5
                2, 3 -> pont = pontos - 4
                4, 5 -> pont = pontos - 3
                6, 7 -> pont = pontos - 2
                8,9 -> pont = pontos - 1
                10, 11 -> pont = pontos + 0
                12, 13 -> pont = pontos + 1
                14, 15 -> pont = pontos + 2
                16, 17 -> pont = pontos + 3
                18, 19 -> pont = pontos + 4
                20, 21 -> pont = pontos + 5
                22, 23 -> pont = pontos + 6
                24, 25 -> pont = pontos + 7
                26, 27 -> pont = pontos + 8
                28, 29 -> pont = pontos + 9
                30 -> pont = pontos + 10
            }
            when (i) {
                1 -> this.Forca = pont
                2 -> this.Destreza = pont
                3 -> this.Constituicao = pont
                4 -> this.Inteligencia = pont
                5 -> this.Sabedoria = pont
                6 -> this.Carisma = pont
            }

        }

        pont = 0
        when(this.Constituicao){
            1 -> pont=vida-5
            2,3 ->pont=vida-4
            4,5->pont=vida-3
            6,7 ->pont=vida-2
            8,9 ->pont=vida-1
            10,11->pont=vida+0
            12,13 ->pont=vida+1
            14,15 ->pont=vida+2
            16,17 ->pont=vida+3
            18,19 ->pont=vida+4
            20,21 ->pont=vida+5
            22,23 ->pont=vida+6
            24,25 ->pont=vida+7
            26,27 ->pont=vida+8
            28,29 ->pont=vida+9
            30 ->pont=vida+10
        }

        return pont
    }



}




