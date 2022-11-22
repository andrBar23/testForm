package Tests.usersCreationTest;

import Tests.baseTest.BaseTest;
import org.testng.annotations.Test;

public class PairwiseTest extends BaseTest {
    @Test(priority = 5)
    public void Mail_Name_GenderW_dataCheck1All_0n()
    {
        usersCreation
                .InputMail()
                .InputName()
                .DataGenderWoman()
                .Check11()
                .Check12()
                .ClickSendButton()
                .ClickAlert()
                .Check11().Check12().ClearMail().ClearName().dataTableCheck(1);
    }
    @Test(priority = 6)
    public void Mail_Name_GenderW_dataCheck11_0n()
    {
        usersCreation
                .InputMail()
                .InputName()
                .DataGenderWoman()
                .Check11()
                .ClickSendButton()
                .ClickAlert()
                .Check11().ClearMail().ClearName().dataTableCheck(2);
    }
    @Test(priority = 7)
    public void MailNo_NameNo_GenderW_dataCheck12_0n()
    {
        usersCreation
                .DataGenderWoman()
                .Check12()
                .ClickSendButton()
                .ClickExitButtonErrorEmail()
                .Check12().ClearMail().ClearName();
    }
    @Test(priority = 8)
    public void MailNo_NameNo_GenderW_On_0n()
    {
        usersCreation
                .DataGenderWoman()
                .ClickSendButton()
                .ClickExitButtonErrorEmail()
                .ClearMail().ClearName();
    }
    @Test(priority = 9)
    public void Mail_NameNo_GenderM_On_Select21()
    {
        usersCreation
                .InputMail()
                .DataGenderMan()
                .Select21()
                .ClickSendButton()
                .ClickExitButtonErrorName()
                .ClearMail().ClearName();
    }
    @Test(priority = 10)
    public void Mail_NameNo_GenderM_dataCheck12_Select23()
    {
        usersCreation
                .InputMail()
                .DataGenderMan()
                .Check12()
                .Select21()
                .ClickSendButton()
                .ClickExitButtonErrorName()
                .Check12().ClearMail().ClearName();
    }
    @Test(priority = 11)
    public void MailNo_Name_GenderM_dataCheckAll_Select21()
    {
        usersCreation
                .InputMail()
                .DataGenderMan()
                .Check12()
                .Check11()
                .Select21()
                .ClickSendButton()
                .ClickExitButtonErrorName()
                .Check11().Check12().ClearMail().ClearName();
    }
    @Test(priority = 12)
    public void MailNo_NameNo_GenderW_On_Select22()
    {
        usersCreation
                .DataGenderWoman()
                .Select22()
                .ClickSendButton()
                .ClickExitButtonErrorEmail()
                .ClearMail().ClearName();
    }
    @Test(priority = 13)
    public void MailNo_Name_GenderM_dataCheck11_Select23()
    {
        usersCreation.InputName()
                .DataGenderMan()
                .Check11()
                .Select23()
                .ClickSendButton()
                .ClickExitButtonErrorEmail()
                .Check11().ClearMail().ClearName();
    }
    @Test(priority = 14)
    public void Mail_NameNo_GenderM_dataCheck12_Select21()
    {
        usersCreation
                .InputMail()
                .DataGenderMan()
                .Check12()
                .Select21()
                .ClickSendButton()
                .ClickExitButtonErrorName()
                .Check12().ClearMail().ClearName();
    }
    @Test(priority = 15)
    public void Mail_NameNo_GenderM_On_Select23()
    {
        usersCreation
                .InputMail()
                .DataGenderMan()
                .Select23()
                .ClickSendButton()
                .ClickExitButtonErrorName()
                .ClearMail().ClearName();
    }
    @Test(priority = 16)
    public void MailNo_Name_GenderM_dataCheck11_Select21()
    {
        usersCreation
                .InputName()
                .DataGenderMan()
                .Check11()
                .Select21()
                .ClickSendButton()
                .ClickExitButtonErrorEmail()
                .Check11().ClearMail().ClearName();
    }
    @Test(priority = 17)
    public void MailNo_NameNo_GenderW_dataCheck12_Select22()
    {
        usersCreation
                .DataGenderWoman()
                .Check12()
                .Select22()
                .ClickSendButton()
                .ClickExitButtonErrorEmail()
                .Check12().ClearMail().ClearName();
    }
    @Test(priority = 18)
    public void MailNo_Name_GenderM_dataCheckAll_Select23()
    {
        usersCreation
                .InputName()
                .DataGenderMan()
                .Check11()
                .Check12()
                .Select23()
                .ClickSendButton()
                .ClickExitButtonErrorEmail()
                .Check11().Check12().ClearMail().ClearName();
    }
    @Test(priority = 19)
    public void Mail_Name_GenderW_dataCheck11_Select22()
    {
        usersCreation
                .InputMail()
                .InputName()
                .DataGenderWoman()
                .Check11()
                .Select22()
                .ClickSendButton()
                .ClickAlert()
                .Check11().ClearMail().ClearName().dataTableCheck(3);
    }
    @Test(priority = 20)
    public void Mail_Name_GenderW_dataCheckAll_Select22()
    {
        usersCreation
                .InputMail()
                .InputName()
                .DataGenderMan()
                .Check11()
                .Check12()
                .Select23()
                .ClickSendButton()
                .ClickAlert()
                .Check11().Check12().ClearMail().ClearName().dataTableCheck(4);
    }
}
