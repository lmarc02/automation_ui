
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LogInPage;

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
    }

}
