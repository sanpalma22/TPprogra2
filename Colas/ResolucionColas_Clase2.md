# Actividades y Conceptos de Cola

## Comportamiento
La Cola sigue la regla FIFO (First In, First Out): el primero que entra es el primero que sale. Funciona igual que la fila para que te atiendan en el banco.

## Contrato (Interfaz)
La especificación nos obliga a tener estos métodos para una Cola estándar:
* InicializarCola
* Acolar
* Desacolar
* Primero
* Colavacia

## Cola con Prioridad
En este tipo de Cola, el orden de salida no depende de quién llegó antes, sino de la prioridad que se le asigne al elemento.
* Los métodos cambian a `AcolarPrioridad (valor, prioridad)` y `Prioridad()`.
* Detalle importante para la implementación: si dos elementos entran con exactamente la misma prioridad, la semántica es libre. Es decir, el programador decide qué criterio de desempate usar.