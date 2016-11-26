import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.MainSteps;

/**
 * Created by kod on 2016-11-26.
 */
@RunWith(SerenityRunner.class)
public class MainTest {
    @Managed
    public WebDriver driver;

    @ManagedPages
    public Pages pages;

    @Steps
    private MainSteps mainSteps;

    @Before
    public void goToLoginPage() {
//        steps.goToDashboardPage();
//        steps.clickOnLoginButton();
//        mainSteps.goToMainPage();
        mainSteps.goToWyszukajWyniki();
    }

    @Test
    public void shouldNotLogin() {
        System.out.println("Yoi");    }

}
