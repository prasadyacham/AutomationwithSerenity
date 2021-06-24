package Steps;

import UIPages.AccountPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class AccountPageSteps {

    private AccountPage accPage;

    @Step
    public void validateAppLogo(){
        accPage.isLogoExist();
    }

    @Step
    public WebElementFacade searchProduct (String searchKey, String productName)
    {
        return accPage.doSearch(searchKey,productName);
    }
}
