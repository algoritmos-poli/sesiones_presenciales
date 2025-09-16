# Implementaciones de Listas Enlazadas

Este directorio contiene una colección de implementaciones de estructuras de datos de **Listas Enlazadas** en Java y Python. El objetivo es proporcionar ejemplos claros y funcionales de diferentes tipos de listas, desde las más simples hasta las más complejas, junto con recursos educativos como cuadernos de Jupyter y diagramas.

## Contenido del Directorio

El proyecto está organizado en subdirectorios, cada uno enfocado en una variante específica de lista enlazada:

### 1. `single_LL` (Lista Enlazada Simple)

Contiene la implementación más fundamental de una lista enlazada, donde cada nodo solo tiene una referencia al siguiente nodo (`next`).
- **Implementaciones**: Java y Python.
- **Características**: Mantiene solo una referencia a la cabeza (`head`) de la lista.

### 2. `single_LL_double_end` (Lista Enlazada Simple con Doble Extremo)

Es una optimización de la lista simple que añade una referencia al último nodo (`tail`). Esto permite que operaciones como `addLast()` se realicen en tiempo constante O(1) en lugar de O(n).
- **Implementaciones**: Java y Python.
- **Características**: Mantiene referencias tanto a `head` como a `tail`.

### 3. `doubly_LL` (Lista Doblemente Enlazada)

Una implementación más avanzada donde cada nodo tiene dos referencias: una al nodo siguiente (`next`) y otra al nodo anterior (`prev`). Esto permite recorridos bidireccionales.
- **Implementaciones**: Java y Python.
- **Variantes**:
    - **`con_herencia`**: Un enfoque que utiliza herencia, donde `DoublyNode` extiende de una clase base `Node`.
    - **`sin_herencia`**: Un enfoque más simple donde la clase `Node` contiene directamente las referencias `next` y `prev`.

Cada subdirectorio incluye el código fuente, pruebas de ejemplo, diagramas UML y, en algunos casos, cuadernos de Jupyter (`.ipynb`) para una explicación más interactiva.
