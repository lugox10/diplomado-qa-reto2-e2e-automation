package com.saucedemo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EscribirTexto implements Interaction {

    private final String texto;
    private final Target campo;

    public EscribirTexto(String texto, Target campo) {
        this.texto = texto;
        this.campo = campo;
    }

    public static EscribirTexto en(Target campo, String texto) {
        return Tasks.instrumented(
                EscribirTexto.class,
                texto,
                campo
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(campo, isVisible()).forNoMoreThan(10).seconds(),
                Clear.field(campo),
                Enter.theValue(texto).into(campo)
        );
    }
}
