# Implementación de Lista Enlazada Simple en Python

Este directorio contiene una implementación básica de una **Lista Enlazada Simple** (`Singly Linked List`) en Python. El objetivo es mostrar de manera clara y concisa cómo se construye y se manipula esta estructura de datos fundamental.

## Descripción del Proyecto

El proyecto se compone de tres archivos principales:

1.  **`node.py`**: Define la clase `Node`, que es el bloque de construcción de la lista. Cada nodo contiene un dato (`data`) y una referencia (`next`) al siguiente nodo en la secuencia.

2.  **`linked_list.py`**: Contiene la clase `LinkedList`, que gestiona la estructura de la lista. Implementa la lógica para realizar operaciones comunes como:
    - `add_first()`: Añadir un elemento al inicio.
    - `add_last()`: Añadir un elemento al final.
    - `add_after()`: Insertar un elemento después de un nodo específico.
    - `remove()`: Eliminar un elemento por su valor.
    - `get()`: Buscar un nodo por su valor.
    - `size()`: Obtener el número de elementos.
    - `contains()`: Verificar si un valor existe en la lista.
    - `clear()`: Vaciar la lista.

3.  **`test_linked_list.py`**: Un script que demuestra el uso de la clase `LinkedList`. Crea una lista, realiza varias operaciones de inserción y eliminación, y muestra el estado de la lista en cada paso.

## Cómo Ejecutar

Para ver la implementación en acción, simplemente ejecuta el archivo `test_linked_list.py` desde la terminal. Asegúrate de estar en el directorio `src`.

```bash
python test_linked_list.py
```

### Salida Esperada

La ejecución del script producirá la siguiente salida, mostrando cómo la lista cambia con cada operación:

```
[5] -> [10] -> [15]
[5] -> [10] -> [12] -> [15]
[10] -> [12] -> [15]
Size: 3
Contains 12: True
Empty List
```
