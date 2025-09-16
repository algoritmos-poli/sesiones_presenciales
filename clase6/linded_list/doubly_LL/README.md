# Implementaciones de Lista Doblemente Enlazada (Doubly Linked List)

Este directorio contiene implementaciones de una **Lista Doblemente Enlazada** en Java y Python, explorando dos enfoques de diseño diferentes: uno que utiliza herencia y otro que no.

Una lista doblemente enlazada es una estructura de datos en la que cada nodo mantiene una referencia no solo al siguiente nodo, sino también al anterior. Esto permite un recorrido bidireccional y optimiza ciertas operaciones de eliminación.

## Contenido del Directorio

El proyecto está organizado en dos subdirectorios principales, cada uno representando una estrategia de implementación distinta:

### 1. `con_herencia`

En esta versión, se utiliza el principio de **herencia** de la Programación Orientada a Objetos.
- Se define una clase base `Node` con los atributos comunes (`data`, `next`).
- La clase `DoublyNode` **extiende** de `Node` y añade el atributo `prev`.
- **Ventaja**: Promueve la reutilización de código si existieran múltiples tipos de nodos que comparten una base común.
- **Implementaciones**: Disponible en Java y Python.

### 2. `sin_herencia`

Este es un enfoque más directo y autocontenido.
- Se define una única clase `Node` que incluye todos los atributos necesarios: `data`, `next` y `prev`.
- **Ventaja**: Es más simple y fácil de entender, ya que no introduce la complejidad de una jerarquía de clases. Es ideal para cuando solo se necesita una lista doblemente enlazada.
- **Implementaciones**: Disponible en Java y Python.

Cada subdirectorio contiene el código fuente (`java`/`python`), archivos de prueba, diagramas UML (`.puml`) y recursos visuales (`.drawio`, `.png`) para ilustrar la estructura y el funcionamiento de la lista.
