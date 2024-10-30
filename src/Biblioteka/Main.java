package Biblioteka;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Knjiga k1 = new Knjiga("Naslov1", 600, 1991);
        Knjiga k2 = new Knjiga("Naslov2", 95, 2005);
        Knjiga k3 = new Knjiga("Naslov3", 850, 2015);
        Knjiga k4 = new Knjiga("Naslov4", 340, 1978);
        Knjiga k5 = new Knjiga("Naslov5", 35, 1985);
        Knjiga k6 = new Knjiga("Naslov6", 48, 1995);
        Knjiga k7 = new Knjiga("Naslov7", 88, 1989);
        Knjiga k8 = new Knjiga("Naslov8", 570, 1971);
        Knjiga k9 = new Knjiga("Naslov9", 75, 2003);
        Knjiga k10 = new Knjiga("Naslov10", 720, 2007);


        ArrayList<Knjiga> listaKnjige1 = new ArrayList<Knjiga>();
        listaKnjige1.add(k1);
        listaKnjige1.add(k2);
        listaKnjige1.add(k3);
        listaKnjige1.add(k4);
        listaKnjige1.add(k5);
        listaKnjige1.add(k6);
        listaKnjige1.add(k7);
        listaKnjige1.add(k8);
        listaKnjige1.add(k9);
        listaKnjige1.add(k10);

        System.out.println(k1);

        RomanoPisac rp = new RomanoPisac("Marko Markovic", 1960);
        Pesnik p = new Pesnik("Pera Peric", 1950);
        Esejista e = new Esejista("Jovana Jovic", 1965);
        System.out.println(rp);

        rp.setListaKnjiga(listaKnjige1);
        p.setListaKnjiga(listaKnjige1);
        e.setListaKnjiga(listaKnjige1);

        String najpoznatija = rp.najpoznatijaKnjiga();
        System.out.println("Najpoznatija knjiga je: " + najpoznatija);

        int razlika = rp.vremePisanja();
        System.out.println("Razlika između godine izdavanja prve i poslednje knjige je " + razlika + " godine.");

        ArrayList<String> dugometrazni = rp.dugometrazniRomani(listaKnjige1);
        if (dugometrazni.size() == 0) {
            System.out.println("Nema romana sa vise od 500 strana!");
        } else {
            System.out.println("Romani koji imaju vise od 500 strana su: " + dugometrazni);
        }

        System.out.println("Ukupan broj zbirki je: " + p.brojZbirki());

        System.out.println("Ukupan broj kratkih eseja je: " + e.kratkiEseji());

    }
}
