import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PierwszyTestSelenium {

    WebDriver driver;
    ChromeOptions chromeOptions;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Trener\\IdeaProjects\\Selenium\\chromedriver.exe");
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
    }


    @Test
    public void OtwarciePrzegladarki() {

        driver = new ChromeDriver(chromeOptions);

    }


    @AfterMethod
    public void tearDown() {

        driver.close();

    }


}
