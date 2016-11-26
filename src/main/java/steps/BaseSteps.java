package steps;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import pages.BasePage;
import pages.WyszukajPage;

/**
 * Created by kod on 2016-11-26.
 */
public class BaseSteps extends ScenarioSteps {
    private static final Config CONF = ConfigFactory.load();

    public BaseSteps(Pages pages) {
        super(pages);
    }

    public <T extends PageObject> T getCurrentPage(Class<T> pageClass) {
        return getPages().currentPageAt(pageClass);
    }

    @Step
    public void goToMainPage() {
        this.getDriver().get(BasePage.BASE_URL);
    }

    @Step
    public void goToWyszukajWyniki(){
        this.getDriver().get(BasePage.BASE_URL+ WyszukajPage.LOCATION);
    }

    @Step
    public void goToOtherPage() {
        this.getDriver().get(BasePage.BASE_URL + "/other");
    }
}