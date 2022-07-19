package objekti.account;

public class AccountMain {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount(1, 500, 100);
        CheckingAcoountService checkingAcoountService = new CheckingAcoountService();
        SavingAccount savingAccount = new SavingAccount(500);
        SavingAccountService savingAccountService = new SavingAccountService();
        Account account = new Account();

        checkingAcoountService.withdraw(150, checkingAccount);
        System.out.println(checkingAccount.getBalance());

        savingAccountService.saveMoney(checkingAccount, savingAccount );
        System.out.println(checkingAccount.getBalance());

        checkingAcoountService.withdraw(200, checkingAccount);
        System.out.println(checkingAccount.getBalance());

        System.out.println(account.getDateCreated());

    }
}
