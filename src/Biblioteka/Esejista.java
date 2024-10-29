package Biblioteka;

public class Esejista extends Pisac {
    public Esejista(String ime, int godinaRodjenja) {
        super(ime, godinaRodjenja);

    }

    public int kratkiEseji() {
        int brojac = 0;
        for (Knjiga k : getListaKnjiga()) {
            if (k.getBrojStrana() < 50) {
                brojac++;
            }
        }
        return brojac;
    }
}
