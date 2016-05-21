package swampup;

import org.apache.log4j.BasicConfigurator;
import org.slf4j.LoggerFactory;

public class Slf4jMain {

    private static org.slf4j.Logger logger = LoggerFactory.getLogger(Slf4jMain.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();
        String msg = "Running app (logging from log4j via slf4j)";
        logger.info(msg);

        logger.info(new QuoteService().randomQuote());
    }

}
