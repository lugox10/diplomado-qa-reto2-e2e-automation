package com.saucedemo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EsperarElemento implements Interaction {

    private final Target target;

    public EsperarElemento(Target target) {
        this.target = target;
    }

    public static EsperarElemento visible(Target target) {
        return Tasks.instrumented(
                EsperarElemento.class,
                target
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(target, isVisible())
                        .forNoMoreThan(10)
                        .seconds()
        );
    }
}