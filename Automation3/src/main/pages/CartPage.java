package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }
    public void waitForPageToLoad() {
        waitForElementVisible(By.cssSelector("#order_step li[class$='first'] span"));
    }
    public boolean isProductInCart(){
        return isElementDisplayed(By.className("cart_product"));
    }
    public void clickSummaryProceedToCheckout(){
        WebElement SummaryProceedToCheckout = driver.findElement(By.cssSelector("a[class$='checkout button-medium']"));
        scrollToElement(SummaryProceedToCheckout);
        clickElement(By.cssSelector("a[class$='checkout button-medium']"));
    }
    public void clickAddressProceedToCheckout(){
        WebElement addressProceedToCheckout = driver.findElement(By.cssSelector("button[class^='button btn btn']"));
        scrollToElement(addressProceedToCheckout);
        clickElement(By.cssSelector("button[class^='button btn btn']"));
    }
    public void clickShippingProceedToCheckout(){
        WebElement shippingProceedToCheckout = driver.findElement(By.cssSelector("button[class^='button btn btn']"));
        scrollToElement(shippingProceedToCheckout);
        clickElement(By.cssSelector("button[class^='button btn btn']"));
    }
    public String getDeliveryAddress(){
        WebElement addressList = driver.findElement(By.cssSelector("li[class='address_title']"));
        scrollToElement(addressList);
        waitForElementVisible(By.cssSelector("li[class='address_title']"));
        WebElement address = driver.findElement(By.cssSelector("#address_delivery .address_city"));
        scrollToElement(address);
        waitForElementVisible(By.cssSelector("#address_delivery .address_city"));
        return getElementText(By.cssSelector("#address_delivery .address_city"));
    }
    public void clickAgreeCheckbox(){
        clickElement(By.id("cgv"));
    }
    public void clickPayByCheck(){
        waitForElementVisible(By.id("cart_summary"));
        WebElement payByCheck = driver.findElement(By.className("cheque"));
        scrollToElement(payByCheck);
        clickElement(By.className("cheque"));
    }
    public boolean isDeliveryOptionDisplayed(){
        return isElementDisplayed(By.className("delivery_options_address"));
    }
    public boolean isAgreeTermChecked(){
        return isElementDisplayed(By.cssSelector("#uniform-cgv .checked"));
    }
    public boolean isShippingPageHeadingDisplayed(){
        return isElementDisplayed(By.className("page-heading"));
    }
    public boolean isPaymentCartSummaryDisplayed(){
        return isElementDisplayed(By.id("cart_summary"));
    }
    public String getQtyOnPaymentPage(){
        return getElementText(By.cssSelector("td[class='cart_quantity text-center']"));
    }
    public boolean isPaymentConfirmationDIsplayed(){
        return isElementDisplayed(By.className("cheque-indent"));
    }
    public void clickConfirmOrderButton(){
        clickElement(By.cssSelector("[class^='button btn btn']"));
    }
    public  boolean isConfirmationMessageDisplayed(){
        return isElementDisplayed(By.cssSelector("[class$='alert-success']"));
    }

}
