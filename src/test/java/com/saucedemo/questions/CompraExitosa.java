package com.saucedemo.questions;

import com.saucedemo.ui.CheckoutCompletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CompraExitosa {

    public static Question<Boolean> esVisible() {
        return actor -> CheckoutCompletePage.COMPLETE_HEADER.resolveFor(actor).isVisible();
    }
}