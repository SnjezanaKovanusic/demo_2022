package objekti.stock_9_2;

public class MainStock {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
       stock.setPreviousClosingPrice(100.0);
        stock.setCurrentPrice(50.00);
        double changePrecent = stock.getChangePrecent();
          System.out.println(changePrecent+ " %");


    }
}

