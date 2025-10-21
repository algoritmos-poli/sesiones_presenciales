# Ejemplos de Funciones en Python

Estos scripts de Python son ejemplos prácticos sobre la definición, invocación y uso de funciones. Están basados en los ejemplos proporcionados en el libro *Introduction to Programming Using Python* de Y. Daniel Liang.

## Descripción de Archivos

La siguiente tabla resume el propósito de cada script de ejemplo:

| Archivo | Descripción Breve |
| :--- | :--- |
| [`DefaultArgumentDemo.py`](DefaultArgumentDemo.py) | Demuestra cómo definir y llamar funciones que utilizan argumentos con valores por defecto. |
| [`GCDFunction.py`](GCDFunction.py) | Define la función `gcd(n1, n2)` que calcula y retorna el máximo común divisor de dos enteros. |
| [`GuessNumber.py`](GuessNumber.py) | Implementa un juego simple donde el usuario debe adivinar un número aleatorio (0-100) con pistas de "muy alto" o "muy bajo". |
| [`Increment.py`](Increment.py) | Ilustra cómo Python maneja los argumentos (paso por valor de objeto), mostrando que una variable inmutable (`x`) no cambia su valor en `main` después de ser pasada a la función `increment`. |
| [`MultipleReturnValueDemo.py`](MultipleReturnValueDemo.py)| Muestra cómo una función (`sort`) puede retornar múltiples valores simultáneamente (en este caso, dos números ordenados). |
| [`PrimeNumberFunction.py`](PrimeNumberFunction.py) | Contiene una función `isPrime` (para verificar si un número es primo) y una función `printPrimeNumbers` que la utiliza para imprimir los primeros 50 números primos. |
| [`PrintGradeFunction.py`](PrimeNumberFunction.py) | Define una función (`printGrade`) que *imprime* directamente una calificación (A-F) basada en un puntaje numérico. No retorna ningún valor. |
| [`ReturnGradeFunction.py`](ReturnGradeFunction.py) | Define una función (`getGrade`) que *retorna* una calificación (A-F) como un valor string, basándose en un puntaje numérico. |
| [`TestGCDFunction.py`](TestGCDFunction.py) | Un script que *importa* y prueba la función `gcd` del módulo `GCDFunction.py`, usando entradas proporcionadas por el usuario. |
| [`TestMax.py`](TestMax.py) | Define y prueba una función simple `max(num1, num2)` que retorna el mayor de los dos números proporcionados. |


## Cómo Ejecutar los Ejemplos

Puedes ejecutar cualquiera de estos scripts `.py` usando un Entorno de Desarrollo Integrado (IDE) de Python, como **VS Code**, **PyCharm**, **Thonny** o **Spyder**.

1.  **Abrir el IDE:** Inicie su IDE preferido.
2.  **Abrir el Archivo:** Abra el archivo Python que desea ejecutar (por ejemplo, `GuessNumber.py`) usando el menú `Archivo > Abrir...` (o `File > Open...`).
3.  **Ejecutar:** Busque el botón de "Ejecutar" y haga clic en él. También puedes usar el atajo de teclado correspondiente (comúnmente `F5` o `Ctrl+Shift+F10`).
4.  **Ver la Salida:** La salida del programa (y cualquier solicitud de entrada, como en `GuessNumber.py`) aparecerá en la **consola** o **terminal** integrada del IDE.

**Nota sobre Dependencias:** Para ejecutar `TestGCDFunction.py`, el archivo `GCDFunction.py` debe estar ubicado en la misma carpeta (directorio), ya que el primero importa código del segundo.

> [!Note]
> **AI Disclosure:** This document was created with the assistance of Artificial Intelligence language models. The content has been reviewed, edited, and validated by a human author to ensure accuracy and quality.