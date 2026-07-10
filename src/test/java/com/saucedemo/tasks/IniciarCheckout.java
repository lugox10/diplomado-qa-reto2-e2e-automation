package com.saucedemo.tasks;

import com.saucedemo.interactions.ClickSeguro;
import com.saucedemo.interactions.EsperarElemento;
import com.saucedemo.ui.CartPage;
import com.saucedemo.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class IniciarCheckout implements Task {

    public static IniciarCheckout desdeCarrito() {
        return Tasks.instrumented(IniciarCheckout.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                ClickSeguro.sobre(
                        CartPage.CHECKOUT_BUTTON
                ),

                EsperarElemento.visible(
                        CheckoutPage.CHECKOUT_INFO_TITLE
                )

        );

    }
}