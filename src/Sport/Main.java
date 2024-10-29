package Sport;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Igrac i1 = new Igrac("Marko Markovic", 5, 750);
        Igrac i2 = new Igrac("Pera Peric", 8, 1050);
        Igrac i3 = new Igrac("Janko Jankovic", 2, 350);

        ArrayList<Igrac> listaIgraca = new ArrayList<>();
        listaIgraca.add(i1);
        listaIgraca.add(i2);
        listaIgraca.add(i3);

        Igrac i4 = new Igrac("Milos Milosevic", 4, 670);
        Igrac i5 = new Igrac("Zoran Zoric", 7, 430);
        Igrac i6 = new Igrac("Stefan Stefanovic", 3, 780);

        ArrayList<Igrac> listaIgraca2 = new ArrayList<>();
        listaIgraca2.add(i4);
        listaIgraca2.add(i5);
        listaIgraca2.add(i6);

        Klub k = new KosarkaskiKlub("Partizan", "Beograd", listaIgraca2);
        System.out.println("Najiskusniji igrac u Partizanu je " + k.najiskusnijiIgrac() + ".");
        System.out.println("Ukupan broj postignutih poena iznosi: " + k.ukupnoPoena());
        System.out.println("Vrednost kluba Partizan iznosi: " + k.vrednostTima());

        KosarkaskiKlub k1 = new KosarkaskiKlub("Trail blazers", "Portland", listaIgraca);
        KosarkaskiKlub k2 = new KosarkaskiKlub("Lakers", "Los Angeles", listaIgraca2);

        FudbalskiKlub f1 = new FudbalskiKlub("Chelsea", "London", listaIgraca);
        FudbalskiKlub f2 = new FudbalskiKlub("Manchester United", "Manchester", listaIgraca2);

        OdbojkaskiKlub o1 = new OdbojkaskiKlub("Vojvodina", "Novi Sad", listaIgraca);
        OdbojkaskiKlub o2 = new OdbojkaskiKlub("Partizan", "Beograd", listaIgraca2);

        System.out.println("Sampion Portland Trail Blazers-a je " + k1.sampionTima() + ".");
        System.out.println("[[[>>>Provera za negativan secenario<<<]]]");
        System.out.println(k2.sampionTima());
        System.out.println("Vrednost Lejkersa iznosi: " + k1.vrednostTima());
        System.out.println("Najbolji strelac Mancestera je " + f2.najboljiStrelac() + ".");
        System.out.println("Vrednost FK Chelsea iznosi: " + f1.vrednostTima());
        System.out.println("Igrac sa najvise poena a da je igrao manje od 3 godine je " + o1.odbrambeniAs() + ".");
        System.out.println("[[[>>>Provera za negativan scenario<<<]]]");
        System.out.println(o2.odbrambeniAs());
        System.out.println("Vrednost OK Vojvodina iznosi: " + o1.vrednostTima());

    }
}