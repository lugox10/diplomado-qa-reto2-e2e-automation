package com.saucedemo.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.environment.SerenityEnvironmentInfo;
import net.serenitybdd.screenplay.actors.Stage;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;

public class Hooks {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void tearDown() {
        OnStage.drawTheCurtain();
    }
}