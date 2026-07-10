package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    public static final Target CART_TITLE =
            Target.the("título del carrito")
                  .located(By.cssSelector(".title"));

    public static final Target CHECKOUT_BUTTON =
            Target.the("botón checkout")
                  .located(By.id("checkout"));

    public static final Target CONTINUE_SHOPPING_BUTTON =
            Target.the("botón continuar comprando")
                  .located(By.id("continue-shopping"));

    public static final Target CART_ITEM_NAMES =
            Target.the("nombres de productos en carrito")
                  .located(By.cssSelector(".cart_item .inventory_item_name"));

    public static final Target REMOVE_BUTTON =
            Target.the("botón eliminar producto del carrito")
                  .located(By.cssSelector("[id^='remove-']"));
}