package Sport;

import java.util.ArrayList;

public abstract class Klub {
    private String naziv;
    private String grad;
    private ArrayList<Igrac> listaIgraca;

    public Klub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        this.naziv = naziv;
        this.grad = grad;
        this.listaIgraca = listaIgraca;
    }

    public abstract double vrednostTima();

    public int ukupnoPoena() {
        int sviPoeni = 0;
        for (int i = 0; i < getListaIgraca().size(); i++) {
            sviPoeni += getListaIgraca().get(i).getBrPoena();
        }
        return sviPoeni;
    }

    public String najiskusnijiIgrac() {
        String veteran = " ";
        int maxGod = Integer.MIN_VALUE;
        for (Igrac i : getListaIgraca()) {
            if (i.getGodIskustva() > maxGod) {
                maxGod = i.getGodIskustva();
                veteran = i.getIme();
            }
        }
        return veteran;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public ArrayList<Igrac> getListaIgraca() {
        return listaIgraca;
    }

    public void setListaIgraca(ArrayList<Igrac> listaIgraca) {
        this.listaIgraca = listaIgraca;
    }

    public String toString() {
        return naziv + " " + grad + " " + listaIgraca;
    }
}
