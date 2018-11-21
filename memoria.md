# PRÁCTICA PRUEBAS IDM

### Ejercicio 1 - Cálculo de años bisiestos
  * **Apartado 1.** Se analizará la clase `Bisiestos`, donde uno de sus métodos llamado `esBisiesto`, devuelve true o false si el año que le proporcionamos es o no bisiesto.
  * **Apartado 2.** Tenemos 1 parámetro:
    * Tenemos un único Parámetro `año`, de tipo *int*. Este será el año que queremos comprobar si es bisiesto o no.
  * **Apartado 3.** Tendremos 3 caracterizaciones:
    * C1: año respecto del 0.
      * b1: año negativo
      * b2: año 0
      * b3: año positivo
    * C2: año múltiplo de 4.
      * b1: True
      * b2: False
    * C3: año múltiplo de 100.
      * b1: True
      * b2: False
    * C4: año múltiplo de 400.
      * b1: True
      * b2: False

  * **Apartado 4.** Valores adecuados a cada bloque según criterios de cobertura:
    * C1: -200 | 0 | 2018
    * C2: 4 | 5
    * C3: 100 | 101
    * C4: 400 | 401

---

### Ejercicio 2 - Conversión de números romanos a base 10
  * **Apartado 1.** Se analizará la clase `RomanNumeral`, la cual contiene un método `convierte` que se encarga de transformar el *String* proporcionado en un número en base 10 (int).
  * **Apartado 2.** Tenemos un único parámetro `s` de tipo *String*, que será el número romano que queremos convertir a base diez.
  * **Apartado 3.** Tendremos 3 caracterizaciones:
    * C1: null (string vacío).
    * C2: string que sea romano.
    * C3: string que NO sea romano.
  * **Apartado 4.**

---

### Ejercicio 3 - Embotelladora
  * **Apartado 1.** Se analizará la clase `Embotelladora`, la cual contiene un método llamado `calculaBotellasPequenas`, que debe devolver el número de botellas pequeñas, medianas y grandes necesarias para embotellar un número total de litros, minimizando el número de botellas grandes.
  * **Apartado 2.** Hay 3 parámetros:
    * `pequeñas`: tipo int. Será el número de botellas de 1 litro disponibles en el almacén.
    * `grande`: tipo int. Será el número de botellas de 5 litros disponibles en el almacén.
    * `total`: tipo int. Número total de litros que queremos embotellar.
  * **Apartado 3.**  Tendremos en esta ocasión 5 caracterizaciones:
    * C1: no botellas disponibles de ningún tamaño.
    * C2: sólo botellas pequeñas disponibles.
    * C3: sólo botellas grandes disponibles.
    * C4: mayor número de botellas grandes que pequeñas.
    * C5: mayor número de botellas pequeñas que grandes.
  * **Apartado 4.**

---

### Ejercicio 4 - Descuento Black Friday
  * **Apartado 1.** Se analizará la clase `DescuentoBlackFriday`, la cual contiene un método llamado `PrecioFinal`, que devuelve un precio final un 30% menor que el precio original proporcionado, en el caso de que el día actual sea 23 de noviembre.
  * **Apartado 2.** Un único parámetro `precioOriginal` de tipo *double*. Será el precio original de un producto marcado en su etiqueta, sin descuento.
  * **Apartado 3.** Hay 2 caracterizaciones:
    * C1: precio original de producto que se va a rebajar.
    * C2: precio original de producto que no se va a rebajar.
  * **Apartado 4.**
