package com.saucedemo.tasks;

import com.saucedemo.interactions.SelectOption;
import com.saucedemo.ui.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class OrdenarProductos implements Task {

    private final String opcionVisible;

    public OrdenarProductos(String opcionVisible) {
        this.opcionVisible = opcionVisible;
    }

    public static OrdenarProductos por(String opcionVisible) {

        return Tasks.instrumented(
                OrdenarProductos.class,
                opcionVisible
        );

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                SelectOption.byVisibleText(
                        InventoryPage.SORT_DROPDOWN,
                        opcionVisible
                )

        );

    }
}