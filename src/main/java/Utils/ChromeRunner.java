package Utils;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Description;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {

    @BeforeMethod(description = "ბრაუზერის გამართვა და გახსნა")
    public static void setUp(){
//        Configuration.browserSize = "3840x2160";
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true).savePageSource(false));
        System.setProperty("selenide.browserSize", "1920x1080");
        open("https://icrshop.ge/");
    }
    @AfterMethod(description = "ქეშის გასუფთავება და ბრაუზერის დახურვა")
    public void tearDown(){
        SelenideLogger.removeListener("allure");
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }


}
