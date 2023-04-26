package daytrader;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class StockQuoteTest {
    private static final Logger log = LogManager.getLogger(StockQuote.class);

    @Test
    public void createStockQuote() {
        StockQuote sq = new StockQuote(new Stock("GOOG"));
        assertNotNull(sq);
        log.debug("Test createStockQuote passed.");
    }

    @Test
    public void updateStockQuote() {
        StockQuote sq = new StockQuote(new Stock("GOOG"));
        sq.updateStock();
        assertNotNull(sq.getAskRange());
            log.debug("sq.getAskRange(): " + sq.getAskRange());
        assertNotNull(sq.getAvgVolume());
            log.debug("sq.getAvgVolume(): " + sq.getAvgVolume());
        assertNotNull(sq.getBidValue());
            log.debug("sq.getBidValue(): " + sq.getBidValue());
        assertNotNull(sq.getDayRange());
            log.debug("sq.getDayRange(): " + sq.getDayRange());
        assertNotNull(sq.getEPSTTM());
            log.debug("sq.getEPSTTM(): " + sq.getEPSTTM());
        assertNotNull(sq.getLastTime());
            log.debug("sq.getLastTime(): " + sq.getLastTime());
        assertNotNull(sq.getMarketCap());
            log.debug("sq.getMarketCap(): " + sq.getMarketCap());
        assertNotNull(sq.getOpen());
            log.debug("sq.getOpen(): " + sq.getOpen());
        assertNotNull(sq.getPERatio());
            log.debug("sq.getPERatio(): " + sq.getPERatio());
        assertNotNull(sq.getPrevClose());
            log.debug("sq.getPrevClose(): " + sq.getPrevClose());
        assertNotNull(sq.getTargetEstimate());
            log.debug("sq.getTargetEstimate(): " + sq.getTargetEstimate());
        assertNotNull(sq.getVolume());
            log.debug("sq.getVolume(): " + sq.getVolume());
        assertNotNull(sq.getYearRange());
            log.debug("sq.getYearRange(): " + sq.getYearRange());
        log.debug("Test updateStock passed.");
    }
}
