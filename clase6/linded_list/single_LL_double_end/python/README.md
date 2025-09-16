# Lista Enlazada Simple con Doble Extremo (Python)

Este directorio contiene la implementación en Python de una **Lista Enlazada Simple con Doble Extremo**. Esta estructura de datos es una versión optimizada de la lista enlazada simple, ya que mantiene punteros tanto a la cabeza (`head`) como a la cola (`tail`) de la lista.

## Descripción del Contenido

La principal ventaja de esta implementación es la capacidad de agregar elementos al final de la lista en tiempo constante **O(1)**, gracias al puntero `tail`. El directorio está organizado con los siguientes recursos:

### 1. Código Fuente (`src/`)

El subdirectorio `src` contiene la implementación modular de la lista:

- **`node.py`**: Define la clase `Node`, la unidad básica de la lista.
- **`linked_list.py`**: Implementa la clase `LinkedList`, que gestiona los punteros `head` y `tail` y proporciona los métodos para manipular la lista.
- **`test_linked_list.py`**: Un script de prueba que demuestra el uso y la eficiencia de la clase `LinkedList`.

Para ejecutar las pruebas, navega al directorio `src` y ejecuta:
```bash
python test_linked_list.py
```

### 2. Cuaderno Explicativo (`linked_list_double_ended.ipynb`)

Este Jupyter Notebook es una guía interactiva que explica en detalle:
- Los conceptos teóricos de una lista con doble extremo.
- La implementación de las clases `Node` y `LinkedList`.
- Ejemplos de código ejecutables para ilustrar su funcionamiento.

Es un recurso ideal para aprender de forma práctica y visual.

### 3. Diagramas y Recursos Visuales

Se incluyen varios archivos de diagramas (`.drawio` y `.png`) para ilustrar la estructura:
- **`uml_clases.png`**: Diagrama UML que muestra la relación entre las clases `LinkedList` y `Node`, destacando los punteros `head` y `tail`.
- **`linked_list_double_ended_0.png` y `linked_list_double_ended_1.png`**: Ilustraciones que muestran el estado de la lista vacía y con elementos, respectivamente.
