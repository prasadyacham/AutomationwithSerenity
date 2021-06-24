package AppTest;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Steps.LoginPageSteps;
import Steps.ContactUsPageSteps;
@RunWith(SerenityRunner.class)
public class ContactUsTest {

    @Managed
    WebDriver browser;

    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    ContactUsPageSteps contactUsPageSteps;

    @Before
    public void setup()
    {
        loginPageSteps.isOnLoginPage();
        loginPageSteps.navigatetocontactUsPage();
    }

    @Test
    public void fillContactUsPageTest()
    {
        contactUsPageSteps.fillContactUsFormStep();
    }


}
