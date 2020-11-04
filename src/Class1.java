import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Class1 {
    WebDriver driver;

    

    @Test
    void titleTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");

        System.out.println("Title of the Internet website is: " + driver.getTitle().toString());
        Assert.assertEquals("The Internet", driver.getTitle(), "Title is not proper or either not matching");
        Thread.sleep(5000);
    }

}
