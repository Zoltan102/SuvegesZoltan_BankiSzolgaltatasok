package hu.petrik.bankiszolgaltatasok;

public abstract class Szamla {
    protected int aktualisEgyenleg;

    public Szamla(int aktualisEgyenleg) {
        this.aktualisEgyenleg = aktualisEgyenleg;
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(int osszeg){
        //TODO: befizet
    }

    public boolean kivesz(int osszeg){
        return true;
        //TODO: kivesz
    }

    public Kartya ujKartya(String kartyaszam){
        //TODO: ujKartya;
        return null;
    }
}