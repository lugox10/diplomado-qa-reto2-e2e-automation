package com.saucedemo.questions;

import com.saucedemo.ui.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class ElLoginFueExitoso {

    public static Question<Boolean> esVisible() {
        return actor -> Visibility.of(InventoryPage.INVENTORY_CONTAINER).viewedBy(actor).asBoolean();
    }
}
