class Mitarbeiter {
    var id = 123456
    var name = "Hans"
    var gehalt = 1200
    var artDerBeschäftigung = "Leifarbeiter"
    var mutterschaftsUrlaub = false

    fun gehaltAusgeben() {
        println(name)
        println(gehalt)


    }

    fun befördern() {
        artDerBeschäftigung = "Fest"
        println(artDerBeschäftigung)
        gehalt = +250
        println(gehalt)

    }

    fun istVerfuegbar() {

        if (mutterschaftsUrlaub) {
            println(mutterschaftsUrlaub)

        } else {
            println(mutterschaftsUrlaub)
        }
    }

}

