package Tests.authorizationTest;
import Tests.baseTest.BaseTest;
import org.testng.annotations.Test;

public class AuthorizationTest extends BaseTest {
    @Test(priority=1)
            public void WithNotEnteredPasswordMail () {
                authorization.ClicInputButton().ClicExitButtonErrorEmail();
            }
    @Test(priority=2)
            public void WithNotEnteredPassword () {
                authorization.InputMail().ClicInputButton().ClicExitButtonErrorEmailPassword().ClearMail();
            }
    @Test(priority=3)
            public void WithNotEnteredMail () {
                authorization.InputPassword().ClicInputButton().ClicExitButtonErrorEmail().ClearPassword();
            }
    @Test(priority=4)
            public void СorrectData () {
                authorization.InputMail().InputPassword().ClicInputButton();
            }


}



