package daytrader;

import org.jsoup.nodes.Document;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HistoricalStockData {
    private static final String dataPath = "https://www.finance.yahoo.com/chart/";

    private Stock stock;
    private WebScraper webScraper;

    public HistoricalStockData(Stock stock) {
        this.stock = stock;
        webScraper = new WebScraper(getURI());
    }

    public void interactWithWebpage() {
        Document doc = webScraper.getDoc();
    }

    public String getURI() { return dataPath + stock.getStockSymbol(); }
}
