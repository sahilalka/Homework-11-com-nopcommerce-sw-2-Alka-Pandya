package testsuite;

import browserfectory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.linkText("Computers"));


        // This is from requirement
        String expectedMessage = "Computers";

        //Find the computer element and get the text
        WebElement actualMessage = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to computer page", expectedMessage, actualMessage);


    }

    @Test
    public void userShouldNavigateToElectronicPageSuccessfully() {
        driver.findElement(By.linkText("Electronics"));


        // This is from requirement
        String expectedMessage = "Electronics";

        //Find the computer element and get the text
        WebElement actualMessage = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));

        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Electronic page", expectedMessage, actualMessage);
    }

       @Test
       public void userShouldNavigateToApparelPageSuccessfully() {
           driver.findElement(By.linkText("Apparel"));


           // This is from requirement
           String expectedMessage = "Apparel";

           //Find the computer element and get the text
           WebElement actualMessage = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));

           // Validate actual and expected message
           Assert.assertEquals("Not navigate to Apparel page", expectedMessage, actualMessage);

       }
     @Test
     public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
         driver.findElement(By.linkText("Digital downloads"));


         // This is from requirement
         String expectedMessage = "Digital downloads";

         //Find the computer element and get the text
         WebElement actualMessage = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));

         // Validate actual and expected message
         Assert.assertEquals("Not navigate to Digital downloads page", expectedMessage, actualMessage);


     }

     @Test
     public void userShouldNavigateToBooksPageSuccessfully() {
         driver.findElement(By.linkText("Books"));


         // This is from requirement
         String expectedMessage = "Books";

         //Find the computer element and get the text
         WebElement actualMessage = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));

         // Validate actual and expected message
         Assert.assertEquals("Not navigate to Books page", expectedMessage, actualMessage);

     }
      @Test
      public void userShouldNavigateToJewelryPageSuccessfully() {
          driver.findElement(By.linkText("Jewelry"));


          // This is from requirement
          String expectedMessage = "Jewelry";

          //Find the computer element and get the text
          WebElement actualMessage = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));

          // Validate actual and expected message
          Assert.assertEquals("Not navigate to Jewelry page", expectedMessage, actualMessage);

    }
     @Test
     public void userShouldNavigateToGiftCardsPageSuccessfully() {
         driver.findElement(By.linkText("Gift Cards"));


         // This is from requirement
         String expectedMessage = "Gift Cards";

         //Find the computer element and get the text
         WebElement actualMessage = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));

         // Validate actual and expected message
         Assert.assertEquals("Not navigate to Gift Cards page", expectedMessage, actualMessage);

     }
     @After
    public void closeBrowser(){
        // Close the Browser
         driver.quit();
     }




      }