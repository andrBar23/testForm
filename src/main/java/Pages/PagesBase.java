package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static Common.Config.DURATION_DRIVER_SECON;
import java.time.Duration;

public class PagesBase {
    protected WebDriver driver;

    public PagesBase (WebDriver driver)
    {
        this.driver = driver;
    }
    public void open(String url){
        driver.get(url);
    }
    public void waitIsVisibleElement (WebElement element)
    {
        new WebDriverWait(driver, Duration.ofSeconds(DURATION_DRIVER_SECON)).until(ExpectedConditions.visibilityOf(element));
    }





}