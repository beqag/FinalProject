import PageObject.RegistrationPage;
import StepObject.RegistrationPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static DataObject.Registration.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Project extends ChromeRunner {
    RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps();

    @Test
    @Description("რეგისტრაციის დადებითი მნიშვნელობებით შემოწმება")
    @Severity(SeverityLevel.BLOCKER)
    public void Registracia() {
        SoftAssert softAssert = new SoftAssert();

        registrationPageSteps.GoToRegPage()
                .MainRegistrationButton()
                .Validations()
                .FirstName(firstName)
                .LastName(lastName)
                .PersonalNumber(personalNumber)
                .PhoneNumber(phone)
                .GenderCh()
                .DateCh()
                .CityCh()
                .AddressCh(address)
                .EmailCh(email)
                .PasswordCh(password)
                .ConfPasswordCh(confirmPassword)
                .Marks()
                .MainRegistrationButton()
                .Agree();
        Assert.assertTrue(registrationPageSteps.checkRegComp.isEnabled());

    }
}
