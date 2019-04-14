package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class IndexPage extends BasePage {

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void waitForPageToLoad() {
    isElementDisplayed(By.className("homefeatured"));
    }

    public void addProductToTheCart(){
        clickElement(By.cssSelector("img[class^='logo']"));
        WebElement addToCardButton = driver.findElement(By.className("product-container"));
        scrollToElement(addToCardButton);
        Actions action = new Actions(driver);
        action.moveToElement(addToCardButton).build().perform();
        clickElement(By.cssSelector("a[data-id-product='1']"));
    }

    public void clickProceedToCheckout(){
        WebElement proceedToCheckout = driver.findElement(By.cssSelector("a[title='Proceed to checkout']"));
        scrollToElement(proceedToCheckout);
        waitForElementVisible(By.cssSelector("a[title='Proceed to checkout']"));
        clickElement(By.cssSelector("a[title='Proceed to checkout']"));
    }


}
