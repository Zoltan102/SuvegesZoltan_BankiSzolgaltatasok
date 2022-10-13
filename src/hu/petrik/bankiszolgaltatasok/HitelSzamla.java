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
        boolean sikeresKivetel;
        if (hitelKeret - osszeg + super.aktualisEgyenleg < 0) {
            super.kivesz(osszeg);
            sikeresKivetel = false;
        } else {
            sikeresKivetel = false;
        }
        return sikeresKivetel;
    }
}
