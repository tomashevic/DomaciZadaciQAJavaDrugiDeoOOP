package Biblioteka;

public class RomanoPisac extends Pisac {
    public RomanoPisac(String ime, int godinaRodjenja) {
        super(ime, godinaRodjenja);
    }

    public String dugometrazniRoman(Knjiga k) {
        if (k.getBrojStrana() > 500) {
            return "dugometrazni roman";
        } else {
            return "NIJE dugometražni roman";
        }
    }
}
