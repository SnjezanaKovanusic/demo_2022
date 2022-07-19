package objekti.account;

public class CheckingAcoountService {

    public void withdraw(double amount,  CheckingAccount checkingAccount) {
        if (checkingAccount.getBalance()- amount > checkingAccount.getOverdraftLimit()) {
            checkingAccount.setBalance(checkingAccount.getBalance()-amount);
        }
        else
            System.out.println("Error! Amount exceeds overdraft limit.");

    }

}
