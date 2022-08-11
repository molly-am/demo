package net.splendid.elmosoft.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import java.util.List;
import net.elmosoft.splendid.driver.annotation.FindBy;
import net.elmosoft.splendid.driver.element.BrowserElement;
import net.elmosoft.splendid.driver.element.MobileElement;
import net.elmosoft.splendid.driver.page.Page;
import net.elmosoft.splendid.driver.page.PageFactory;
import org.openqa.selenium.Keys;

public class MobileMainPage extends Page {

    @AndroidFindBy(id = "login")
    @iOSXCUITFindBy(accessibility = "signin")
    private MobileElement loginBtn;

    @AndroidFindBy(id = "username")
    @iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTextField[`label == \"username\"`]")
    private MobileElement username;

    @AndroidFindBy(id = "password")
    @iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeOther[`label == \"password\"`][1]")
    private MobileElement password;

    @AndroidFindBy(id = "login")
    @iOSXCUITFindBy(accessibility="login")
    private MobileElement validateBtn;

    public MobileMainPage() {
        super();
    }

    @Override
    public void checkPage() {
        loginBtn.waitForElementDisplayed(THIRTY_SECONDS_WAIT);
    }

    @Override
    public void waitForPageIsLoaded() {
    }


    public void doLogin() {
        loginBtn.click();
        username.type("test name");
        password.type("testpasswprd");
        validateBtn.click();
    }

    public void doLogin(String email, String pass) {
        loginBtn.click();
        username.type(email);
        password.type(pass);
        validateBtn.click();
    }
}
