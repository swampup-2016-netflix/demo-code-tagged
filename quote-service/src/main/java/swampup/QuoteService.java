package swampup;

import java.util.Random;

public class QuoteService {

    private org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(QuoteService.class);

    private String[] quotes = {
            "Money is the Mc-mansion in Sarasota that starts falling apart after 10 years. Power is the old stone building that stands for centuries. I cannot respect someone who doesn’t see the difference. -FU",
            "Power is a lot like real estate. It’s all about location, location, location. The closer you are to the source, the higher your property value. - FU",
            "There are two kinds of pain. The sort of pain that makes you strong, or useless pain. The sort of pain that’s only suffering. I have no patience for useless things.",
            "Would you put day drinking under experience or special abilities?",
            "\"You're coming across as paranoid.\" \"Everyone keeps saying that, it's like a conspiracy.\""
    };

    public String randomQuote() {
        int random = new Random().nextInt(quotes.length);
        return quotes[random];
    }

    public static void main(String[] args) {
        System.out.println(new QuoteService().randomQuote());
    }

}
