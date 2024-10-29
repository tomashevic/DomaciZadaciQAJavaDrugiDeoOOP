package Sport;

import java.util.ArrayList;

public class KosarkaskiKlub extends Klub {
    public KosarkaskiKlub(String naziv, String grad, ArrayList<Igrac> listaIgraca) {
        super(naziv, grad, listaIgraca);
    }

    public String sampionTima() {
        String sampion = "";
        int hiljaduplus = Integer.MIN_VALUE;
        for (int i = 0; i < getListaIgraca().size(); i++) {
            if (getListaIgraca().get(i).getBrPoena() > 1000) {
                if (getListaIgraca().get(i).getBrPoena() > hiljaduplus) {
                    hiljaduplus = getListaIgraca().get(i).getBrPoena();
                    sampion = getListaIgraca().get(i).getIme();
                }
            }
        }
        if (sampion.equalsIgnoreCase("")) {
            sampion = "U timu nema igraca koji su postigli preko 1000 poena!";
        }
        return sampion;
    }

    @Override
    public double vrednostTima() {
        return 50 * ukupnoPoena();
    }
}
