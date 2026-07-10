package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutCompletePage {

    public static final Target COMPLETE_HEADER =
            Target.the("mensaje final de compra")
                  .located(By.cssSelector(".complete-header"));

    public static final Target COMPLETE_TEXT =
            Target.the("texto final de compra")
                  .located(By.cssSelector(".complete-text"));

    public static final Target BACK_HOME_BUTTON =
            Target.the("botón volver al home")
                  .located(By.id("back-to-products"));
}