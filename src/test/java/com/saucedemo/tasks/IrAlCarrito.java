package com.saucedemo.tasks;

import com.saucedemo.interactions.ClickSeguro;
import com.saucedemo.interactions.EsperarElemento;
import com.saucedemo.ui.CartPage;
import com.saucedemo.ui.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class IrAlCarrito implements Task {

    public static IrAlCarrito desdeProductos() {
        return Tasks.instrumented(IrAlCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                ClickSeguro.sobre(
                        InventoryPage.SHOPPING_CART
                ),

                EsperarElemento.visible(
                        CartPage.CART_TITLE
                )

        );

    }
}