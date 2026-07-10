package com.saucedemo.tasks;

import com.saucedemo.utils.SauceDemoConstants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirLaAplicacion implements Task {

    public static AbrirLaAplicacion enSauceDemo() {
        return Tasks.instrumented(AbrirLaAplicacion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.url(SauceDemoConstants.URL)
        );

    }
}