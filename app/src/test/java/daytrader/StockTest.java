package daytrader;

import org.junit.Test;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class StockTest {
    private static final Logger log = LogManager.getLogger(StockTest.class);

    @Test
    public void createStock() {
        new Stock("GOOG");
        log.debug("Test createStock passed.");
    }
}
