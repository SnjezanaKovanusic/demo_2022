package objekti.account;

import java.util.Date;

/*(Subclasses of Account) In Programming Exercise 9.7, the Account class was
defined to model a bank account. An account has the properties account number,
balance, annual interest rate, and date created, and methods to deposit and withdraw funds.
Create two subclasses for checking and saving accounts. A checking
account has an overdraft limit, but a savings account cannot be overdrawn.
Draw the UML diagram for the classes and implement them. Write a test program
that creates objects of Account, SavingsAccount, and CheckingAccount and
invokes their toString() methods
* */
public class Account {
    // Data fields
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    // Constructors
    /** Creates a default account */
    Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    /** Creates an account with the specified id and initial balance */
    Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new Date();
    }

    // Mutator methods
    /** Set id */
    public void setId(int newId) {
        id = newId;
    }

    /** Set balance */
    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    /** Set annualInterestRate */
    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    // Accessor methods
    /** Return id */
    public int getId() {
        return id;
    }

    /** Return balance */
    public double getBalance() {
        return balance;
    }

    /** Return annualInterestRate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /** Return dateCreated */
    public String getDateCreated() {
        return dateCreated.toString();
    }

    /** Return monthly interest rate */
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // Methods
    /** Return monthly interest */
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

}