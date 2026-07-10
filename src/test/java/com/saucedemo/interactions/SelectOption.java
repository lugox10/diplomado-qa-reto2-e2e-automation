package com.saucedemo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;

public class SelectOption implements Interaction {

    private final Target target;
    private final String option;

    public SelectOption(Target target, String option) {
        this.target = target;
        this.option = option;
    }

    public static SelectOption byVisibleText(Target target, String option){

        return Tasks.instrumented(
                SelectOption.class,
                target,
                option
        );

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        target.resolveFor(actor)
              .selectByVisibleText(option);

    }

}