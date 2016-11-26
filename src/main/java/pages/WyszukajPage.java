package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by Arek on 2016-11-26.
 */
public class WyszukajPage extends BasePage{
    public static final String LOCATION = "/wyniki-i-wygrane/wyszukaj";
    public WyszukajPage(WebDriver driver) {
        super(driver);
    }

    public String getURL(){
        return BasePage.BASE_URL+"/wyniki-i-wygrane/wyszukaj";
    }
    public void goToWyszukajWyniki(){

    }
}
