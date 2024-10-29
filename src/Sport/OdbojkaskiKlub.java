package Sport;

import java.util.ArrayList;

public class OdbojkaskiKlub extends Klub {
    public OdbojkaskiKlub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    public String odbrambeniAs() {
        String as = "";
        int uslovBrPoena = Integer.MIN_VALUE;
        for (Igrac i : getListaIgraca()) {
            if (i.getGodIskustva() < 3) {
                if (i.getBrPoena() > uslovBrPoena) {
                    uslovBrPoena = i.getBrPoena();
                    as = i.getIme();
                }
            }
        }
        if (as.equals("")) {
            as = "U timu nema igraca sa manje od 3 godine iskustva!";
        }
        return as;
    }

    @Override
    public double vrednostTima() {
        return 100 * ukupnoPoena();
    }
}
