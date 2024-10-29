package Menjacnica;

public class Main {

    public static void main(String[] args) {

        Dolar d = new Dolar(105.00);
        Euro e = new Euro(115.00);

        double dolariIznos = 30, euriIznos = 50;

        System.out.println(d);
        System.out.println(dolariIznos + " USD = " + d.konvertujUdinare(dolariIznos) + " RSD");
        System.out.println(e);
        System.out.println(euriIznos + " EUR = " + e.konvertujUdinare(euriIznos) + " RSD");

        System.out.println(" ");
        System.out.println("NOVI KURS");
        d.postaviKursNovi(111.00);
        e.postaviKursNovi(117.30);

        System.out.println(d);
        System.out.println(dolariIznos + " USD = " + d.konvertujUdinare(dolariIznos) + " RSD");

        System.out.println(e);
        System.out.println(euriIznos + " EUR = " + e.konvertujUdinare(euriIznos) + " RSD");

    }
}
