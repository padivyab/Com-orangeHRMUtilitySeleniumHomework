package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseurl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp()
    {
        openBrowser(baseurl);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials()
    {
        //* Enter “Admin” username
        sendTextToElement(By.xpath("//input[@name='username']"),"Admin");
        //* Enter “admin123 password
        sendTextToElement(By.xpath("//input[@name='password']"),"admin123");

        //* Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//button[@type='submit']"));

        //* Verify the ‘Welcome’ text is display
        String actualText =getTextFromElement(By.xpath("//div[@class='oxd-topbar-header-userarea']"));
        String expectedText = "Paul Collings";
        Assert.assertEquals(expectedText,actualText);

    }

    @After
    public void tearDown()
    {
        //closeBrowser();
    }
}
