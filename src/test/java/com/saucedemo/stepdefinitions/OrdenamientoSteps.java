package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.ProductosOrdenadosPorPrecio;
import com.saucedemo.tasks.OrdenarProductos;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class OrdenamientoSteps {

    @When("ordena los productos por {string}")
    public void ordenaLosProductosPor(String opcionVisible) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                OrdenarProductos.por(opcionVisible)
        );
    }

    @Then("los productos deben quedar ordenados por precio")
    public void losProductosDebenQuedarOrdenadosPorPrecio() {
        assertThat(
                ProductosOrdenadosPorPrecio.ascendente().answeredBy(OnStage.theActorInTheSpotlight()),
                is(true)
        );
    }
}