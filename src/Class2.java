import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Class2 {
    WebDriver driver;

    @Test
    void button(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Admin//Downloads//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");


        List<WebElement> button = driver.findElements(By.xpath("//*[@id=\"content\"]/ul/li[1]/a"));
        System.out.println("Button:" + ((List<?>) button).size());

    }



}
