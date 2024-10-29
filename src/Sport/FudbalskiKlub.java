package Sport;

import java.util.ArrayList;

public class FudbalskiKlub extends Klub {
    public FudbalskiKlub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    public String najboljiStrelac() {
        int golovi = Integer.MIN_VALUE;
        String strelac = "";
        for (Igrac i : getListaIgraca()) {
            if (i.getBrPoena() > golovi) {
                golovi = i.getBrPoena();
                strelac = i.getIme();
            }
        }
        return strelac;
    }

    @Override
    public double vrednostTima() {
        return 1000 * ukupnoPoena();
    }
}
