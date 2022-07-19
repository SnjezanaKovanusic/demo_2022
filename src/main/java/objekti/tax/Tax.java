package objekti.tax;

import java.util.Arrays;

public class Tax {
    /*(Financial: the Tax class) Programming Exercise 8.12 writes a program for
computing taxes using arrays. Design a class named Tax to contain the following instance data fields:
■■ int filingStatus:
■■ int[][] brackets: Stores the tax brackets for each filing status.
■■ double[] rates: Stores the tax rates for each bracket.
■■ double taxableIncome: Stores the taxable income.
Provide the getter and setter methods for each data field and the getTax()
method that returns the tax. Also, provide a no-arg constructor and the constructor Tax(filingStatus, brackets, rates, taxableIncome).
Draw the UML diagram for the class and then implement the class. Write a test
program that uses the Tax class to print the 2001 and 2009 tax tables for taxable
income from $50,000 to $60,000 with intervals of $1,000 for all four statuses.
The tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001
are shown in Table 10.1
    * */
    public static int SINGLE_FILER = 0;
    public static int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static int MARRIED_SEPARATELY = 2;
    public static int HEAD_OF_HOUSEHOLD = 3;
    int filingStatuts;
    int[][] brackets;//Stores the tax brackets for each filing status
    double[] rates;//Stores the tax rates for each bracket
    double taxableIncome;//Stores the taxable income

    public Tax() {
    }

    public Tax(int filingStatuts, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatuts = filingStatuts;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public static int getSingleFiler() {
        return SINGLE_FILER;
    }

    public static void setSingleFiler(int singleFiler) {
        SINGLE_FILER = singleFiler;
    }

    public static int getMarriedJointlyOrQualifyingWidow() {
        return MARRIED_JOINTLY_OR_QUALIFYING_WIDOW;
    }

    public static void setMarriedJointlyOrQualifyingWidow(int marriedJointlyOrQualifyingWidow) {
        MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = marriedJointlyOrQualifyingWidow;
    }

    public static int getMarriedSeparately() {
        return MARRIED_SEPARATELY;
    }

    public static void setMarriedSeparately(int marriedSeparately) {
        MARRIED_SEPARATELY = marriedSeparately;
    }

    public static int getHeadOfHousehold() {
        return HEAD_OF_HOUSEHOLD;
    }

    public static void setHeadOfHousehold(int headOfHousehold) {
        HEAD_OF_HOUSEHOLD = headOfHousehold;
    }

    public int getFilingStatuts() {
        return filingStatuts;
    }

    public void setFilingStatuts(int filingStatuts) {
        this.filingStatuts = filingStatuts;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    @Override
    public String toString() {
        return "Tax{" +
                "filingStatuts=" + filingStatuts +
                ", brackets=" + Arrays.toString(brackets) +
                ", rates=" + Arrays.toString(rates) +
                ", taxableIncome=" + taxableIncome +
                '}';
    }
}
