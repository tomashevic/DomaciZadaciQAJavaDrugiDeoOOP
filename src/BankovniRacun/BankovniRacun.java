package BankovniRacun;

import java.util.Scanner;

public class BankovniRacun {

    private int brojRacuna;
    private String ime;
    private double trenutnoStanje;

    public BankovniRacun(int brojRacuna, String ime, double trenutnoStanje) {

        this.brojRacuna = brojRacuna;
        this.ime = ime;
        this.trenutnoStanje = trenutnoStanje;
    }

    public int getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(int noviBrojRacuna) {
        this.brojRacuna = noviBrojRacuna;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String novoIme) {
        this.ime = novoIme;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public void setTrenutnoStanje(double novoTrenutnoStanje) {
        this.trenutnoStanje = novoTrenutnoStanje;
    }

    public double uplata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite iznos za uplatu: ");
        double uplata = sc.nextDouble();
        if (uplata > 0) {
            setTrenutnoStanje(getTrenutnoStanje() + uplata);
        } else {
            System.out.println("Iznos uplate mora biti pozitivan!");
        }
        return getTrenutnoStanje();
    }

    public double isplata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite iznoz za isplatu: ");
        double isplata = sc.nextDouble();
        if (isplata > 0) {
            if (isplata <= getTrenutnoStanje()) {
                setTrenutnoStanje(getTrenutnoStanje() - isplata);
            } else {
                System.out.println("Nemate dovoljno sredstava na racunu");
            }
        } else {
            System.out.println("Iznos isplate more biti pozitivan!");
        }
        return getTrenutnoStanje();
    }

    public String toString() {
        return brojRacuna + " " + ime + " " + trenutnoStanje;
    }
}
