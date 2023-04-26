package daytrader;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.jsoup.nodes.Element;

public class StockQuote {
    private static final String financePath = "https://www.finance.yahoo.com/quote/";
    
    private Stock stock;
    private WebScraper webScraper;
    private Element quoteSummary;

    private DateTimeFormatter dtf;
    private String lastTime;
    
    private Element prevCloseValue;
    private Element openValue;
    private Element bidValue;
    private Element askValue;
    private Element dayRangeValues;
    private Element yearRangeValues;
    private Element volumeValue;
    private Element avgVolumeValue;
    private Element marketCap;
    private Element peRatio;
    private Element epsttmValue;
    private Element targetEstimate;

    public StockQuote(Stock stock) {
        this.stock = stock;
        webScraper = new WebScraper(getURI());
        dtf = DateTimeFormatter.ofPattern("yyyymmdd-HH:mm:ss");
        updateStock();
    }

    public void updateStock() {
        quoteSummary = webScraper.getDoc().selectFirst("#quote-summary");

        lastTime = LocalDateTime.now().format(dtf);
        prevCloseValue = quoteSummary.selectFirst("[data-test=PREV_CLOSE-value]");
        openValue = quoteSummary.selectFirst("[data-test=OPEN-value]");
        bidValue = quoteSummary.selectFirst("[data-test=BID-value]");
        askValue = quoteSummary.selectFirst("[data-test=ASK-value]");
        dayRangeValues = quoteSummary.selectFirst("[data-test=DAYS_RANGE-value]");
        yearRangeValues = quoteSummary.selectFirst("[data-test=FIFTY_TWO_WK_RANGE-value]");
        volumeValue = quoteSummary.selectFirst("[data-test=TD_VOLUME-value]");
        avgVolumeValue = quoteSummary.selectFirst("[data-test=AVERAGE_VOLUME_3MONTH-value]");
        marketCap = quoteSummary.selectFirst("[data-test=MARKET_CAP-value]");
        peRatio = quoteSummary.selectFirst("[data-test=PE_RATIO-value]");
        epsttmValue = quoteSummary.selectFirst("[data-test=EPS_RATIO-value]");
        targetEstimate = quoteSummary.selectFirst("[data-test=ONE_YEAR_TARGET_PRICE-value]");
    }

    public String getURI() { return financePath + stock.getStockSymbol(); }
    public String getLastTime() { return lastTime; }
    public String getPrevClose() { return prevCloseValue.text(); }
    public String getOpen() { return openValue.text(); }
    public String getBidValue() { return bidValue.text(); }
    public String getAskRange() { return askValue.text(); }
    public String getDayRange() { return dayRangeValues.text(); }
    public String getYearRange() { return yearRangeValues.text(); }
    public String getVolume() { return volumeValue.text(); }
    public String getAvgVolume() { return avgVolumeValue.text(); }
    public String getMarketCap() { return marketCap.text(); }
    public String getPERatio() { return peRatio.text(); }
    public String getEPSTTM() { return epsttmValue.text(); }
    public String getTargetEstimate() { return targetEstimate.text(); }

}
