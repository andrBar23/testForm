package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import static Common.Config.IMPLISYTE_SECOND;

public class CommonAction {
    private static WebDriver driver = null;
    private CommonAction(){
    }
    public static WebDriver createDriver()
    {
        if(driver == null)
        {
            System.setProperty("webdriver.chrome.driver", "C:\\testForm\\src\\main\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLISYTE_SECOND));
        }
        return driver;
    }


}
