## Q1 Given the following recursive code
- update the code so it uses dynamic programming
- identify where the overlap of the sub problems occurs.
    - El ejercicio esta en la clase "EjercicioQ1"

## Q2 Can we say that "all the implementations that use a top-down approach are dynamic programming algorithms"?


No todos los enfoques de arriba hacia abajo son programación dinámica. La programación dinámica implica resolver problemas divididos en
subproblemas más simples y almacenar soluciones para evitar cálculos redundantes. Un enfoque de arriba hacia abajo
por sí solo no garantiza esto; la programación dinámica lo logra al almacenar resultados de subproblemas. 




## Q4:
# Identificación del Problema
  - Se identifica que el problema requiere utilizar programación dinámica para encontrar la Longest Increasing Subsequence (LIS).

## Descripción del Problema
 - El problema consiste en encontrar la cantidad mínima de regalos que deben ser movidos para organizarlos según las preferencias de Coco. Esto se logra modificando el algoritmo LIS para encontrar la longitud de la subsecuencia creciente más larga y luego calcular la cantidad mínima de regalos que deben ser movidos.

### Entrada
 - La entrada consiste en el tamaño del array de regalos (N) y los valores que representan las preferencias de Coco para cada regalo.

### Salida
- La salida es la cantidad mínima de regalos que deben ser movidos para organizarlos según las preferencias de Coco.

### Análisis del Problema
- Se resolverá utilizando programación dinámica con el algoritmo LIS (Longest Increasing Subsequence).

### Sub-problemas:
  - Introducir el tamaño del array.
  - Crear un array del tamaño especificado.
  - Introducir los valores del array.
  - Implementar la función de programación dinámica con top-down (memorización) para LIS.
  - Aplicar el algoritmo LIS.
  - Retornar y mostrar la cantidad mínima de regalos. 
### Fórmula
  -  La fórmula para encontrar la cantidad mínima de regalos que deben ser movidos será el total de regalos menos la longitud de la LIS. Esto se obtiene utilizando el algoritmo LIS para encontrar la longitud máxima de la subsecuencia creciente, y luego restando esa longitud del total de regalos.