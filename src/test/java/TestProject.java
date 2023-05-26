import StepObject.RegistrationPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByAttribute;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.*;

public class TestProject extends ChromeRunner{

    @Test
    public void TestRegistraciaPos(){
        $(byLinkText("რეგისტრაცია")).click();
        $(byText("სახელი და გვარი უნდა ემთხვეოდეს პირადობის მოწმობაში მითითებულ მონაცემებს")).shouldBe(Condition.visible);
        $(byClassName("text-uppercase"), 1).click();
        $(byText("სახელი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("გვარი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("პირადი ნომერი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("ტელეფონი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("სქესი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("დაბადების თარიღი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("ქალაქი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("მისამართი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("ელ. ფოსტა სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("გაიმეორეთ პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byText("წესები სავალდებულოა.")).shouldBe(Condition.visible);
        $(byAttribute("formcontrolname", "firstName")).setValue("Beqa");
        $(byText("სახელი სავალდებულოა.")).shouldNot(Condition.visible);
        $(byAttribute("formcontrolname", "lastName")).setValue("GuguSvili");
        $(byText("გვარი სავალდებულოა.")).shouldNot(Condition.visible);
        $(byAttribute("formcontrolname", "personalId")).setValue("15000000000");
        $(byText("პირადი ნომერი სავალდებულოა.")).shouldNot(Condition.visible);
        $(byAttribute("formcontrolname", "phone")).setValue("598910572");
        $(byText("ტელეფონი სავალდებულოა.")).shouldNot(Condition.visible);
        $(byClassName("form-check-label"),1).click();
        $(byText("სქესი სავალდებულოა.")).shouldNot(Condition.visible);
        $(byClassName("col-md-4"), 4).click();
        $(byValue("02")).click();
        $(byText("დაბადების თარიღი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byClassName("col-md-4"), 5).click();
        $(byValue("7")).click();
        $(byText("დაბადების თარიღი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byClassName("col-md-4"), 6).click();
        $(byValue("1992")).click();
        $(byText("დაბადების თარიღი სავალდებულოა.")).shouldNot(Condition.visible);
        $(byAttribute("formcontrolname", "city")).click();
        $(byValue("tbilisi")).click();
        $(byText("ქალაქი სავალდებულოა.")).shouldNot(Condition.visible);
        $(byAttribute("formcontrolname", "street")).setValue("ჭავჭავაძის 17");
        $(byText("მისამართი სავალდებულოა.")).shouldNot(Condition.visible);
        $(byAttribute("formcontrolname", "email"), 1).setValue("gugushvilibeqa15@gmail.com");
        $(byText("ელ. ფოსტა სავალდებულოა.")).shouldNot(Condition.visible);
        $(byAttribute("formcontrolname", "password"), 1).setValue("Tbilisi111");
        $(byText("პაროლი სავალდებულოა.")).shouldNot(Condition.visible);
        $(byAttribute("formcontrolname", "confirmPassword")).setValue("Tbilisi111");
        $(byText("გაიმეორეთ პაროლი სავალდებულოა.")).shouldNot(Condition.visible);
        $(byAttribute("for", "newsletters")).click();
        $(byText("წესები სავალდებულოა.")).shouldBe(Condition.visible);
        $(byAttribute("for", "acceptTerms")).click();
        $(byText("წესები სავალდებულოა.")).shouldNot(Condition.visible);
        $(byClassName("text-uppercase"), 1).click();
        sleep(1000);
        $(byClassName("p-10")).click();
        sleep(1000);
//        $(byText("ახალი პროდუქტები")).shouldBe(Condition.visible);
        sleep(1000);
        Assert.assertTrue($(byText("ახალი პროდუქტები")).isDisplayed());


    }


    @Test
    public void TestRegistraciaNeg(){

    }
}
