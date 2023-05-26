package StepObject;

import PageObject.RegistrationPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPageSteps extends RegistrationPage {
    @Step("რეგისტრაციის გვერდზე გადასვლა")
    public RegistrationPageSteps GoToRegPage(){
        firstRegBtn.click();
        regPageText.shouldBe(Condition.visible);
        return this;
    }

    @Step("რეგისტრაციის ღილაკზე კლიკი")
    public RegistrationPageSteps MainRegistrationButton(){
        mainRegBtn.click();
        return this;
    }

    @Step("ველების ვალიდაციების შემოწმება")
    public RegistrationPageSteps Validations(){
        firstNameValid.shouldBe(Condition.visible);
        lastNameValid.shouldBe(Condition.visible);
        personNumValid.shouldBe(Condition.visible);
        phoneNumValid.shouldBe(Condition.visible);
        genderValid.shouldBe(Condition.visible);
        dateValid.shouldBe(Condition.visible);
        cityValid.shouldBe(Condition.visible);
        addressValid.shouldBe(Condition.visible);
        emailValid.shouldBe(Condition.visible);
        passValid.shouldBe(Condition.visible);
        passConfValid.shouldBe(Condition.visible);
        rulesValid.shouldBe(Condition.visible);
        return this;
    }

    @Step("სახელის ველის შევსება მონაცემით: {name}")
    public RegistrationPageSteps FirstName(String name){
        firstNameInput.setValue(name);
        firstNameValid.shouldNot(Condition.visible);
        return this;
    }
    @Step("გვარის ველის შევსება მონაცემით: {surname}")
    public RegistrationPageSteps LastName(String surname){
        lastNameInput.setValue(surname);
        lastNameValid.shouldNot(Condition.visible);
        return this;
    }

    @Step("პირადი ნომრის ველის შევსება მონაცემით: {num}")
    public RegistrationPageSteps PersonalNumber(String num){
        persNumInput.setValue(num);
        personNumValid.shouldNot(Condition.visible);
        return this;

    }

    @Step("ტელეფონის ნომრის ველის შევსება მონაცემით: {mobile}")
    public RegistrationPageSteps PhoneNumber(String mobile){
        phoneNumInput.setValue(mobile);
        phoneNumValid.shouldNot(Condition.visible);
        return this;
    }

    @Step("სქესის არჩევა")
    public RegistrationPageSteps GenderCh(){
        gender.click();
        genderValid.shouldNot(Condition.visible);
        return this;
    }

    @Step("დაბადების თარიღის არჩევა")
    public RegistrationPageSteps DateCh(){
        day.click();
        chDay.click();
        dateValid.shouldBe(Condition.visible);
        month.click();
        chMonth.click();
        dateValid.shouldBe(Condition.visible);
        year.click();
        chYear.click();
        dateValid.shouldNot(Condition.visible);
        return this;
    }

    @Step("ქალაქის არჩევა")
    public RegistrationPageSteps CityCh(){
        city.click();
        chCity.click();
        cityValid.shouldNot(Condition.visible);
        return this;
    }

    @Step("მისამართის ველის შევსება მონაცემით: {address}")
    public RegistrationPageSteps AddressCh(String address){
        addressInput.setValue(address);
        addressValid.shouldNot(Condition.visible);
        return this;
    }

    @Step("იმეილის ველის შევსება მონაცემით: {mail}")
    public RegistrationPageSteps EmailCh(String mail){
        emailInput.setValue(mail);
        emailValid.shouldNot(Condition.visible);
        return this;
    }

    @Step("პაროლის ველის შევსება მონაცემით: {pass}")
    public RegistrationPageSteps PasswordCh(String pass){
        passInput.setValue(pass);
        passValid.shouldNot(Condition.visible);
        return this;
    }

    @Step("პაროლის დადასტურების ველის შევსება მონაცემით: {chPass}")
    public RegistrationPageSteps ConfPasswordCh(String chPass){
        confPassInput.setValue(chPass);
        passConfValid.shouldNot(Condition.visible);
        return this;
    }

    @Step("თანხმობის ჩექბოქსების მონიშვნა")
    public RegistrationPageSteps Marks(){
        newsLetters.click();
        rulesValid.shouldBe(Condition.visible);
        rules.click();
        rulesValid.shouldNot(Condition.visible);
        return this;
    }

    @Step("თანხმობაზე კლიკი და რეგისტრაციის დასრულება")
    public RegistrationPageSteps Agree(){
        agree.click();
        return this;
    }

}
