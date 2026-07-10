package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USERNAME_INPUT =
            Target.the("campo username")
                  .located(By.id("user-name"));

    public static final Target PASSWORD_INPUT =
            Target.the("campo password")
                  .located(By.id("password"));

    public static final Target LOGIN_BUTTON =
            Target.the("botón login")
                  .located(By.id("login-button"));

    public static final Target ERROR_MESSAGE =
            Target.the("mensaje de error")
                  .located(By.cssSelector("[data-test='error']"));

    public static final Target LOGIN_CONTAINER =
            Target.the("contenedor de login")
                  .located(By.cssSelector("[data-test='login-container']"));
}