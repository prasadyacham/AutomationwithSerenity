package Steps;

import UIPages.ContactUsPage;
import net.thucydides.core.annotations.Step;

public class ContactUsPageSteps {

    private ContactUsPage contactUsPage;

    @Step
    public void fillContactUsFormStep()
    {
        contactUsPage.fillContactUsPage();
    }
}
