package pages;

import libs.ActionsWithOurElements;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract public class ParentPage {
    WebDriver webDriver;
    Logger logger = Logger.getLogger(getClass());
    ActionsWithOurElements actionsWithOurElements;

    public ParentPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this); //Initializes all find BY
        actionsWithOurElements = new ActionsWithOurElements(webDriver);
    }

    public void waitSec(int miliSeconds) {
        try {
            Thread.sleep(miliSeconds);
        } catch (Exception e) {
            logger.info(e);
        }
    }

}
