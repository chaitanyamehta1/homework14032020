package teamframework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUnSuccesfully {
    /*
    Test Case 2 User should register successfully.
Click on Register
Enter correct details in field
Click on register  button.
Expected Result:
Success Message  “Your registration completed”
Assert above message.

     */
    WebDriver driver;

    @Before
    public void openBrowser() {
        String baseUrl = "https://demo.nopcommerce.com";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @Test
    public void usersDetails() {

        WebElement register = driver.findElement(By.xpath("//a[@class=\"ico-register\"]"));
        register.click();


        WebElement genderMale = driver.findElement(By.xpath("//span[@class=\"male\"]//input[@type='radio']"));
        genderMale.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
        firstName.sendKeys("chaitanya");


        WebElement lastName = driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
        lastName.sendKeys("mehta");

        WebElement date = driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
        date.sendKeys("11");

        WebElement month = driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
        month.sendKeys("August");

        WebElement year = driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
        year.sendKeys("1979");

        WebElement email = driver.findElement(By.xpath("//input[@id=\"Email\"]"));
        email.sendKeys("mehta@gmail.com");

        WebElement companyName = driver.findElement(By.xpath("//input[@id=\"Company\"]"));
        companyName.sendKeys("Testing Team");

        WebElement password = driver.findElement(By.xpath("//input[@id=\"Password\"]"));
        password.sendKeys("xyz123");

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]"));
        confirmPassword.sendKeys("xyz121");

        WebElement register1 = driver.findElement(By.xpath("//input[@id=\"register-button\"]"));
        register1.click();

        String expectedResult = "Your registration completed";
        String actualResult = "Your registration is not completed";
        Assert.assertEquals(expectedResult, actualResult);

    }

    @After
    public void browserClosed() {
        driver.quit();
    }

}
