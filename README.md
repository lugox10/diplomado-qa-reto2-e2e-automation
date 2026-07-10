# 🚀 SauceDemo E2E Automation - Diplomado QA

Proyecto desarrollado como parte del **Reto 2 - Estrategia de Automatización End-to-End (E2E)**.

## Objetivo

Diseñar e implementar una estrategia de automatización E2E sobre la aplicación:

https://www.saucedemo.com/

utilizando dos frameworks diferentes:

- Serenity BDD + Screenplay (Java)
- Playwright (Python)

e integrando la ejecución mediante Jenkins CI/CD.

---

# Arquitectura del proyecto

```
serenity-screen-play-diplo-2
│
├── src
│   ├── test
│   │   ├── java
│   │   │
│   │   ├── models
│   │   ├── ui
│   │   ├── tasks
│   │   ├── interactions
│   │   ├── questions
│   │   ├── stepdefinitions
│   │   ├── runner
│   │   ├── utils
│   │   └── exceptions
│   │
│   └── resources
│       ├── features
│       └── serenity.conf
│
├── gradle
├── Jenkinsfile
├── build.gradle
├── settings.gradle
├── README.md
└── gradlew
```

---

# Tecnologías utilizadas

- Java 17
- Gradle 8.5
- Serenity BDD 4.2.34
- Screenplay Pattern
- Selenium WebDriver
- Cucumber
- JUnit 4
- ChromeDriver (AutoDownload)
- Jenkins
- GitHub

---

# Patrones implementados

El proyecto utiliza el patrón **Screenplay**, separando claramente las responsabilidades.

```
Actor
   │
   ├── Tasks
   │
   ├── Interactions
   │
   ├── Questions
   │
   ├── UI
   │
   └── Models
```

Esto permite mantener un framework escalable y reutilizable.

---

# Escenarios Serenity

Actualmente el proyecto automatiza los siguientes escenarios:

### Escenario 1

Login exitoso

- Abrir SauceDemo
- Autenticación
- Validar acceso al inventario

---

### Escenario 2

Compra E2E

- Login
- Agregar productos
- Ir al carrito
- Checkout
- Confirmar compra

---

### Escenario 3

Ordenamiento de productos

- Login
- Ordenar por precio
- Validar orden ascendente

---

# Estructura Screenplay

## UI

Contiene todos los locators de la aplicación.

Ejemplo:

- LoginPage
- InventoryPage
- CartPage
- CheckoutPage

---

## Tasks

Representan acciones de negocio.

Ejemplo:

- AbrirLaAplicacion
- IniciarSesion
- AgregarProductos
- IrAlCarrito
- IniciarCheckout
- CompletarCheckout
- FinalizarCompra
- OrdenarProductos

---

## Questions

Validan el comportamiento de la aplicación.

Ejemplo:

- ElLoginFueExitoso
- CompraExitosa
- ProductoEnCarrito
- ProductosOrdenadosPorPrecio

---

## Interactions

Abstraen acciones reutilizables.

- ClickSeguro
- EscribirTexto
- EsperarElemento
- SelectOption

---

## Models

Objetos del dominio.

- Usuario
- Producto

---

# Requisitos

Antes de ejecutar el proyecto es necesario instalar:

- Java 17
- Gradle 8.5
- Google Chrome
- Git

---

# Clonar el repositorio

```bash
git clone https://github.com/lugox10/serenity-screen-play-diplo-2.git
```

Entrar al proyecto

```bash
cd serenity-screen-play-diplo-2
```

---

# Ejecutar las pruebas

Windows

```bash
gradlew.bat clean test aggregate
```

Linux / Mac

```bash
./gradlew clean test aggregate
```

---

# Reportes Serenity

Después de la ejecución se genera automáticamente el reporte.

Ubicación:

```
target/site/serenity/index.html
```

---

# Jenkins CI/CD

El proyecto incluye un pipeline Jenkins con dos etapas.

```
Stage 1
---------
Serenity BDD



Cada ejecución genera:

- Reportes Serenity
- Evidencias
- Capturas en caso de fallo

---



# Autor

**Lugo andres**

Proyecto desarrollado para el Diplomado de Automatización de Pruebas.

---

# Licencia

Proyecto desarrollado con fines académicos.