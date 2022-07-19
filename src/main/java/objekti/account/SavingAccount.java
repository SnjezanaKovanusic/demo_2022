package objekti.account;

public class SavingAccount extends Account{
    private double sumForSaving;

    public SavingAccount (int id, double balance, double sumForSaving){
        super(id, balance);
        this.sumForSaving=sumForSaving;

    }

    public SavingAccount(double sumForSaving) {
        this.sumForSaving = sumForSaving;
    }

    public double getSumForSaving() {
        return sumForSaving;
    }

    public void setSumForSaving(double sumForSaving) {
        this.sumForSaving = sumForSaving;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "sumForSaving=" + sumForSaving +
                '}';
    }
}
