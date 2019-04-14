package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }
    public void waitForPageToLoad() {
        waitForElementVisible(By.cssSelector("a[href$='controller=my-account']"));
    }
    public boolean isCartDisplayed(){
        return isElementDisplayed(By.className("shopping_cart"));
    }
    public String getHeadingText(){
        return getElementText(By.className("page-heading"));
    }
    public boolean isHeadingTextDisplayed(){
        return isElementDisplayed(By.className("page-heading"));
    }
}
