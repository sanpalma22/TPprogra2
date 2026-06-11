# Apuntes: Complejidad Algorítmica (Big O) 🚀

Básicamente, cuando hablamos de complejidad en programación, no nos referimos a qué tan difícil fue armar el código. Lo que realmente importa es **cómo se comporta (o escala) el algoritmo cuando le tiramos cada vez más datos**.

Para medir esto de forma universal (sin importar si corrés el programa en una PC de la NASA o en una calculadora), usamos la notación **Big O**.

Acá dejo el resumen de los dos conceptos clave de Progra 2:

---

## ⏱️ 1. Complejidad Temporal (Tiempo de ejecución)

Mide cómo crece la cantidad de **operaciones o pasos** que tiene que hacer el algoritmo a medida que aumenta el tamaño de los datos de entrada (`n`).

* **No se mide en segundos:** Se mide en la cantidad de instrucciones que el procesador tiene que ejecutar.
* **La pregunta clave es:** "Si paso de tener 10 elementos a 10.000, ¿cuánto trabajo extra tiene que hacer mi código?".
* **Ejemplo práctico:** Si querés buscar un nombre específico en una lista desordenada, en el peor de los casos tenés que revisar uno por uno hasta el final. Si la lista duplica su tamaño, la cantidad de pasos también se duplica. A esto se le llama crecimiento **lineal** o `O(n)`.

---

## 💾 2. Complejidad Espacial (Memoria RAM)

Mide cuánta **memoria adicional** o espacio extra necesita el algoritmo para poder funcionar, en relación a la cantidad de datos de entrada (`n`).

* **No cuenta los datos originales:** No se cuenta el espacio que ya ocupa el arreglo inicial, sino el espacio *auxiliar* que creamos nosotros temporalmente (como variables nuevas, arreglos de soporte, o el espacio en memoria cuando usamos recursividad).
* **La pregunta clave es:** "Si me dan un millón de datos para procesar, ¿necesito pedirle más memoria a la compu para lograrlo?".
* **Ejemplos:** * Si querés sumar todos los números de un arreglo, seguro usás una sola variable `total` y la vas actualizando. No importa si el arreglo tiene 5 o 5.000 números, siempre gastás el espacio de esa única variable. Eso es complejidad **constante** o `O(1)`.
  * Si tenés que extraer datos y pasarlos a una cola auxiliar nueva, la memoria que usás crece a la par de los datos. Eso es complejidad **lineal** o `O(n)`.

---

### ⚖️ El balance (Trade-off)
En la vida real, a menudo hay un "tira y afloja" entre estas dos cosas. Muchas veces, para que un algoritmo sea rapidísimo (baja complejidad temporal), necesitás sacrificar memoria guardando datos temporales. Otras veces, si tenés muy poca memoria disponible, te toca usar algoritmos más lentos para ahorrar espacio.