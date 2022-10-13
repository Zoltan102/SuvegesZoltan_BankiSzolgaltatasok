package hu.petrik.bankiszolgaltatasok;

public class HitelSzamla extends Szamla {
    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    public boolean kivesz(int osszeg) {
        boolean sikeresKivetel = false;
        if (hitelKeret - osszeg + aktualisEgyenleg >= 0) {
            aktualisEgyenleg -= osszeg;
            sikeresKivetel = true;
        }
        return sikeresKivetel;
    }
}
