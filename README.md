# AC06-Repaso

Ejercicio de repaso de Kotlin que trabaja con un mapa de sensores y sus
temperaturas.

## Funcionalidad

El programa:

- Define cuatro sensores (`S1`, `S2`, `S3` y `S4`) con sus valores de
  temperatura.
- Recorre el mapa mediante un `for` y muestra los sensores cuya temperatura es
  superior a `25`.
- Consulta el sensor `S9` y muestra `Sin datos` cuando no existe, utilizando el
  operador Elvis (`?:`).

Con los datos actuales, la salida esperada es:

```text
S2
S4
Sin datos
```