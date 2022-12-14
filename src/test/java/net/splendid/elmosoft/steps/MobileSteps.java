package net.splendid.elmosoft.steps;

import io.qameta.allure.Step;
import net.splendid.elmosoft.pages.GoogleMainPage;
import net.splendid.elmosoft.pages.GoogleSearchPage;
import net.splendid.elmosoft.pages.MobileMainPage;

public class MobileSteps {
    @Step("Make succesfull login")
    public void doLogin() {
        MobileMainPage mainPage = new MobileMainPage();
        mainPage.checkPage();
        mainPage.doLogin();
    }

    @Step("Make succesfull login with params")
    public void doLoginWithParams(String email, String password) {
        MobileMainPage mainPage = new MobileMainPage();
        mainPage.checkPage();
        mainPage.doLogin(email, password);
    }
}
