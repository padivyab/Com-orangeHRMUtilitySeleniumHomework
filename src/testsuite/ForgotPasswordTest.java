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
        //* click on the ‘Forgot your password’ link
        clickOnElement(By.xpath("//div[@class='orangehrm-login-forgot']"));

        //* Verify the text ‘Forgot Your Password?’
        String actualText = getTextFromElement(By.xpath("//button[@type='submit']"));
        String expectedText = "Reset Password";
        Assert.assertEquals(expectedText,actualText);

    }

    @After
    public void tearDown()
    {
        //closeBrowser();

    }
}
