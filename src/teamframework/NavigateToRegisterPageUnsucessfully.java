package teamframework;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToRegisterPageUnsucessfully {
    WebDriver driver;

    @Before
    public void openBrowser() {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageUnSuccessfully() {
        WebElement register = driver.findElement(By.xpath("//a[@class=\"ico-register\"]"));
        register.click();

        String expectedText = "Your Personal Details";
        String actualText = "Your Persanal Details";
        Assert.assertEquals(expectedText, actualText);

    }
    @After
    public void closeBrowser(){
        driver.quit();
    }

}
