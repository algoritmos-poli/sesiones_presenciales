# Ejemplos del Capítulo 6: Funciones y Diseño Top-Down

Este repositorio contiene una serie de scripts en Python que sirven como ejemplos prácticos de los conceptos presentados en el **Capítulo 6 del libro *Introduction to Programming Using Python* de Y. Daniel Liang**.

Los archivos ilustran el poder de las funciones para estructurar el código, facilitar la reutilización y aplicar metodologías de diseño fundamentales como el diseño descendente (Top-Down Design [[link1]](https://es.wikipedia.org/wiki/Top-down_y_bottom-up) [[link2]](https://cis.temple.edu/~wangp/1057-PC/Lecture/Ch03.htm)). Están organizados en dos aplicaciones principales: una utilidad de conversión numérica y un programa complejo de generación de calendarios.

---

## Ejemplo 1: Conversión Numérica y Módulos

Este ejemplo sencillo se centra en la conversión de valores y la encapsulación de lógica en funciones reutilizables.

| Archivo | Descripción |
| :--- | :--- |
| [`Decimal2HexConversion.py`](Decimal2HexConversion.py) | Script principal que solicita al usuario un número decimal y lo convierte a su equivalente en hexadecimal. Utiliza una función auxiliar para mapear valores a caracteres hexadecimales. |
| [`RandomCharacter.py`](RandomCharacter.py) | Un módulo (biblioteca) que define varias funciones de utilidad para generar caracteres aleatorios (ej. letras minúsculas, dígitos, caracteres ASCII). Este archivo no está diseñado para ejecutarse directamente, sino para ser importado por otros programas. |

---

## Ejemplo 2: Implementación de Calendario (Diseño Top-Down)

Este ejemplo más complejo demuestra el diseño descendente (Top-Down Design) para resolver un problema (imprimir un calendario) dividiéndolo en subproblemas más pequeños, cada uno resuelto por una función específica (ej. `getStartDay`, `isLeapYear`, `printMonthBody`).

| Archivo | Descripción |
| :--- | :--- |
| [`PrintCalendar.py`](PrintCalendar.py) | La implementación completa y funcional del programa de calendario. Pide al usuario un año y un mes, y luego imprime el calendario correspondiente utilizando el formato estándar. |
| [`PrintCalendarUsingFString.py`](PrintCalendarUsingFString.py) | Una implementación alternativa idéntica en lógica a `PrintCalendar.py`, pero que utiliza "f-strings" (cadenas literales formateadas) de Python moderno para formatear la salida de los días. |
| [`PrintCalendarSkeleton.py`](PrintCalendarSkeleton.py) | Representa la primera etapa del diseño *top-down*. Este script contiene solo los "stubs" (esqueletos o definiciones vacías) de todas las funciones necesarias. Es útil para diseñar la arquitectura del programa y verificar el flujo de llamadas antes de implementar la lógica interna de cada función. |

---

## Instrucciones de Ejecución

Para ejecutar estos ejemplos, debe utilizar un entorno de desarrollo integrado (IDE) de Python (como VS Code, PyCharm, Thonny) o ejecutar los scripts directamente desde una terminal.

### Archivos Ejecutables

Los siguientes archivos están diseñados para ser ejecutados directamente, ya que contienen una función `main()` o código de nivel superior que solicita entradas al usuario:

* [`Decimal2HexConversion.py`](Decimal2HexConversion.py)
* [`PrintCalendar.py`](PrintCalendar.py)
* [`PrintCalendarUsingFString.py`](PrintCalendarUsingFString.py)
* [`PrintCalendarSkeleton.py`](PrintCalendarSkeleton.py) (Se ejecutará, pero solo imprimirá los mensajes de los "stubs" en lugar de un calendario real).

**Pasos para ejecutar en un IDE:**

1.  Abra su IDE de Python.
2.  Abra el archivo `.py` que desea ejecutar (ej. `PrintCalendar.py`).
3.  Utilice la opción "Run" (Ejecutar) del IDE, que usualmente se encuentra en el menú principal o haciendo clic derecho en el editor (a menudo con un atajo como `F5` o `Shift+F10`).
4.  La salida del programa (y cualquier solicitud de entrada) aparecerá en la consola o terminal integrada del IDE.

### Archivos de Módulo

El siguiente archivo **no** está diseñado para ser ejecutado directamente:

* [`RandomCharacter.py`](RandomCharacter.py)

Este archivo es un **módulo** y está destinado a ser importado por otros programas que necesiten sus funciones (aunque ninguno de los otros ejemplos de esta lista lo utiliza actualmente).

> [!Note]
> **AI Disclosure:** This document was created with the assistance of Artificial Intelligence language models. The content has been reviewed, edited, and validated by a human author to ensure accuracy and quality.