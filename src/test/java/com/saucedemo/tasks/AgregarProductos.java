package com.saucedemo.tasks;

import com.saucedemo.interactions.ClickSeguro;
import com.saucedemo.interactions.EsperarElemento;
import com.saucedemo.models.Producto;
import com.saucedemo.ui.InventoryPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.Arrays;
import java.util.List;

public class AgregarProductos implements Task {

    private final List<Producto> productos;

    public AgregarProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public static AgregarProductos con(Producto... productos) {

        return Tasks.instrumented(
                AgregarProductos.class,
                Arrays.asList(productos)
        );

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        for (Producto producto : productos) {

            actor.attemptsTo(

                    ClickSeguro.sobre(
                            InventoryPage.addToCart(
                                    producto.getId()
                            )
                    )

            );

        }

        actor.attemptsTo(

                EsperarElemento.visible(
                        InventoryPage.CART_BADGE
                )

        );

    }
}