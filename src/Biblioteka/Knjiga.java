package Biblioteka;

public class Knjiga {

    private String naslov;
    private int brojStrana;
    private int godinaIzdanja;

    public Knjiga(String naslov, int brojStrana, int godinaIzdanja) {

        this.naslov = naslov;
        this.brojStrana = brojStrana;
        this.godinaIzdanja = godinaIzdanja;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String novNaslov) {
        this.naslov = naslov;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int novBrojStrana) {
        this.brojStrana = novBrojStrana;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int novaGodinaIzdanja) {
        this.godinaIzdanja = novaGodinaIzdanja;
    }

    public String toString() {
        return naslov + " " + brojStrana + " " + godinaIzdanja;
    }
}
