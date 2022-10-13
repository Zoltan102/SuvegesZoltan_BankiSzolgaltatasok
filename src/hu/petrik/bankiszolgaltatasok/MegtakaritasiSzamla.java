package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla extends Szamla {
    private double kamat;
    public static final double alapKamat = 1.1;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        kamat = alapKamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public boolean kivesz(int osszeg) {
        boolean sikeresKivetel = false;
        if (aktualisEgyenleg - osszeg >= 0) {
            aktualisEgyenleg -= osszeg;
            sikeresKivetel = true;
        }
        return sikeresKivetel;
    }

    public void kamatJovairas() {
        aktualisEgyenleg = (int) (kamat * aktualisEgyenleg);
    }
}
