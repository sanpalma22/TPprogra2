Consigna: En el historial de navegacion, identifica que se apila y que se desapila cuando se usa el boton de atras.

Resolucion: A medida que navegas se apila cada pagina que visitas. Cuando apretas atras, desapilas la pagina actual y te devuelve a la que quedo en el tope de la pila. 

Consigna: En el editor de codigo (deshacer), que estado deberias apilar y como lo recuperas.

Resolucion: Se apila todo el estado del archivo con cada cambio que haces. Cuando apretas para deshacer, desapilas ese estado y volves al que estaba antes. 

Consigna: Balanceo de parentesis, en que momento haces un apilar y cuando desapilas.

Resolucion: Apilas cuando el compilador lee un parentesis de apertura, y desapilas cuando lee uno de cierre para ver si el bloque coincide. 

Consigna: Para dar vuelta la palabra ALGORITMOS, explica el proceso.

Resolucion: Vas metiendo las letras en la pila una por una. Como la pila funciona con el sistema donde el ultimo en entrar es el primero que sale, al sacarlas te quedan en el orden inverso.  

Consigna: Pila de llamadas. Si Main llama a CalcularPromedio y esta llama a Sumar, quien esta en el tope.

Resolucion: La funcion Sumar es la que queda en el tope porque fue la ultima que el programa llamo.  

Consigna: Cual de las estrategias con arreglos es la mas ineficiente para apilar y por que.

Resolucion: La peor de todas es la estrategia 2 que usa el indice 0 como tope. Te obliga a desplazar todos los elementos un lugar hacia la derecha cada vez que apilas algo, lo que cuesta O(n). La estrategia 1 es mucho mejor porque vas directo a la posicion con un costo temporal de O(1).
