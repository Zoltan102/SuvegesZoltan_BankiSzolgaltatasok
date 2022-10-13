package hu.petrik.bankiszolgaltatasok;

public abstract class BankiSzolgaltats {
    private Tulajdonos tulajdonos;

    public BankiSzolgaltats(Tulajdonos tulajdonos) {
        this.tulajdonos = tulajdonos;
    }

    public Tulajdonos getTulajdonos() {
        return tulajdonos;
    }
}
