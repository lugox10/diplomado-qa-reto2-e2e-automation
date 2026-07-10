package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InventoryPage {

    public static final Target PRODUCTS_TITLE =
            Target.the("título Products")
                  .located(By.cssSelector(".title"));

    public static final Target INVENTORY_CONTAINER =
            Target.the("contenedor del inventario")
                  .located(By.cssSelector("[data-test='inventory-container']"));

    public static final Target BURGER_MENU =
            Target.the("menú lateral")
                  .located(By.id("react-burger-menu-btn"));

    public static final Target SORT_DROPDOWN =
            Target.the("lista de ordenamiento")
                  .located(By.cssSelector(".product_sort_container"));

    public static final Target SHOPPING_CART =
            Target.the("carrito")
                  .located(By.id("shopping_cart_container"));

    public static final Target CART_BADGE =
            Target.the("cantidad de productos")
                  .located(By.cssSelector(".shopping_cart_badge"));

    public static final Target PRODUCT_PRICE =
            Target.the("precios de productos")
                  .located(By.cssSelector(".inventory_item_price"));

    public static Target addToCart(String productId) {
        return Target.the("Agregar " + productId)
                .located(By.id("add-to-cart-" + productId));
    }

    public static Target removeFromCart(String productId) {
        return Target.the("Remover " + productId)
                .located(By.id("remove-" + productId));
    }
}