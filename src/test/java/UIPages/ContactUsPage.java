package UIPages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ContactUsPage extends PageObject {

    @FindBy(id = "email")
    WebElement email;

    //@FindBy(className = "form-control")
    //WebElement orderRef;

    @FindBy(id = "message")
    WebElement message;

   @FindBy(id = "313600_order_products")
   WebElement product;

    //By orderRef = By.className("form-control");
    By heading  = By.id("id_contact");
    By chooseFile = By.className("filename");

    public void fillContactUsPage()
    {
        email.sendKeys("prasad@gmail.com");
        //element(orderRef).selectByVisibleText("QGFTTBZSU - 04/24/2021");
        message.sendKeys("Testing Automation");

        element(heading).selectByVisibleText("Webmaster");
        //element(product).selectByVisibleText("Printed Chiffon Dress - Color : Yellow, Size : S");
        //upload("\\Users\\prasa\\OneDrive\\Desktop\\Trial.txt").to(find(chooseFile));
        System.out.println("Successfully on Contact Us Page");


    }
}
