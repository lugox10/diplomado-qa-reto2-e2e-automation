package com.saucedemo.utils;

import com.saucedemo.models.Producto;
import com.saucedemo.models.Usuario;

public final class SauceDemoConstants {

    private SauceDemoConstants() {
    }

    public static final String URL =
            "https://www.saucedemo.com/";

    // Usuarios

    public static final Usuario STANDARD_USER =
            new Usuario(
                    "standard_user",
                    "secret_sauce"
            );

    public static final Usuario LOCKED_USER =
            new Usuario(
                    "locked_out_user",
                    "secret_sauce"
            );

    public static final Usuario PROBLEM_USER =
            new Usuario(
                    "problem_user",
                    "secret_sauce"
            );

    // Productos

    public static final Producto BACKPACK =
            new Producto(
                    "sauce-labs-backpack",
                    "Sauce Labs Backpack",
                    29.99
            );

    public static final Producto BIKE_LIGHT =
            new Producto(
                    "sauce-labs-bike-light",
                    "Sauce Labs Bike Light",
                    9.99
            );

    public static final Producto BOLT_TSHIRT =
            new Producto(
                    "sauce-labs-bolt-t-shirt",
                    "Sauce Labs Bolt T-Shirt",
                    15.99
            );
}