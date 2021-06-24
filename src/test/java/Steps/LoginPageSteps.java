package Steps;

import UIPages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginPageSteps {

    private LoginPage loginPage;

    @Step
    public void isOnLoginPage()
    {
        loginPage.open();
    }

    @Step
    public void LoginAsUser()
    {

        loginPage.doLogin();
    }

    @Step
    public void userShouldBeLogin()
    {
        Assert.assertTrue(loginPage.accountPageIsVisible().equals("MY ACCOUNT"));
    }

    @Step
    public void navigatetocontactUsPage()
    {
        loginPage.goToContactUsPage();
    }
}
