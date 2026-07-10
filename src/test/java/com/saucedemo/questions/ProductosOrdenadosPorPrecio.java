package com.saucedemo.questions;

import com.saucedemo.ui.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductosOrdenadosPorPrecio {

    public static Question<Boolean> ascendente() {
        return actor -> {
            List<String> valores = ProductsPage.PRODUCT_PRICE.resolveAllFor(actor)
                    .stream()
                    .map(element -> element.getText().replace("$", "").trim())
                    .collect(Collectors.toList());

            List<BigDecimal> precios = valores.stream()
                    .map(BigDecimal::new)
                    .collect(Collectors.toList());

            List<BigDecimal> ordenados = new ArrayList<>(precios);
            ordenados.sort(Comparator.naturalOrder());

            return precios.equals(ordenados);
        };
    }
}