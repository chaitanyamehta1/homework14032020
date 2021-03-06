package notepadhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Navigate to google https://www.google.com/
        In Google search type "nopCommerce demo store" and click search
        click on the link "nopCommerce demo store"
        print the links count and text from the page.*/
public class AssignmentOne {
    public static void main(String[] args) {
        String baseurl = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);

        WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
        search.click();

        WebElement GoogleSearch = driver.findElement(By.name("q"));
        // finding web element with locator
        GoogleSearch.sendKeys(new String[]{"nopCommerce demo store"});
        GoogleSearch.submit();


        WebElement driver1 = driver.findElement(By.xpath("//h3[contains(text(),'nopCommerce demo store')]"));
        driver1.click();
        /*
        To count list of elements and text from page
         */
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(links.size());

        for (int i = 1; i <= links.size(); i = i + 1) {

            System.out.println(links.get(i).getText());

        }


    }

}
