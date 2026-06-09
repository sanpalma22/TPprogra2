# Actividades y Conceptos de Pila

## Comportamiento
La Pila funciona con la regla LIFO (Last In, First Out): el último elemento en entrar es el primero en salir. Es el mismo concepto que apilar platos para lavar.

## Contrato (Interfaz)
Para cumplir con la especificación, los métodos obligatorios de la Pila son:
* InicializarPila
* Apilar
* Desapilar
* Tope
* Pilavacia

## Resolución Actividad 2: Análisis de Estrategias
Al implementar una Pila estática (con arreglos), el costo varía según la estrategia elegida:

1. **Estrategia 1 (Arreglo + variable cantidad):** Es la más rápida, con un costo de O(1), porque no requiere desplazar los elementos. Su única contra es que te obliga a mantener una variable de control por fuera del arreglo.
2. **Estrategia 2 (Tope siempre en posición 0):** Es muy ineficiente y lenta. Aunque tenés el tope siempre al inicio, cada vez que hacés un apilar tenés que desplazar todos los elementos hacia la derecha, lo cual cuesta mucho procesamiento.
3. **Estrategia 3 (Posición 0 guarda la cantidad):** El tope siempre es la última posición ocupada. Lo bueno es que te ahorrás usar variables externas porque la cantidad está adentro de la misma estructura. Lo malo es que perdés un espacio de almacenamiento (la capacidad queda en N-1) y hay que manejar bien los límites para evitar un IndexOutOfBounds.