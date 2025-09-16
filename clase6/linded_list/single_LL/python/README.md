# Implementación de Lista Enlazada Simple en Python

Este directorio contiene una completa implementación y explicación de una **Lista Enlazada Simple** (`Singly Linked List`) en Python. El objetivo es proporcionar tanto el código funcional como los recursos educativos para comprender esta estructura de datos fundamental.

## Descripción del Contenido

El directorio está organizado de la siguiente manera:

### 1. Código Fuente (`src/`)

El subdirectorio `src` contiene la implementación modular de la lista enlazada:

- **`node.py`**: Define la clase `Node`, el bloque de construcción esencial de la lista. Cada nodo almacena un dato y una referencia al siguiente nodo.
- **`linked_list.py`**: Contiene la clase `LinkedList`, que gestiona la colección de nodos y provee la interfaz para manipular la lista (añadir, eliminar, buscar, etc.).
- **`test_linked_list.py`**: Un script de prueba que demuestra el uso práctico de la clase `LinkedList` y sus métodos.

Para ejecutar las pruebas, navega al directorio `src` y ejecuta:
```bash
python test_linked_list.py
```

### 2. Cuaderno Explicativo (`linked_list.ipynb`)

Este Jupyter Notebook es una guía interactiva y detallada que explica paso a paso:
- Los conceptos teóricos de las listas enlazadas.
- La estructura de las clases `Node` y `LinkedList`.
- Ejemplos de código ejecutables que muestran cómo usar la lista.
- Una simulación visual del comportamiento de la lista utilizando Python Tutor.

Es un excelente recurso para aprender de manera interactiva.

### 3. Diagramas y Recursos Visuales

El directorio también incluye varios archivos de diagramas (`.drawio` y `.png`) que ilustran visualmente los conceptos clave:
- **`uml_clases.png`**: Diagrama UML que muestra la relación entre las clases `LinkedList` y `Node`.
- **`node.png`**: Representación gráfica de la estructura de un nodo.
- **`linked_list_single_link_0.png` y `linked_list_single_link_1.png`**: Ilustraciones que muestran el estado de una lista enlazada vacía y con elementos.
