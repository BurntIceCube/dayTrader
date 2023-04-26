package daytrader;

import org.junit.Test;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class FrameTest {
    private static final Logger log = LogManager.getLogger(FrameTest.class);

    @Test
    public void printerTest() {
        log.debug("Test printerTest passed.");
    }
}
