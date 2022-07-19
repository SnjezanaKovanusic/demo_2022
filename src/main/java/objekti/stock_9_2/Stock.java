package objekti.stock_9_2;

public class Stock {
    /*(The Stock class) Following the example of the Circle class in Section 9.2,
design a class named Stock that contains:
■■ A string data field named symbol for the stock’s symbol.
■■ A string data field named name for the stock’s name.
■■ A double data field named previousClosingPrice that stores the stock
price for the previous day.
■■ A double data field named currentPrice that stores the stock price for the
current time.
■■ A constructor that creates a stock with the specified symbol and name.
■■ A method named getChangePercent() that returns the percentage changed
from previousClosingPrice to currentPrice.
Draw the UML diagram for the class then implement the class. Write a test program that creates a Stock object with the stock symbol ORCL, the name Oracle
Corporation, and the previous closing price of 34.5. Set a new current price to
34.35 and display the price-change percentage
    * */
    String syimbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String syimbol, String name) {
        this.syimbol = syimbol;
        this.name = name;
    }

    public double getChangePrecent() {

        return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
    }

    public String getSyimbol() {
        return syimbol;
    }

    public void setSyimbol(String syimbol) {
        this.syimbol = syimbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "syimbol='" + syimbol + '\'' +
                ", name='" + name + '\'' +
                ", previousClosingPrice=" + previousClosingPrice +
                ", currentPrice=" + currentPrice +
                '}';
    }
}
