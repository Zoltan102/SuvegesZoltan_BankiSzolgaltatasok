package hu.petrik.bankiszolgaltatasok;

public class MegtakaritasiSzamla {
    private double kamat;
    public double alapKamat;

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
