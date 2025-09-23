# Laboratorio de Expresiones Regulares (Regex)

## Objetivo

Este laboratorio tiene como objetivo introducir los conceptos fundamentales de las expresiones regulares, proporcionar herramientas para su estudio y práctica, y evaluar la comprensión a través de ejercicios prácticos.

## 1. Introducción a las Expresiones Regulares

Una **expresión regular**, comúnmente conocida como **regex**, es una secuencia de caracteres que define un patrón de búsqueda. Se utilizan principalmente para la búsqueda y manipulación de cadenas de texto. Desde validar formatos de correo electrónico hasta analizar archivos de registro (logs) o reestructurar datos, las expresiones regulares son una herramienta indispensable en la informática.

## 2. Conceptos Fundamentales

A continuación, se presentan los componentes más importantes de las expresiones regulares.

### 2.1. Caracteres Literales y Metacaracteres

-   **Caracteres Literales:** Son caracteres que se representan a sí mismos. Por ejemplo, la regex `gato` encontrará exactamente la subcadena "gato".
-   **Metacaracteres:** Son caracteres con un significado especial. Los más comunes son: `.` `*` `+` `?` `^` `$` `[` `]` `(` `)` `{` `}` `|` `\`. Para buscar un metacaracter como si fuera un literal, debe ser "escapado" con una barra invertida (`\`), por ejemplo, `\.` para buscar un punto literal.

### 2.2. Clases de Caracteres

Permiten definir un conjunto de caracteres que pueden coincidir en una posición determinada.

| Símbolo | Descripción | Ejemplo | Coincidencia de Ejemplo |
| :--- | :--- | :--- | :--- |
| `[abc]` | Coincide con 'a', 'b', o 'c'. | `v[oa]l` | `vol`, `val` |
| `[^abc]` | Coincide con cualquier carácter excepto 'a', 'b', o 'c'. | `p[^a]l` | `pil`, `pol` (no `pal`) |
| `[a-z]` | Coincide con cualquier letra minúscula de 'a' a 'z'. | `h[a-z]la` | `hola`, `hula` |
| `[A-Z]` | Coincide con cualquier letra mayúscula de 'A' a 'Z'. | `[A-Z]cto` | `Acto`, `Pacto` |
| `[0-9]` | Coincide con cualquier dígito del '0' al '9'. | `piso_[0-9]` | `piso_1`, `piso_8` |

### 2.3. Clases de Caracteres Predefinidas

Son atajos para clases de caracteres comunes.

| Símbolo | Descripción | Equivalente |
| :--- | :--- | :--- |
| `.` | Coincide con cualquier carácter excepto el salto de línea. | |
| `\d` | Coincide con cualquier dígito. | `[0-9]` |
| `\D` | Coincide con cualquier carácter que no sea un dígito. | `[^0-9]` |
| `\w` | Coincide con cualquier carácter alfanumérico (letra, número) y guion bajo. | `[a-zA-Z0-9_]` |
| `\W` | Coincide con cualquier carácter que no sea alfanumérico. | `[^a-zA-Z0-9_]` |
| `\s` | Coincide con cualquier carácter de espacio en blanco (espacio, tab, salto de línea). | `[ \t\r\n\f]` |
| `\S` | Coincide con cualquier carácter que no sea un espacio en blanco. | `[^ \t\r\n\f]` |

### 2.4. Cuantificadores

Especifican cuántas veces debe aparecer un carácter, grupo o clase de caracteres.

| Símbolo | Descripción | Ejemplo | Coincidencia de Ejemplo |
| :--- | :--- | :--- | :--- |
| `*` | Cero o más veces. | `ab*c` | `ac`, `abc`, `abbbc` |
| `+` | Una o más veces. | `ab+c` | `abc`, `abbbc` (no `ac`) |
| `?` | Cero o una vez. | `ab?c` | `ac`, `abc` |
| `{n}` | Exactamente `n` veces. | `a{3}` | `aaa` |
| `{n,}` | `n` o más veces. | `a{2,}` | `aa`, `aaa`, `aaaa` |
| `{n,m}` | Entre `n` y `m` veces (inclusive). | `a{2,4}` | `aa`, `aaa`, `aaaa` |

### 2.5. Anclas (Anchors)

Definen posiciones en la cadena de texto, pero no coinciden con caracteres.

| Símbolo | Descripción | Ejemplo | Coincidencia de Ejemplo |
| :--- | :--- | :--- | :--- |
| `^` | Inicio de la cadena o de la línea (en modo multilinea). | `^Hola` | "Hola mundo" (no "mundo Hola") |
| `$` | Fin de la cadena o de la línea (en modo multilinea). | `fin$` | "Este es el fin" (no "fin del mundo") |
| `\b` | Límite de palabra (word boundary). La posición entre un `\w` y un `\W`. | `\bcat\b` | `cat` (no `concatenate`) |
| `\B` | Posición que no es un límite de palabra. | `\Bcat\B` | `concatenate` (no `cat`) |

### 2.6. Grupos y Captura

Los paréntesis `()` se utilizan para agrupar partes de una expresión regular.

| Símbolo | Descripción | Ejemplo | Coincidencia de Ejemplo |
| :--- | :--- | :--- | :--- |
| `(abc)` | Agrupa `abc` y lo captura. Permite aplicar cuantificadores al grupo. | `(ha)+` | `ha`, `haha`, `hahaha` |
| `(?:abc)` | Grupo sin captura. Agrupa pero no almacena la coincidencia. | `(?:ha)+` | Agrupa `ha` pero no lo "recuerda". |
| `a\|b` | Alternancia (OR). Coincide con `a` o con `b`. | `gato\|perro` | `gato`, `perro` |

## 3. Herramientas para el Estudio de Regex

Para practicar y depurar expresiones regulares, es fundamental utilizar herramientas especializadas. Estas plataformas ofrecen retroalimentación en tiempo real, explicaciones detalladas de la expresión y bibliotecas de patrones comunes.

-   **Regex101 (https://regex101.com/)**: Es la herramienta más recomendada. Permite seleccionar diferentes "sabores" de regex (PCRE, JavaScript, Python, etc.), proporciona una explicación completa de cada parte del patrón y resalta las coincidencias en el texto de prueba de forma interactiva.
-   **RegExr (https://regexr.com/)**: Similar a Regex101, con una interfaz muy clara y ejemplos comunitarios.
-   **Debuggex (https://www.debuggex.com/)**: Visualiza la expresión regular como un diagrama de flujo, lo que puede ayudar a comprender patrones complejos.

## 4. Ejemplos Prácticos para Regex101

Se recomienda abrir Regex101 y probar los siguientes ejemplos. Copie la **Expresión Regular** en el campo "REGULAR EXPRESSION" y el **Texto de Prueba** en el campo "TEST STRING".

### Ejemplo 1: Encontrar todas las palabras que terminan en "ar"

-   **Expresión Regular:** `\b\w+ar\b`
-   **Texto de Prueba:**
    ```
    Caminar, saltar, correr, programar.
    El arte de la programación es para amar.
    Claro que sí.
    ```
-   **Explicación:**
    -   `\b`: Límite de palabra, para asegurar que no estamos capturando una subcadena dentro de otra palabra (como "ar" en "Claro").
    -   `\w+`: Uno o más caracteres de palabra.
    -   `ar`: Los caracteres literales "ar".
    -   `\b`: Otro límite de palabra para marcar el final.

### Ejemplo 2: Validar un formato de fecha simple (DD-MM-AAAA)

-   **Expresión Regular:** `^\d{2}-\d{2}-\d{4}$`
-   **Texto de Prueba:**
    ```
    25-12-2023
    31-01-1999
    5-3-2023
    2023-12-25
    ```
-   **Explicación:**
    -   `^`: Inicio de la cadena.
    -   `\d{2}`: Exactamente dos dígitos para el día.
    -   `-`: Un guion literal.
    -   `\d{2}`: Exactamente dos dígitos para el mes.
    -   `-`: Un guion literal.
    -   `\d{4}`: Exactamente cuatro dígitos para el año.
    -   `$`: Fin de la cadena.
    -   *Nota*: Esta regex valida el formato, pero no la lógica (ej. no valida que el día 32 no exista).

### Ejemplo 3: Capturar el nombre de usuario y dominio de correos electrónicos

-   **Expresión Regular:** `([\w.-]+)@([\w.-]+)`
-   **Texto de Prueba:**
    ```
    Contactar a juan.perez@email.com o a soporte@mi-empresa.net para más información.
    No usar test@localhost.
    ```
-   **Explicación:**
    -   `([\w.-]+)`: Primer grupo de captura. Coincide con uno o más caracteres de palabra, puntos o guiones (el nombre de usuario).
    -   `@`: El carácter literal "@".
    -   `([\w.-]+)`: Segundo grupo de captura. Coincide con uno o más caracteres de palabra, puntos o guiones (el dominio).
    -   En Regex101, podrá ver los grupos capturados en el panel "MATCH INFORMATION".

## 5. Ejercicios de Evaluación

Utilice Regex101 para resolver los siguientes problemas. Escriba una única expresión regular que cumpla con los requisitos de cada ejercicio.

### Ejercicio 1: Números de Teléfono

**Objetivo:** Encontrar todos los números de teléfono con el formato `(xxx) xxx-xxxx` o `xxx-xxx-xxxx`.

**Texto de Prueba:**
```
Los números de contacto son 123-456-7890 y (987) 654-3210.
El número de la oficina es 555-123-4567.
Ignorar este: 123 456 7890 o este (123)456-7890.
El código postal es 90210.
```

**Resultado Esperado:** Deben coincidir `123-456-7890`, `(987) 654-3210` y `555-123-4567`.

<details>
  <summary>Ver Solución</summary>
  
  `\(?\d{3}\)?[- ]?\d{3}-\d{4}`
  
  **Explicación:**
  - `\(?`: El paréntesis de apertura es opcional.
  - `\d{3}`: Tres dígitos para el código de área.
  - `\)?`: El paréntesis de cierre es opcional.
  - `[- ]?`: Un guion o espacio opcional como separador.
  - `\d{3}`: Tres dígitos.
  - `-`: Un guion literal.
  - `\d{4}`: Cuatro dígitos.
</details>

### Ejercicio 2: Identificadores de Usuario

**Objetivo:** Un identificador de usuario válido debe cumplir las siguientes reglas:
1.  Debe empezar con una letra.
2.  Puede contener letras (mayúsculas o minúsculas), números y guiones bajos.
3.  Debe tener una longitud total de entre 3 y 16 caracteres.

**Texto de Prueba:**
```
Usuarios válidos: user_123, Admin, u_s_e_r
Usuarios inválidos: 1user, us, a_very_long_username_that_is_not_valid, user-name
```

**Resultado Esperado:** Deben coincidir `user_123`, `Admin` y `u_s_e_r`.

<details>
  <summary>Ver Solución</summary>
  
  `^[a-zA-Z][a-zA-Z0-9_]{2,15}$`
  
  **Explicación:**
  - `^`: Inicio de la cadena.
  - `[a-zA-Z]`: El primer carácter debe ser una letra.
  - `[a-zA-Z0-9_]{2,15}`: Los siguientes caracteres (entre 2 y 15) pueden ser letras, números o guion bajo. Esto, sumado al primer carácter, da una longitud total de 3 a 16.
  - `$`: Fin de la cadena.
</details>

### Ejercicio 3: Extracción de Hashtags

**Objetivo:** Extraer todos los hashtags de un texto. Un hashtag empieza con `#` y es seguido por una o más letras o números.

**Texto de Prueba:**
```
Este es un gran día para programar. #FelizJueves #CodeLife
No confundir con el color #123456.
Esto no es un hashtag: #.
#Python es genial.
```

**Resultado Esperado:** Deben coincidir `#FelizJueves`, `#CodeLife` y `#Python`.

<details>
  <summary>Ver Solución</summary>
  
  `#\b[a-zA-Z0-9]+\b`
  
  **Explicación:**
  - `#`: El carácter literal de hashtag.
  - `\b`: Un límite de palabra para asegurar que no está en medio de otra palabra.
  - `[a-zA-Z0-9]+`: Una o más letras (mayúsculas o minúsculas) o números.
  - `\b`: Un límite de palabra al final.
</details>

### 5.1. Ejercicios Avanzados

### Ejercicio 4: Análisis de Componentes de URL

**Objetivo:** Crear una expresión regular que capture el protocolo (http o https), el dominio y la ruta (path) de una URL. La ruta es opcional.

**Texto de Prueba:**
```
Visita nuestro sitio en https://www.mi-sitio-web.com/recursos/documento.pdf
El servidor de desarrollo está en http://localhost:8080
Otro enlace es https://ejemplo.com
Inválido: ftp://ftp.servidor.com
```

**Resultado Esperado:** La regex debe capturar los siguientes grupos para las URLs válidas:
1.  `https`, `www.mi-sitio-web.com`, `/recursos/documento.pdf`
2.  `http`, `localhost:8080`, (ninguna captura para la ruta)
3.  `https`, `ejemplo.com`, (ninguna captura para la ruta)

<details>
  <summary>Ver Solución</summary>
  
  `^(https?):\/\/([\w.-]+(?::\d+)?)(\/[^\s]*)?$`
  
  **Explicación:**
  - `^`: Inicio de la línea.
  - `(https?)`: Grupo 1 (Protocolo). Captura "http" y una "s" opcional.
  - `:\/\/`: Separador literal.
  - `([\w.-]+(?::\d+)?)`: Grupo 2 (Dominio y puerto). Captura el nombre de dominio (letras, números, guion, punto). Incluye un grupo sin captura `(?::\d+)?` para el puerto opcional (ej. `:8080`).
  - `(\/[^\s]*)?`: Grupo 3 (Ruta). Es un grupo opcional. Captura una barra `/` seguida de cualquier carácter que no sea un espacio en blanco.
  - `$`: Fin de la línea.
</details>

### Ejercicio 5: Extracción de Atributos de Etiquetas HTML

**Objetivo:** Encontrar todas las etiquetas `<img>` y capturar el valor de su atributo `src`. Este ejercicio introduce el concepto de cuantificadores "perezosos" (lazy).

**Texto de Prueba:**
```html
<p>Una imagen de un gato.</p>
<img src="/images/gato.jpg" alt="Un lindo gato">
<p>Otra imagen.</p>
<img alt="Un perro" src="https/example.com/perro.png">
<img src="logo.svg">
```

**Resultado Esperado:** Deben capturarse los siguientes valores del atributo `src`:
1.  `/images/gato.jpg`
2.  `https/example.com/perro.png`
3.  `logo.svg`

<details>
  <summary>Ver Solución</summary>
  
  `<img.*?src="([^"]+)".*?>`
  
  **Explicación:**
  - `<img`: Literal que inicia la etiqueta.
  - `.*?`: Coincide con cualquier carácter (excepto salto de línea) cero o más veces, pero de forma "perezosa" (lazy). Esto es crucial para que no salte hasta el último `src` del documento. Coincide con los espacios y otros atributos antes de `src`.
  - `src="`: Literal que indica el inicio del atributo `src`.
  - `([^"]+)`: Grupo de captura 1. Captura uno o más caracteres que NO sean comillas dobles. Este es el valor de la URL.
  - `"`: Comilla doble de cierre del atributo.
  - `.*?>`: Coincide con cualquier otro atributo hasta el `>` que cierra la etiqueta, de nuevo de forma perezosa.
</details>

### Ejercicio 6: Validación de Contraseña Segura

**Objetivo:** Validar que una contraseña cumpla con todas las siguientes reglas simultáneamente, usando "lookaheads":
1.  Mínimo 8 caracteres de longitud.
2.  Contiene al menos una letra minúscula.
3.  Contiene al menos una letra mayúscula.
4.  Contiene al menos un número.

**Texto de Prueba:**
```
Válidas: Fuerte123, P4ssw0rd, miClave-9
Inválidas: debil, FUERTE, 12345678, Fuerte, Fuerte12
```

**Resultado Esperado:** Deben coincidir `Fuerte123`, `P4ssw0rd` y `miClave-9`.

<details>
  <summary>Ver Solución</summary>
  
  `^(?=.*[a-z])(?=.*[A-Z])(?=.*\d).{8,}$`
  
  **Explicación:**
  - `^`: Ancla de inicio de cadena.
  - `(?=.*[a-z])`: "Lookahead" positivo. Asegura que en algún lugar de la cadena haya una letra minúscula, pero no consume caracteres.
  - `(?=.*[A-Z])`: "Lookahead" positivo. Asegura que en algún lugar haya una letra mayúscula.
  - `(?=.*\d)`: "Lookahead" positivo. Asegura que en algún lugar haya un dígito.
  - `. {8,}`: Si todas las condiciones anteriores se cumplen, coincide con cualquier carácter (excepto salto de línea) 8 o más veces.
  - `$`: Ancla de fin de cadena.
</details>

