package objekti.account;

public class SavingAccountService {

    public void saveMoney(CheckingAccount checkingAccount, SavingAccount savingAccount) {
       checkingAccount.setBalance(checkingAccount.getBalance()+savingAccount.getSumForSaving());
    }
}
