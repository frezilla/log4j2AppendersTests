package fr.frezilla.log4j2.tests.smtpappender;

import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainClass {
    
    private static final Logger LOGGER = LogManager.getLogger(MainClass.class);
    
    public static void main(String[] args) {
        // Nécessaire pour utiliser le serveur smtp office
        // https://stackoverflow.com/questions/33232517/log4j2-smtp-to-office365/37710440#37710440
        Properties p = System.getProperties();
        p.setProperty("mail.smtp.starttls.enable", "true");
        
        LOGGER.debug("debug message");
        LOGGER.error("error message");
        LOGGER.info("info message");
        LOGGER.trace("trace message");
        LOGGER.warn("warn message");
    }
    
}
