package pageobject.pagesForAbove;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pageobject.BaseFunc;

public class UserProfilePage {

    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc;

    public UserProfilePage (BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

}
