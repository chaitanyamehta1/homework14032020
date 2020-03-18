package notepadhomework;
        /*Navigate to website "https://demo.nopcommerce.com/"
        Click on register link.
        Fill the all fields.
        Click on register button.*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTwo {
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);


        WebElement register = driver.findElement(By.xpath("//a[@class= \"ico-register\"]"));
        register.click();

        WebElement genderMale = driver.findElement(By.xpath("//input[@id='gender-male']"));
        genderMale.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'FirstName']"));
        firstName.sendKeys("chaitanya");

        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'LastName']"));
        lastName.sendKeys("Mehta");

        WebElement date = driver.findElement((By.xpath("//select[@ name = 'DateOfBirthDay']")));
        date.sendKeys("11");

        WebElement month = driver.findElement((By.xpath("//select[@ name = 'DateOfBirthMonth']")));
        month.sendKeys("August");

        WebElement year = driver.findElement((By.xpath("//select[@ name = 'DateOfBirthYear']")));
        year.sendKeys("1979");

        WebElement eMail = driver.findElement((By.xpath("//input[@ type= 'email']")));
        eMail.sendKeys("mehta@yahoo.com");

        WebElement companyName = driver.findElement((By.xpath("//input[@ id= 'Company']")));
        companyName.sendKeys("Mehta Ltd");

        WebElement newsLatter = driver.findElement(By.xpath("//input[@ type = 'checkbox']"));
        newsLatter.sendKeys("");

        WebElement password = driver.findElement(By.xpath("//input[@ type = 'password']"));
        password.sendKeys("123456");

        WebElement confirmPassword = driver.findElement(By.xpath("//input[@ id = 'ConfirmPassword']"));
        confirmPassword.sendKeys("123456");

        WebElement register1 = driver.findElement(By.xpath("//input[@ name= 'register-button']"));
        register1.click();

    }

}
