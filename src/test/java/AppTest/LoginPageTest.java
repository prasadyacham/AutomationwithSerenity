package AppTest;

import Steps.LoginPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginPageTest {

    @Steps
    LoginPageSteps loginPageSteps;

    //@Managed(driver = "chrome")
    @Managed()
    WebDriver browser;

    @Test
    public void appLoginTest(){
        loginPageSteps.isOnLoginPage();
        loginPageSteps.LoginAsUser();
        loginPageSteps.userShouldBeLogin();
    }

}
