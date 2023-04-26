package daytrader;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class WebScraper {
    
    private final String URI;
    private final Document doc;

    public WebScraper(String URI) {
        this.URI = URI;
        this.doc = getHtml();
    }

    private Document getHtml() {
        Document doc = null;
        try {
            doc = Jsoup.connect(URI).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doc;
    }

    public Document getDoc() {
        return doc;
    }
}
