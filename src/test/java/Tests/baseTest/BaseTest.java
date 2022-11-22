package Tests.baseTest;

import Common.CommonAction;
import Pages.Authorization;
import Pages.PagesBase;
import Pages.UsersCreation;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;


public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected PagesBase pagesBase = new PagesBase(driver);
    protected Authorization authorization = new Authorization(driver);
    protected UsersCreation usersCreation = new UsersCreation(driver);


    @BeforeSuite
    public void OpenUrl() {
        driver.manage().window().maximize();
        pagesBase.open("file:///html");
    }

}
