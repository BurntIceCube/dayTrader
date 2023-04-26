package daytrader;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class WebScraperTest {
    private static final Logger log = LogManager.getLogger(WebScraper.class);

    @Test
    public void createWebScraper() {
        WebScraper webScraper = new WebScraper(new Stock("GOOG").getStockQuote().getURI());
        assertNotNull(webScraper);
        log.debug("Test createWebScrapper passed.");
    }

    @Test
    public void selectAttributes() {
        Object element =
            new WebScraper(new Stock("GOOG").getStockQuote().getURI()).getDoc().selectFirst("#quote-summary");
        assertNotNull( element );
        log.debug("Test selectAttributes passed.");
    }
}
