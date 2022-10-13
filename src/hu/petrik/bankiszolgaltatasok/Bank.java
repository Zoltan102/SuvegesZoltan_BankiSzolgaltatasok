package hu.petrik.bankiszolgaltatasok;

import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista;

    public Bank(List<Szamla> szamlaLista) {
        this.szamlaLista = szamlaLista;
    }

    public Szamla szamlaNyitas(Tulajdonos tulajdonos, int hitelKeret) {
        //TODO: szamlanyitas
        return null;
    }

    public int getOsszegyenleg(Tulajdonos tulajdonos) {
        //TODO: getOsszegyenleg
        return 0;
    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos) {
        return null;
        //TODO: getLegnagyobbEgyenleguSzamla
    }

    public long getOsszHitelkeret() {
        return 0;
        //TODO: getOsszHitelkeret
    }
}
