package daytrader;

public class Stock {
    private final String stockSymbol;
    private StockQuote stockQuote;

    public Stock(String stockSymbol) {
        this.stockSymbol = stockSymbol;
        stockQuote = new StockQuote(this);
    }

    public String getStockSymbol() { return stockSymbol; }
    public StockQuote getStockQuote() { return stockQuote; }
}
