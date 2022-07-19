package bankomat;

public class MainBank {
    public static void main(String[] args) {

        Bankomat bankomat = new Bankomat("Unicredit");
        BankomatServis bankomatServis = new BankomatServis();

        bankomatServis.napuniPodacima(bankomat);
        bankomatServis.meni(bankomat);
    }
}