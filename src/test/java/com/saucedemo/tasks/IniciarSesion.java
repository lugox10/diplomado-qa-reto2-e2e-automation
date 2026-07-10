package com.saucedemo.tasks;

import com.saucedemo.interactions.ClickSeguro;
import com.saucedemo.interactions.EscribirTexto;
import com.saucedemo.models.Usuario;
import com.saucedemo.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class IniciarSesion implements Task {

    private final Usuario usuario;

    public IniciarSesion(Usuario usuario) {
        this.usuario = usuario;
    }

    public static IniciarSesion conCredenciales(Usuario usuario) {
        return Tasks.instrumented(
                IniciarSesion.class,
                usuario
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                EscribirTexto.en(
                        LoginPage.USERNAME_INPUT,
                        usuario.getUsername()
                ),

                EscribirTexto.en(
                        LoginPage.PASSWORD_INPUT,
                        usuario.getPassword()
                ),

                ClickSeguro.sobre(
                        LoginPage.LOGIN_BUTTON
                )

        );

    }
}