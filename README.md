# Sistema de Gestión de Inventario de una Tienda

## ¿Qué es esto?
Este proyecto es un sistema de gestión de inventario en Java que te ayuda a mantener un control eficiente de los productos en una tienda. Si te has encontrado alguna vez con el caos en el inventario, ¡este sistema es para ti! Diseñado con Programación Orientada a Objetos (POO), te permite agregar, modificar, eliminar y buscar productos, además de generar informes sobre el inventario actual.

## Estructura del Proyecto
El proyecto está formado por varias clases que trabajan juntas para hacer que todo funcione de la mejor manera:

- **Clases Principales:**
  - **`Producto`:** Esta es la clase base y contiene los atributos esenciales que todo producto necesita, como ID, nombre, precio y cantidad en inventario. Básicamente, ¡es el corazón de nuestro sistema!
  
  - **`Perecedero`:** Esta clase hereda de `Producto` y se utiliza para los productos que tienen una fecha de caducidad, como alimentos. Incluye detalles como:
    - `fechaDeCaducidad`: Cuándo se echa a perder.
    - `temperaturaDeAlmacenamiento`: La temperatura a la que se debe guardar.
  
  - **`NoPerecedero`:** Otra clase que hereda de `Producto`, pero para productos que no se echan a perder, como electrodomésticos. Tiene un atributo adicional:
    - `garantia`: La garantía en meses que cubre el producto.
  
  - **`GestorInventario`:** Esta clase es la encargada de toda la lógica de negocio. Aquí es donde guardamos todos los productos en una lista y tenemos varios métodos útiles, como:
    - **AgregarProducto:** Para añadir un nuevo producto al inventario.
    - **ModificarProducto:** Si necesitas cambiar la información de un producto existente, este es el lugar.
    - **EliminarProducto:** Para deshacerse de productos que ya no necesitas.
    - **BuscarProducto:** Encuentra un producto rápidamente por su ID.
    - **GenerarInforme:** Crea un informe que muestra todos los productos disponibles en el inventario.

## Cómo Usarlo
1. **Configuración Inicial:**
   - Necesitas tener instalado Java en tu computadora. Asegúrate de que tienes el JDK configurado correctamente.
   - Clona el repositorio y navega hasta la carpeta del proyecto.

2. **Ejecutar el Programa:**
   - Abre tu terminal o consola.
   - Compila el código:
     

```bash
     javac Main.java
     
