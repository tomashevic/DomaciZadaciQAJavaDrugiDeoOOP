package Menjacnica;

public class Euro extends Valuta {

    public Euro(double kurs) {
        super("Euro", "EUR", kurs);
    }

    public void postaviKursNovi(double kurs) {
        setKurs(kurs);
    }
}
