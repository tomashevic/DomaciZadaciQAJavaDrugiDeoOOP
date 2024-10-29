package Menjacnica;

public class Dolar extends Valuta {

    public Dolar(double kurs) {
        super("Dolar", "USD", kurs);
    }

    public void postaviKursNovi(double kurs) {
        setKurs(kurs);
    }
}
