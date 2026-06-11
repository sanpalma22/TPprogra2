# Resolución Ejercicios - Progra 2 📝

Acá están resueltos los ejercicios de complejidad algorítmica usando la notación Big O y las reglas que vimos en clase.

### Ejercicio 1: Ciclos anidados con condición
* **Complejidad:** `O(n^2)` (Cuadrática).
* **Justificación:** El peor caso pasa cuando el array no tiene ni un 5 ni un 6, obligando a los `for` a dar todas las vueltas posibles sin cortar con los `return`. El bucle de afuera da `n` vueltas y el de adentro da `i` vueltas por cada paso del exterior. Si sumás todo el trabajo, te queda una cuadrática.

### Ejercicio 2: Comparativa de "Fierros" (Colas)
* **ColaPU (Estática):** `O(n)`. Como metés todo en la posición 0, tenés que patear todos los demás elementos un lugar a la derecha para hacer espacio.
* **ColaPI (Estática):** `O(1)`. Vas directo al final del arreglo con un índice, metés el dato y listo, no movés nada.
* **ColaLD (Dinámica):** `O(1)`. Al tener punteros al principio y al final, enganchás el nuevo nodo al último y actualizás la referencia.
* **Por qué la "PU" es distinta:** Porque en los arreglos la memoria es contigua. No podés "hacer lugar" al principio sin correr físicamente todo el resto de los datos.

### Ejercicio 3: Algoritmo integrador "filtrar"
* **A) Complejidad Temporal:** `O(n)` (Lineal). Sacar los `n` elementos, evaluarlos y mandarlos a una nueva estructura toma un tiempo que crece a la par de los datos.
* **B) Complejidad Espacial:** `O(n)` (Lineal). El algoritmo te obliga a crear estructuras nuevas (la auxiliar `tmp` y la cola de los filtrados) que en el peor caso van a alojar los `n` elementos. Más datos = más memoria en la misma proporción.

### Ejercicio 4: Regla de la Suma 
* **Complejidad:** `O(n)` (Lineal).
* **Desglose:** 1. Asignar variables y el primer `println` es `O(1)`. 
  2. El primer `for` recorre `n` elementos = `O(n)`. 
  3. El segundo `for` también = `O(n)`. 
  Sumás todo: `O(1) + O(n) + O(n)`. Por regla te quedás con el término más grande, así que queda `O(n)`.

### Ejercicio 5: Regla del Producto (Matrices)
* **Complejidad:** `O(n^2)` (Cuadrática).
* **Justificación:** Para recorrer la matriz cuadrada tenés un `for` adentro de otro (`n * n = n^2`). El peor caso pasa si el número par no existe en la matriz o si está escondido justo en la última celda de abajo a la derecha, obligándote a escanear todo.

### Ejercicio 6: Jerarquía de Dominancia
* **Complejidad:** `O(n^2)` (Cuadrática).
* **Justificación:** Tenés un bloque A que es `O(n)` y un bloque B que es `O(n^2)`. Por la regla de la dominancia, el término más pesado "se come" al más chico. Cuando `n` es gigante, el `for` simple casi ni consume tiempo al lado de los ciclos anidados.

### Ejercicio 7: Divide y Vencerás (Búsqueda Binaria)
* **Complejidad:** `O(log n)` (Logarítmica).
* **Justificación:** En cada paso partís los datos a la mitad (`n/2`, `n/4`, `n/8`...). Si te preguntás matemáticamente cuántas veces podés dividir `n` por 2 hasta llegar a 1 solo elemento, la respuesta es el logaritmo en base 2 de `n`. Descartás la mitad del laburo en cada iteración.

### Ejercicio 8: Costo oculto del TDA Conjunto
* **Complejidad Real:** `O(n^2)` (Cuadrática).
* **Justificación:** El `for` principal recorre el conjunto A, eso es `n`. El problema es que adentro llama a `B.Pertenece(x)`. En un arreglo sin ordenar, buscar si algo existe te toma otro `n`. Por la regla del producto (un `n` adentro de otro `n`), el costo se va a `n^2`.

### Ejercicio 9: Cola con Prioridad
* **Complejidad Desacolar():** `O(K)`.
* **Justificación:** Tenés que recorrer el arreglo de las `K` prioridades para encontrar cuál subcola no está vacía. Es independiente de `n` porque no importa si tenés 5 o un millón de datos guardados en total; lo único que el algoritmo revisa son las `K` cabeceras.

### Ejercicio 10: Algoritmo con recursión doble (Fibonacci)
* **Complejidad:** `O(2^n)` (Exponencial).
* **Justificación:** Cada llamada a la función genera dos llamadas nuevas, armando una especie de árbol de recursión (1 -> 2 -> 4 -> 8). Las operaciones se duplican por cada nivel que bajás. Crece en potencias de 2, lo cual es súper costoso.