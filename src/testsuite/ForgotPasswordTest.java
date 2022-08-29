package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {

    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp()
    {
        openBrowser(baseurl);

    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully()
    {
        //* Verify the text ‘Forgot Your Password?’
        String actualText = getTextFromElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        String expectedText = "Forgot your password?";
        Assert.assertEquals(expectedText,actualText);

        //* click on the ‘Forgot your password’ link
        clickOnElement(By.xpath("//div[@class='orangehrm-login-forgot']"));



    }

    @After
    public void tearDown()
    {
        //closeBrowser();

    }
}
