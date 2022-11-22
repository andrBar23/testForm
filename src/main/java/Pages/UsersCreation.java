package Pages;
import org.openqa.selenium.*;
import static Common.Config.MAIL;
import static Common.Config.PASSWORD;

public class UsersCreation extends PagesBase {
    public UsersCreation(WebDriver driver) {
        super(driver);
    }

    private final By dataEmail = By.xpath("//*[@id=\"dataEmail\"]");
    private final By dataName = By.xpath("//*[@id=\"dataName\"]");
    private final By dataSend = By.xpath("//*[@id=\"dataSend\"]");

    private final By dataGender = By.xpath(" //*[@id=\"dataGender\"]");

    private final By dataCheck11 = By.xpath("//*[@id=\"dataCheck11\"]");
    private final By dataCheck12 = By.xpath("//*[@id=\"dataCheck12\"]");

    private final By dataSelect21 = By.xpath("//*[@id=\"dataSelect21\"]");
    private final By dataSelect22 = By.xpath("//*[@id=\"dataSelect22\"]");
    private final By dataSelect23 = By.xpath("//*[@id=\"dataSelect23\"]");

    private final By AlertOk = By.xpath("//div[3]//div[2]/button");
    private final By exitButtonErrorEmail = By.xpath("//*[@id=\"emailFormatError\"]/a");
    private final By exitButtonErrorName = By.xpath("//*[@id=\"blankNameError\"]/a");

    private final By dataTable = By.xpath(" //*[@id=\"dataTable\"]/tbody/tr[1]");

    public UsersCreation Check11() {
        waitIsVisibleElement(driver.findElement(dataCheck11));
        driver.findElement(dataCheck11).click();
        return this;
    }
    public UsersCreation Check12() {
            waitIsVisibleElement(driver.findElement(dataCheck12));
            driver.findElement(dataCheck12).click();
            return this;
    }
    public UsersCreation Select21() {
        waitIsVisibleElement(driver.findElement(dataSelect21));
        driver.findElement(dataSelect21).click();
        return this;
    }
    public UsersCreation Select22() {
        waitIsVisibleElement(driver.findElement(dataSelect22));
        driver.findElement(dataSelect22).click();
        return this;
    }
    public UsersCreation Select23() {
        waitIsVisibleElement(driver.findElement(dataSelect23));
        driver.findElement(dataSelect23).click();
        return this;
    }

    public UsersCreation InputMail() {
        waitIsVisibleElement(driver.findElement(dataEmail));
        driver.findElement(dataEmail).click();
        driver.findElement(dataEmail).sendKeys(MAIL);
        return this;
    }

    public UsersCreation ClearMail() {
        waitIsVisibleElement(driver.findElement(dataEmail));
        driver.findElement(dataEmail).click();
        driver.findElement(dataEmail).sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
        return this;
    }

    public UsersCreation InputName() {
        waitIsVisibleElement(driver.findElement(dataEmail));
        driver.findElement(dataName).click();
        driver.findElement(dataName).sendKeys(PASSWORD);
        return this;
    }

    public UsersCreation ClearName() {
        waitIsVisibleElement(driver.findElement(dataEmail));
        driver.findElement(dataName).click();
        driver.findElement(dataName).sendKeys("\b\b\b\b");
        return this;
    }
    public UsersCreation ClickSendButton() {
        waitIsVisibleElement(driver.findElement(dataSend));
        driver.findElement(dataSend).click();
        return this;
    }

    public UsersCreation ClickExitButtonErrorName() {
        waitIsVisibleElement(driver.findElement(exitButtonErrorName));
        driver.findElement(exitButtonErrorName).click();
        return this;
    }

    public UsersCreation ClickExitButtonErrorEmail() {
        waitIsVisibleElement(driver.findElement(exitButtonErrorEmail));
        driver.findElement(exitButtonErrorEmail).click();
        return this;
    }

    public UsersCreation DataGenderWoman() {
        waitIsVisibleElement(driver.findElement(dataGender));
        driver.findElement(dataGender).click();
        driver.findElement(dataGender).sendKeys(Keys.ARROW_RIGHT);
        return this;
    }

    public UsersCreation DataGenderMan() {
        waitIsVisibleElement(driver.findElement(dataGender));
        driver.findElement(dataGender).click();
        driver.findElement(dataGender).sendKeys(Keys.ARROW_UP);
        return this;
    }

    public  UsersCreation ClickAlert() {
        waitIsVisibleElement(driver.findElement(AlertOk));
        driver.findElement(AlertOk).click();
        return this;
    }
    public void dataTableCheck(int a) {
        switch (a) {
            case (1) -> waitIsVisibleElement(driver.findElement(By.xpath(" //*[@id=\"dataTable\"]/tbody/tr[1]")));
            case (2) -> waitIsVisibleElement(driver.findElement(By.xpath(" //*[@id=\"dataTable\"]/tbody/tr[2]")));
            case (3) -> waitIsVisibleElement(driver.findElement(By.xpath(" //*[@id=\"dataTable\"]/tbody/tr[3]")));
            case (4) -> waitIsVisibleElement(driver.findElement(By.xpath(" //*[@id=\"dataTable\"]/tbody/tr[4]")));
        }
    }




}
