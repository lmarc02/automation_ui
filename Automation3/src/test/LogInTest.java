
import jdk.internal.jline.internal.TestAccessible;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LogInPage;
import sun.jvm.hotspot.utilities.Assert;

public class LogInTest extends BaseTest {
    private LogInPage logInPage = new LogInPage(driver);

    @Override
    @BeforeClass
    public void setUp(){

    }

    @Test
    public void checkLoginPageElements(){
        Assert.assertEquals(logInPage.getCreateAnAccountBtnText(), "Create an account",
                "Incorrect text on Create an account button.");
        Assert.assertEquals(logInPage.isCartDisplayed(), true);
        Assert.assertEquals(logInPage.getHeadingText(), "AUTHENTICATION",
                "Incorrect heading text on Authentication page.");
        Assert.assertEquals(logInPage.isHeadingTextDisplayed(), true,
                "Authentication heading text is not displayed.");
        Assert.assertEquals(logInPage.isHeadingTextDisplayed(), true,
                "Authentication heading text is not displayed.");
    }
    @Test
    public void checkLoginPages(){
        Assert.assertEquals(logInPage.getCreateAnAccountBtnText(), "Create an account",
                "Incorrect text on Create an account button.");
        Assert.assertEquals(logInPage.isCartDisplayed(), true);
        Assert.assertEquals(logInPage.getHeadingText(), "AUTHENTICATION",
                "Incorrect heading text on Authentication page.");
        Assert.assertEquals(logInPage.isHeadingTextDisplayed(), true,
                "Authentication heading text is not displayed.");
        Assert.assertEquals(logInPage.isHeadingTextDisplayed(), true,
                "Authentication heading text is not displayed.");
    }

}
