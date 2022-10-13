package hu.petrik.bankiszolgaltatasok;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista;

    public Bank(List<Szamla> szamlaLista) {
        this.szamlaLista = new ArrayList<>();
        this.szamlaLista = szamlaLista;
    }

    public Szamla szamlaNyitas(Tulajdonos tulajdonos, int hitelKeret) {
        Szamla ujSzamla;
        if (hitelKeret == 0) {
            ujSzamla = new MegtakaritasiSzamla(tulajdonos);
        } else {
            ujSzamla = new HitelSzamla(tulajdonos, hitelKeret);
        }
        return ujSzamla;
    }

    public int getOsszegyenleg(Tulajdonos tulajdonos) {
        int osszegyenleg = 0;
        for (Szamla sz : szamlaLista) {
            if (sz.getTulajdonos() == tulajdonos) {
                osszegyenleg += sz.getAktualisEgyenleg();
            }
        }
        return osszegyenleg;
    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos) {
        Szamla legnagyobbSzamla = new MegtakaritasiSzamla(tulajdonos);
        for (Szamla sz : szamlaLista) {
            if (tulajdonos == sz.getTulajdonos() && legnagyobbSzamla.aktualisEgyenleg < sz.aktualisEgyenleg) {
                legnagyobbSzamla = sz;
            }
        }
        return legnagyobbSzamla;
    }

    public long getOsszHitelkeret() {
        long osszHitelkeret = 0;
        for (Szamla sz : szamlaLista) {
            if(sz.getClass() == HitelSzamla.class){
                osszHitelkeret += ((HitelSzamla) sz).getHitelKeret();
            }
        }
        return osszHitelkeret;
    }
}
