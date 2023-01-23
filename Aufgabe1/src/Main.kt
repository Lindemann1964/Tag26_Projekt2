// Mit dem Schlüsselwort class kann eine Klasse erstellt werden.
// Hier erstellen wir eine Klasse mit dem Namen Bus.
class Bus {


    // Bis jetzt ist unsere Klasse leer und kann noch nichts.
    // Als Erstes geben wir unsere Klasse eine Eigenschaft.
    // Unser Bus soll 500 PS haben.
    // Eine Eigenschaft ist eine Variable/Konstante innerhalb einer Klasse.
    var horsePower = 500

    // Wir wollen, dass ein Bus hupen kann, also erstellen wir eine Methode mit dem Namen "honk".
    // Eine Methode ist eine Funktion, die in einer Klasse definiert ist.
    fun honk() {
        println("Huuuup, Huuuup")
    }


    // Wir wollen, dass ein Bus eine Durchsage "Bitte aussteigen" machen kann.
    // Erstelle eine Methode mit dem Namen "durchsage", die eine Durchsage in der Konsole ausgibt.
    fun durchsage(){
        println("Bitte Aussteigen")
    }
}

fun main() {
    // Wir haben jetzt genau einen Bauplan (die Klasse Bus).
    // Aus dem Bauplan können wir beliebig viele Busse erstellen.
    // Ein erstellter Bus heißt "Objekt" oder auch "Instanz".
    // So erstellen wir 3 Busse.
    var firstBus: Bus = Bus()
    var secondBus: Bus = Bus()
    var thirdBus: Bus = Bus()

    // Über die Punktnotation (Der Punkt "." nach dem Variablennamen) können alle Methoden des Busses verwendet werden.
    // Zum Beispiel die "honk" Methode.
    firstBus.honk()
    firstBus.durchsage()

    // Auch über die Punktnotation können wir Eigenschaften des Busses verwenden.
    // Hier geben wir in der Konsole aus, wieviel PS unser Bus hat.
    val ps = firstBus.horsePower
    println("Ganze $ps PS hat unser Bus.")

    // Hier verändern wir die Anzahl PS von unserem ersten Bus.
    // Wir erhöhen die PS von unserem Bus von 500 auf 750 PS. Ein ziemlich starker Bus.
    firstBus.horsePower = 750
    var newPs = firstBus.horsePower
    println("Jetzt hat unser Bus sogar $newPs PS!")

    // Beachte hierbei, dass wir nur die PS von unserem ersten Bus angepasst haben.
    // Der zweite und der dritte Bus haben immer noch nur 500 PS.
    println("PS des zweiten Busses: ${secondBus.horsePower}")
    println("PS des dritten Busses: ${thirdBus.horsePower}")

    // Nachdem euer erstellter Bus einmal gehupt hat, soll über einen Funktionsaufruf die Durchsage getätigt werden.
    // Hier drunter könnten ihr weitercoden:

}