package Biblioteka;

public class Pesnik extends Pisac {
    public Pesnik(String ime, int godinaRodjenja) {
        super(ime, godinaRodjenja);

    }

    public int brojZbirki() {
        int brojac = 0;
        for (Knjiga k : getListaKnjiga()) {
            if (k.getBrojStrana() >= 50 && k.getBrojStrana() < 100) {
                brojac++;
            }
        }
        return brojac;
    }
}
