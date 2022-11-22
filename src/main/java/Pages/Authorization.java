package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static Common.Config.MAIL;
import static Common.Config.PASSWORD;
public class Authorization extends PagesBase{

    public Authorization(WebDriver driver) {
        super(driver);
    }
    private final By formloginMail = By.xpath("//*[@id=\"loginEmail\"]");
    private final By formloginPassword = By.xpath("//*[@id=\"loginPassword\"]");
    private final By inputButton = By.xpath("//*[@id=\"authButton\"]");
    private final By exitButtonErrorEmail = By.xpath("//*[@id=\"emailFormatError\"]/a");
    private final By exitButtonErrorEmailPassword = By.xpath("//*[@id=\"invalidEmailPassword\"]/a");

    public Authorization InputMail() {
        waitIsVisibleElement(driver.findElement(formloginMail));
        driver.findElement(formloginMail).click();
        driver.findElement(formloginMail).sendKeys(MAIL);
        return this;
    }
    public void ClearMail() {
        waitIsVisibleElement(driver.findElement(formloginMail));
        driver.findElement(formloginMail).click();
        driver.findElement(formloginMail).sendKeys("\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b");
    }
    public Authorization InputPassword() {
        waitIsVisibleElement(driver.findElement(formloginMail));
        driver.findElement(formloginPassword).click();
        driver.findElement(formloginPassword).sendKeys(PASSWORD);
        return this;
    }
    public void ClearPassword() {
        waitIsVisibleElement(driver.findElement(formloginMail));
        driver.findElement(formloginPassword).click();
        driver.findElement(formloginPassword).sendKeys("\b\b\b\b");
    }
    public Authorization ClicInputButton() {
        waitIsVisibleElement(driver.findElement(inputButton));
        driver.findElement(inputButton).click();
        return this;
    }
    public Authorization ClicExitButtonErrorEmailPassword() {
        waitIsVisibleElement(driver.findElement(exitButtonErrorEmailPassword));
        driver.findElement(exitButtonErrorEmailPassword).click();
        return this;
    }
    public Authorization ClicExitButtonErrorEmail() {
        waitIsVisibleElement(driver.findElement(exitButtonErrorEmail));
        driver.findElement(exitButtonErrorEmail).click();
        return this;
    }





}
