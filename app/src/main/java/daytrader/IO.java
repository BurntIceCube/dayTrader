package daytrader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.nodes.Document;

public class IO {
    private static final Logger log = LogManager.getLogger(IO.class);


    public static void writeToFile(Document d) {
        File file = new File("src/test/resources/out/" 
            + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyymmddHHmmss"))
            + ".html");
            log.debug("Attempted to write to " + file.getPath());
        try {
            file.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write( d.html() );
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
