package UIPages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class AccountPage extends PageObject{

    public void isLogoExist()
    {
        shouldBeVisible(By.className("logo"));
    }

    public WebElementFacade doSearch(String searchKey, String productName)
    {
        typeInto($(By.cssSelector("#search_query_top")),searchKey);
        waitForTextToAppear(productName);
        //clickOn(By.xpath("//li[text()= '"+productName+"']"));
        clickOn($(By.xpath("//li[text()= '"+productName+"']")));
        return find(By.tagName("//h1[contains(text(),'Faded Short Sleeve T-shirts')]"));
    }

}
