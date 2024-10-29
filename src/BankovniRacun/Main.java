package BankovniRacun;

public class Main {
    public static void main(String[] args) {


        BankovniRacun br = new BankovniRacun(54321, "James", 15000);
        System.out.println(br);

        br.uplata();
        System.out.println(" ");
        br.isplata();
        System.out.println("Trenutno stanje na racunu je: " + br.getTrenutnoStanje());

    }
}
