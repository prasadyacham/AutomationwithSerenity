package AppTest;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import Steps.LoginPageSteps;
import Steps.AccountPageSteps;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AccountPageTest {

    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    AccountPageSteps accountPageSteps;

    @Managed()
    WebDriver browser;

    @Before
    public void setup()
    {
        loginPageSteps.isOnLoginPage();
        loginPageSteps.LoginAsUser();
    }

    @Test
    public void accPageLogoTest()
    {
        accountPageSteps.validateAppLogo();
    }

    @Test
    public void searchTest()
    {
        WebElementFacade result = accountPageSteps.searchProduct("Dress", "T-shirts > Faded Short Sleeve T-shirts");
        System.out.println(result);
        //Assert.assertTrue(result.equals("Faded Short Sleeve T-shirts"));
    }

}
