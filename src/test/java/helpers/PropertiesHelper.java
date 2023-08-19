package helpers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesHelper {
    private static final Logger LOGGER = LogManager.getLogger(PropertiesHelper.class);
    public static Properties loadProperties() {
        InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("application.properties");

        Properties properties = new Properties();
        try {
            properties.load(stream);
        } catch (IOException e) {
            LOGGER.error("Failed to load properties");
        }
        return properties;
    }
}
