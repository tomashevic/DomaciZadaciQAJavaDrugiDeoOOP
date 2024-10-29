package Sport;

public class Igrac {
    private String ime;
    private int godIskustva;
    private int brPoena;

    public Igrac(String ime, int godIskustva, int brPoena) {
        this.ime = ime;
        this.godIskustva = godIskustva;
        this.brPoena = brPoena;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodIskustva() {
        return godIskustva;
    }

    public void setGodIskustva(int godIskustva) {
        this.godIskustva = godIskustva;
    }

    public int getBrPoena() {
        return brPoena;
    }

    public void setBrPoena(int brPoena) {
        this.brPoena = brPoena;
    }

    @Override
    public String toString() {
        return ime + " " + godIskustva + " " + brPoena;
    }
}
