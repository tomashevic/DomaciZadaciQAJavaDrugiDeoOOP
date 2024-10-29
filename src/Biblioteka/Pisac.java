package Biblioteka;

import java.util.ArrayList;

public abstract class Pisac {

    private String ime;
    private int godinaRodjenja;
    private ArrayList<Knjiga> listaKnjiga;

    public Pisac(String ime, int godinaRodjenja) {
        this.ime = ime;
        this.godinaRodjenja = godinaRodjenja;
        listaKnjiga = new ArrayList<Knjiga>();
    }

    public String najpoznatijaKnjiga() {

        int max = Integer.MIN_VALUE;
        String naziv = "";
        for (Knjiga k : listaKnjiga) {
            if (k.getBrojStrana() > max) {
                max = k.getBrojStrana();
                naziv = k.getNaslov();
            }
        }
        return naziv;
    }

    public int vremePisanja() {
        int maxGod = Integer.MIN_VALUE;
        int minGod = Integer.MAX_VALUE;
        for (Knjiga k : listaKnjiga) {
            if (k.getGodinaIzdanja() > maxGod) {
                maxGod = k.getGodinaIzdanja();
            }
            if (k.getGodinaIzdanja() < minGod) {
                minGod = k.getGodinaIzdanja();
            }
        }
        return maxGod - minGod;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public ArrayList<Knjiga> getListaKnjiga() {
        return listaKnjiga;
    }

    public void setListaKnjiga(ArrayList<Knjiga> listaKnjiga) {
        this.listaKnjiga = listaKnjiga;
    }

    public String toString() {
        return ime + " " + godinaRodjenja;
    }
}
