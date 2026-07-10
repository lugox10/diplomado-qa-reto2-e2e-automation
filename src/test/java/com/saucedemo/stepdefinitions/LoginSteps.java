package com.saucedemo.stepdefinitions;

import com.saucedemo.questions.ElLoginFueExitoso;
import com.saucedemo.tasks.AbrirLaAplicacion;
import com.saucedemo.tasks.IniciarSesion;
import com.saucedemo.utils.SauceDemoConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LoginSteps {

    @Given("que {string} abre la aplicación")
    public void queAbreLaAplicacion(String actorName) {
        theActorCalled(actorName).attemptsTo(AbrirLaAplicacion.enSauceDemo());
    }

    @When("inicia sesión con credenciales válidas")
    public void iniciaSesionConCredencialesValidas() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                IniciarSesion.conCredenciales(
                        SauceDemoConstants.STANDARD_USER,
                        SauceDemoConstants.SECRET_SAUCE
                )
        );
    }

    @Then("debería ver el inventario de productos")
    public void deberiaVerElInventarioDeProductos() {
        assertThat(
                ElLoginFueExitoso.esVisible().answeredBy(OnStage.theActorInTheSpotlight()),
                is(true)
        );
    }
}