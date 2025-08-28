
# Ejemplo de Carrito de Compras en Java

Este proyecto contiene un ejemplo simple de un carrito de compras implementado en Java, compuesto por tres clases principales:

- **[`Product`](Product.java)**: Representa un producto con nombre y precio.
- **[`ShoppingCart`](ShoppingCart.java)**: Permite agregar, eliminar, mostrar y limpiar productos en el carrito.
- **[`Store`](Store.java)**: Clase principal con el método `main` para ejecutar el ejemplo.

## Cómo ejecutar el código

1. Asegurese de tener los archivos `Product.java`, `ShoppingCart.java` y `Store.java` en la misma carpeta.
2. Abra su IDE favorito (por ejemplo, Visual Studio Code, IntelliJ IDEA o Eclipse) y abra la carpeta donde están los archivos.
3. Compile y ejecute el archivo `Store.java` desde el IDE usando la opción de "Run" o "Ejecutar".


## Salida esperada

El programa realiza las siguientes acciones:
- Agrega productos al carrito.
- Muestra los productos y el total.
- Elimina un producto y muestra el nuevo total.
- Limpia el carrito y muestra que está vacío.

La salida será similar a:

```
--- Adding products to the cart --- Milk - $2.50 Bread - $1.75 Eggs - $3.20 Current Total: $7.45

--- Removing a product --- Milk - $2.50 Eggs - $3.20 New Total: $5.70

--- Clearing the cart --- El carrito está vacío.
```
