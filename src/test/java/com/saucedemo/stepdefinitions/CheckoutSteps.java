package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.CompraExitosa;
import com.saucedemo.tasks.AgregarProductos;
import com.saucedemo.tasks.CompletarCheckout;
import com.saucedemo.tasks.FinalizarCompra;
import com.saucedemo.tasks.IniciarCheckout;
import com.saucedemo.tasks.IrAlCarrito;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CheckoutSteps {

    @When("agrega los productos {string} y {string}")
    public void agregaLosProductosYS(String producto1, String producto2) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarProductos.con(producto1, producto2)
        );
    }

    @When("va al carrito")
    public void vaAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IrAlCarrito.desdeProductos()
        );
    }

    @When("inicia el checkout con datos válidos")
    public void iniciaElCheckoutConDatosValidos() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IniciarCheckout.desdeCarrito(),
                CompletarCheckout.conDatos("Mostro", "QA", "110111"),
                FinalizarCompra.ahora()
        );
    }

    @Then("la compra debe finalizar exitosamente")
    public void laCompraDebeFinalizarExitosamente() {
        assertThat(
                CompraExitosa.esVisible().answeredBy(OnStage.theActorInTheSpotlight()),
                is(true)
        );
    }
}