package UIPages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

//@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class LoginPage extends PageObject {

    public void doLogin(){
        $(By.cssSelector("#email")).sendKeys("dec2020secondbatch@gmail.com");
        $(By.cssSelector("#passwd")).sendKeys("Selenium@12345");
        $(By.id("SubmitLogin")).click();

    }

    public String accountPageIsVisible(){
        return $(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/h1[1]")).getText();
    }

    public void goToContactUsPage()
    {
        $(By.linkText("Contact us")).click();
    }

}
