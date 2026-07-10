package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutOverviewPage {

    public static final Target OVERVIEW_TITLE =
            Target.the("título checkout overview")
                  .located(By.cssSelector(".title"));

    public static final Target SUBTOTAL =
            Target.the("subtotal")
                  .located(By.cssSelector(".summary_subtotal_label"));

    public static final Target TAX =
            Target.the("impuesto")
                  .located(By.cssSelector(".summary_tax_label"));

    public static final Target TOTAL =
            Target.the("total")
                  .located(By.cssSelector(".summary_total_label"));

    public static final Target FINISH_BUTTON =
            Target.the("botón finish")
                  .located(By.id("finish"));
}