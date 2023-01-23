fun main (){
    var mitarbeiter1= Mitarbeiter()
    var mitarbeiter2= Mitarbeiter()
    var mitarbeiter3= Mitarbeiter()

    mitarbeiter1.id=2345
    mitarbeiter1.name="Otto"
    mitarbeiter1.gehalt=1230
    mitarbeiter1.artDerBeschäftigung= "Teilzeit"
    mitarbeiter1.mutterschaftsUrlaub= false
    mitarbeiter1.befördern()

    mitarbeiter2.id=3456
    mitarbeiter2.name="Emil"
    mitarbeiter2.gehalt=1240
    mitarbeiter2.artDerBeschäftigung="Homeoffice"
    mitarbeiter2.mutterschaftsUrlaub=false
    mitarbeiter2.gehaltAusgeben()

    mitarbeiter3.id=4567
    mitarbeiter3.name="Ulla"
    mitarbeiter3.gehalt=1250
    mitarbeiter3.artDerBeschäftigung="Vollzeit"
    mitarbeiter3.mutterschaftsUrlaub=true
    mitarbeiter3.istVerfuegbar()



}