package Biblioteka;

import java.util.ArrayList;

public class RomanoPisac extends Pisac {
    public RomanoPisac(String ime, int godinaRodjenja) {
        super(ime, godinaRodjenja);
    }

    public ArrayList<String> dugometrazniRomani(ArrayList<Knjiga> lista) {
        ArrayList<String> prekoPetsto = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getBrojStrana() > 500) {
                prekoPetsto.add(lista.get(i).getNaslov());
            }
        }
        return prekoPetsto;
    }
}
