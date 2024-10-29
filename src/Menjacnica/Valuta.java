package Menjacnica;

public class Valuta {

    private String naziv;
    private String simbol;
    private double kurs;

    public Valuta(String naziv, String simbol, double kurs) {
        this.naziv = naziv;
        this.simbol = simbol;
        this.kurs = kurs;
    }
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String novNaziv) {
        this.naziv = naziv;
    }

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String novSimbol) {
        this.simbol = simbol;
    }

    public double getKurs() {
        return kurs;
    }

    public void setKurs(double novKurs) {
        this.kurs = novKurs;
    }

    public double konvertujUdinare(double iznos) {
        return iznos * getKurs();
    }

    public String toString() {
        return "Valuta naziv: " + naziv +
                ", simbol: " + simbol +
                ", kurs: " + kurs;
    }
}
