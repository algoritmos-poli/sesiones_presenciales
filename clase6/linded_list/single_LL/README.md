# Implementación de Lista Enlazada Simple (Singly Linked List)

Este directorio contiene implementaciones de una **Lista Enlazada Simple**, una estructura de datos fundamental donde cada elemento (nodo) apunta al siguiente en la secuencia. El objetivo es proporcionar ejemplos claros y funcionales en diferentes lenguajes de programación.

## Descripción del Contenido

La lista enlazada simple se caracteriza por tener una única referencia a la cabeza (`head`) de la lista. Las operaciones como agregar al final (`addLast`) requieren recorrer toda la lista, lo que resulta en una complejidad de tiempo de O(n).

El directorio está organizado en subdirectorios por lenguaje:

### 1. `java/`

Contiene una implementación orientada a objetos en Java.
- **`Node.java`**: Define la estructura del nodo.
- **`LinkedList.java`**: Implementa la lógica de la lista enlazada.
- **`TestLinkedList.java`**: Contiene el método `main` para probar la implementación.

### 2. `python/`

Contiene una implementación en Python, junto con recursos educativos.
- **`src/`**: Código fuente modular con `node.py`, `linked_list.py` y `test_linked_list.py`.
- **`linked_list.ipynb`**: Un Jupyter Notebook interactivo que explica los conceptos teóricos y prácticos de la lista enlazada.
- **Diagramas**: Archivos `.drawio` y `.png` que ilustran la estructura de la lista y sus nodos.

Ambas implementaciones ofrecen una base sólida para comprender cómo funcionan las listas enlazadas simples desde cero.
