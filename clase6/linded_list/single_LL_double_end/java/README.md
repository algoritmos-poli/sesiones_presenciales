# Lista Enlazada Simple con Doble Extremo (Java)

Este directorio contiene la implementación en Java de una **Lista Enlazada Simple con Doble Extremo**. Esta estructura es una optimización de la lista enlazada simple tradicional, ya que mantiene referencias tanto al primer nodo (`head`) como al último (`tail`).

## Descripción del Proyecto

La principal ventaja de esta implementación es la mejora en el rendimiento al agregar elementos al final de la lista. Gracias al puntero `tail`, la operación `addLast()` se ejecuta en tiempo constante **O(1)**, en lugar del tiempo lineal O(n) que requiere una lista enlazada simple convencional.

### Archivos del Proyecto

- **`Node.java`**: Define la clase `Node`, que representa un elemento individual de la lista. Cada nodo contiene un dato (`data`) y una referencia al siguiente nodo (`next`).

- **`LinkedList.java`**: Implementa la lógica de la lista enlazada. Gestiona los punteros `head` y `tail` y proporciona métodos para manipular la lista, como `addFirst()`, `addLast()`, `remove()`, `get()`, entre otros.

- **`TestLinkedList.java`**: Una clase con un método `main` que sirve para probar la funcionalidad de la `LinkedList`. Crea una lista, realiza varias operaciones de inserción y eliminación, y muestra los resultados por consola.

## Cómo Ejecutar

Para compilar y ejecutar el ejemplo, utiliza los siguientes comandos en tu terminal desde este directorio:

```bash
# Compilar todos los archivos .java
javac *.java

# Ejecutar el programa de prueba
java TestLinkedList
```
