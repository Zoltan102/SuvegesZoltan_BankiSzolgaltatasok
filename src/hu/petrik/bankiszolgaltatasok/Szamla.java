package hu.petrik.bankiszolgaltatasok;

public abstract class Szamla extends BankiSzolgaltats {
    protected int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(int osszeg) {
        aktualisEgyenleg += osszeg;
    }

    public boolean kivesz(int osszeg) {
        return false;
        //TODO: kivesz
    }

    public Kartya ujKartya(String kartyaszam) {
        //TODO: ujKartya;
        return null;
    }
}
