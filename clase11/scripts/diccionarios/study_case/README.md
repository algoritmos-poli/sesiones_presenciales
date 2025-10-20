# Caso de uso de diccionarios

Este repositorio contiene dos programas en Python que demuestran una aplicación práctica de los diccionarios: **el análisis de frecuencia de palabras en un texto**.

Ambos scripts están diseñados para ser ejecutados con el archivo de texto [`lincoln.txt`](lincoln.txt) proporcionado, que contiene el discurso de Gettysburg ([link](https://es.wikipedia.org/wiki/Discurso_de_Gettysburg)). A continuación, se detalla la función de cada programa y el procedimiento para su ejecución.


## Ejemplos

### Ejemplo 1

**Archivo**: [CountOccurrenceOfWords.py](CountOccurrenceOfWords.py)

####  Descripción

Este programa lee un archivo de texto, procesa su contenido para contar la frecuencia de cada palabra y, finalmente, muestra las 10 palabras más comunes encontradas en el texto, ordenadas de mayor a menor frecuencia.

#### Procedimiento de Ejecución

1. Abra y ejecute el archivo CountOccurrenceOfWords.py en su Entorno de Desarrollo Integrado (IDE).
2. Cuando el programa lo solicite en la consola, ingrese el nombre del archivo de texto: `lincoln.txt` y presione Enter.
3. El programa mostrará en la consola una lista de las 10 palabras más frecuentes junto con su respectivo conteo.

### Ejemplo 2

**Archivo**: [CountOccurrenceOfWordsFromFile.py](CountOccurrenceOfWordsFromFile.py)

#### Descripción

Este script realiza una tarea idéntica al anterior: cuenta la ocurrencia de palabras en un archivo de texto y presenta las 10 más frecuentes. Aunque el resultado es el mismo, este código utiliza un método ligeramente diferente para ordenar y procesar los datos antes de mostrarlos, sirviendo como un ejemplo alternativo para resolver el mismo problema.

#### Procedimiento de Ejecución
1. Abra y ejecute el archivo `CountOccurrenceOfWordsFromFile.py` en su IDE.
2. En la consola, ingrese el nombre del archivo `lincoln.txt` cuando se le solicite y presione Enter.
3. Al igual que el script anterior, la salida mostrará las 10 palabras más comunes y su frecuencia.