package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class RegistrationPage {
    public SelenideElement
    firstRegBtn = $(byLinkText("რეგისტრაცია")),
    regPageText = $(byText("სახელი და გვარი უნდა ემთხვეოდეს პირადობის მოწმობაში მითითებულ მონაცემებს")),
    mainRegBtn = $(byClassName("text-uppercase"), 1),
    firstNameValid = $(byText("სახელი სავალდებულოა.")),
    lastNameValid = $(byText("გვარი სავალდებულოა.")),
    personNumValid = $(byText("პირადი ნომერი სავალდებულოა.")),
    phoneNumValid = $(byText("ტელეფონი სავალდებულოა.")),
    genderValid = $(byText("სქესი სავალდებულოა.")),
    dateValid = $(byText("დაბადების თარიღი სავალდებულოა.")),
    cityValid = $(byText("ქალაქი სავალდებულოა.")),
    addressValid = $(byText("მისამართი სავალდებულოა.")),
    emailValid = $(byText("ელ. ფოსტა სავალდებულოა.")),
    passValid = $(byText("პაროლი სავალდებულოა.")),
    passConfValid = $(byText("გაიმეორეთ პაროლი სავალდებულოა.")),
    rulesValid = $(byText("წესები სავალდებულოა.")),
    firstNameInput = $(byAttribute("formcontrolname", "firstName")),
    lastNameInput = $(byAttribute("formcontrolname", "lastName")),
    persNumInput = $(byAttribute("formcontrolname", "personalId")),
    phoneNumInput = $(byAttribute("formcontrolname", "phone")),
    gender = $(byClassName("form-check-label"),1),
    day = $(byClassName("col-md-4"), 4),
    chDay = $(byValue("02")),
    month = $(byClassName("col-md-4"), 5),
    chMonth = $(byValue("7")),
    year = $(byClassName("col-md-4"), 6),
    chYear = $(byValue("1992")),
    city = $(byAttribute("formcontrolname", "city")),
    chCity = $(byValue("tbilisi")),
    addressInput = $(byAttribute("formcontrolname", "street")),
    emailInput = $(byAttribute("formcontrolname", "email"), 1),
    passInput = $(byAttribute("formcontrolname", "password"), 1),
    confPassInput = $(byAttribute("formcontrolname", "confirmPassword")),
    newsLetters = $(byAttribute("for", "newsletters")),
    rules = $(byAttribute("for", "acceptTerms")),
    agree = $(byClassName("p-10")),
    checkRegComp = $(byText("ახალი პროდუქტები"));









    public ElementsCollection
     input = $$(".test");
}
