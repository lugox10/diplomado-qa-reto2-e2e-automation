package com.saucedemo.tasks;

import com.saucedemo.interactions.ClickSeguro;
import com.saucedemo.interactions.EscribirTexto;
import com.saucedemo.interactions.EsperarElemento;
import com.saucedemo.models.CheckoutData;
import com.saucedemo.ui.CheckoutOverviewPage;
import com.saucedemo.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class CompletarCheckout implements Task {

    private final CheckoutData datos;

    public CompletarCheckout(CheckoutData datos) {
        this.datos = datos;
    }

    public static CompletarCheckout conDatos(CheckoutData datos) {

        return Tasks.instrumented(
                CompletarCheckout.class,
                datos
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                EscribirTexto.en(
                        CheckoutPage.FIRST_NAME,
                        datos.getFirstName()
                ),

                EscribirTexto.en(
                        CheckoutPage.LAST_NAME,
                        datos.getLastName()
                ),

                EscribirTexto.en(
                        CheckoutPage.ZIP_CODE,
                        datos.getZipCode()
                ),

                ClickSeguro.sobre(
                        CheckoutPage.CONTINUE_BUTTON
                ),

                EsperarElemento.visible(
                        CheckoutOverviewPage.OVERVIEW_TITLE
                )

        );

    }
}