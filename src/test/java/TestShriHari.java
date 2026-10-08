import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestShriHari {
    public static void main(String[] args) {
        //WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        driver.findElement(By.id("Email")).sendKeys("shri");
        driver.findElement(By.xpath("Password")).sendKeys("hari");
    }
}
