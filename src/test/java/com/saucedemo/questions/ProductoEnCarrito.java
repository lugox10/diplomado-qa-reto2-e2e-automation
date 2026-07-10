package com.saucedemo.questions;

import com.saucedemo.ui.CartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class ProductoEnCarrito {

    public static Question<Boolean> contiene(String nombreProducto) {
        return actor -> {
            List<String> nombres = CartPage.CART_ITEM_NAMES.resolveAllFor(actor)
                    .stream()
                    .map(element -> element.getText().trim())
                    .toList();

            return nombres.contains(nombreProducto);
        };
    }
}