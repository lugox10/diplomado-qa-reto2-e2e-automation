package com.saucedemo.tasks;

import com.saucedemo.ui.CheckoutCompletePage;
import com.saucedemo.ui.CheckoutOverviewPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FinalizarCompra implements Task {

    public static FinalizarCompra ahora() {
        return Tasks.instrumented(FinalizarCompra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutOverviewPage.FINISH_BUTTON),
                WaitUntil.the(CheckoutCompletePage.COMPLETE_HEADER, isVisible())
        );
    }
}