# First_Partial_Project

## Instuctions

    - Use java 17 or higher to avoid bugs.

---

    - Run the programme from "Main".

---

## 2. Escriba una breve explicación de por qué ha elegido el algoritmo DP para resolver el problema.
    
- Uno de los requerimientos era usar programacion dinamica para resolver el proyecto, pero en funcion a 
  lo que iba analizando es una forma optima de analizar similitud entre palabras, ya que la programacion 
  dinamica se adapta bien a este escenario pudiendo usar (LCS) por lo que es muy itul para este contexto.

---

## 3. Identifique la complejidad temporal de su solución.

- La complejidad temporal es O(n * m) debido a la comparación de todas las palabras de los textos utilizando programación dinámica.

---

## 4. Responda a la siguiente pregunta

### ¿Existe alguna solución que no sea programación dinámica? en caso afirmativo, explique la idea y compárela con su solución.

- Otra forma de comparar textos es mediante un enfoque de fuerza bruta, comparando cada palabra de un texto con todas las palabras del otro. Sin embargo, esta solución es menos eficiente que la proporcionada, que utiliza programación dinámica. La programación dinámica ofrece una solución más rápida y eficiente, especialmente para textos grandes, gracias a su complejidad temporal más baja (O(n * m)).

