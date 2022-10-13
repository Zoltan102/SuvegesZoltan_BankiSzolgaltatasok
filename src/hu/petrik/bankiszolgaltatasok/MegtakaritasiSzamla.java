package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla {
    private double kamat;
    public static final double alapKamat = 1.1;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public boolean kivesz(int osszeg) {
        return true;
        //TODO: kivesz
    }

    public void kamatJovairas() {
        //TODO: kamatJovairas
    }
}
