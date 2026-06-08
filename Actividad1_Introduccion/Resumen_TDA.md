Actividad 1: Introducción a TDA y Estructuras de Datos

Breve resumen teórico de la primera parte de la materia, enfocado en las abstracciones y el diseño de los TDA antes de pasar a la implementación.

TDA (Tipo de Dato Abstracto)
La idea principal de usar un TDA es separar el "qué" hace una estructura de datos de su implementación interna (el "cómo" lo hace). Esto sirve para mantener el encapsulamiento y poder usar la estructura sin depender de cómo está construida por detrás.

Pilas (LIFO)
LIFO significa Last In, First Out. El último elemento que ingresa a la estructura es el primero en ser retirado.
Operaciones básicas:
- apilar(): agrega un elemento al tope.
- desapilar(): saca el elemento del tope.
- tope(): devuelve el valor del elemento superior sin sacarlo.
- pilaVacia(): verifica si la estructura no tiene elementos.

Colas (FIFO)
FIFO significa First In, First Out. El primer elemento que ingresa es el primero en salir, respetando el orden de llegada.
Operaciones básicas:
- acolar(): agrega un elemento al final.
- desacolar(): saca el primer elemento.
- primero(): devuelve el valor del primer elemento sin sacarlo.
- colaVacia(): verifica si la cola no tiene elementos.

Colas con prioridad
Es una variante de la cola donde los elementos no salen solo por el orden en el que llegaron, sino según un nivel de prioridad que se les asigna.
