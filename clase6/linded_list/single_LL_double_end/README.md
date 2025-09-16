# Lista Enlazada Simple con Doble Extremo

Este directorio contiene implementaciones de una **Lista Enlazada Simple con Doble Extremo** (`Singly Linked List with Head and Tail pointers`). Esta es una optimización de la lista enlazada simple tradicional.

## Descripción del Proyecto

A diferencia de una lista enlazada simple que solo mantiene una referencia a la cabeza (`head`), esta versión también mantiene una referencia al último nodo de la lista (`tail`).

La principal ventaja de este enfoque es la eficiencia en la operación de añadir un elemento al final (`addLast` o `add_last`). Mientras que en una lista simple esta operación tiene una complejidad de tiempo de O(n) porque requiere recorrer toda la lista, en una lista con doble extremo, la operación se realiza en tiempo constante, **O(1)**, ya que se puede acceder directamente al último nodo a través del puntero `tail`.

El directorio contiene implementaciones en Java y Python, junto con recursos visuales y educativos.

## Contenido del Directorio

### 1. `java/`

Contiene una implementación orientada a objetos en Java.
- **`Node.java`**: Define la estructura del nodo.
- **`LinkedList.java`**: Implementa la lógica de la lista enlazada con punteros `head` y `tail`.
- **`TestLinkedList.java`**: Contiene el método `main` para probar la implementación.

### 2. `python/`

Contiene una implementación en Python, junto con recursos educativos.
- **`src/`**: Código fuente modular con `node.py`, `linked_list.py` y `test_linked_list.py`.
- **`linked_list_double_ended.ipynb`**: Un Jupyter Notebook interactivo que explica los conceptos y muestra ejemplos de uso.
- **Diagramas**: Archivos `.drawio` y `.png` que ilustran la estructura de la lista, incluyendo los punteros `head` y `tail`.

Este proyecto es ideal para comprender cómo una pequeña modificación en el diseño de una estructura de datos puede llevar a mejoras significativas en el rendimiento de ciertas operaciones.
