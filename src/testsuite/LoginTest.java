package testsuite;

import browserfectory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = " https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    /**
     * Write down the following test into ‘LoginTest’ class
     * 1. userShouldNavigateToLoginPageSuccessfully
     * click on the ‘Login’ link
     * Verify the text ‘Welcome, Please Sign In!’
     */
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // Find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //This is from requirement
        String expectedMessage = "Welcome, Please Sign in !";

        // Find the welcome text element and get the text
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        // Validate actual and expected message
        Assert.assertEquals("Text not verified. ", expectedMessage, actualTextMessageElement);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        //Find the email field element and send the email
        loginLink.click();
        //This is requirement
        String expectedMessage = "Welcome please sign in !";

        //Find the welcome text element and get the text

        WebElement actualTextMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        // Validate actual and expected Message
        Assert.assertEquals("Text not verified.", expectedMessage, actualTextMessageElement);

    }
        @Test
        public void verifyTheErrorMessage () {
            WebElement loginLink = driver.findElement(By.linkText("Log in"));

            // Find the email field element and send the email
            driver.findElement(By.id("Email")).sendKeys("invalid@gmail.com");

            //Find the password field element and send the password
            driver.findElement(By.name("Password")).sendKeys("invalid123");

            //Find the login button and click on it
            driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
            String expectedMessage = "Login was unsuccessful.please correct the error and try again.\n" + "No customer account found";

            // find the welcome text element and get the text
            String actualMessage = driver.findElement(By.xpath("div[contains(@class,'message-error')]")).toString();

            // Validate to actual and expected Message
            Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);

        }

       @After
       public void closeBrowser(){
        // close the Browser
           driver.quit();
       }




}













