## Ejercicio 1 — Construcción de ABB

**Secuencia de inserción:** 50, 30, 70, 20, 40, 60, 80

### Proceso de inserción nodo por nodo

| Valor | Comparaciones | Posición final |
|-------|--------------|----------------|
| 50 | — (árbol vacío) | Raíz |
| 30 | 30 < 50 → izquierda | Hijo izquierdo de 50 |
| 70 | 70 > 50 → derecha | Hijo derecho de 50 |
| 20 | 20 < 50 → izq → 20 < 30 → izq | Hijo izquierdo de 30 |
| 40 | 40 < 50 → izq → 40 > 30 → der | Hijo derecho de 30 |
| 60 | 60 > 50 → der → 60 < 70 → izq | Hijo izquierdo de 70 |
| 80 | 80 > 50 → der → 80 > 70 → der | Hijo derecho de 70 |

### Árbol resultante

```
           50
          /  \
        30    70
       /  \  /  \
      20  40 60  80
```

### Respuestas

**1. Descripción nodo por nodo:**
- **50** → raíz del árbol
- **30** → hijo izquierdo de 50
- **70** → hijo derecho de 50
- **20** → hijo izquierdo de 30 (hoja)
- **40** → hijo derecho de 30 (hoja)
- **60** → hijo izquierdo de 70 (hoja)
- **80** → hijo derecho de 70 (hoja)

**2. Recorrido In-orden:** `20 → 30 → 40 → 50 → 60 → 70 → 80`

> El in-orden de un ABB siempre produce los valores en orden ascendente.

**Altura del árbol:** `2` aristas (raíz en nivel 0, hojas en nivel 2)

---

## Ejercicio 2 — Traza de Búsqueda del valor 55

Árbol de referencia (Ejercicio 1):

```
           50
          /  \
        30    70
       /  \  /  \
      20  40 60  80
```

### Traza paso a paso

| Paso | Nodo visitado | Comparación | Decisión |
|------|--------------|-------------|----------|
| 1 | 50 | 55 > 50 | Ir a la derecha |
| 2 | 70 | 55 < 70 | Ir a la izquierda |
| 3 | 60 | 55 < 60 | Ir a la izquierda |
| 4 | null | — | Elemento no encontrado |

### Respuestas

**1. Secuencia de nodos visitados:** `50 → 70 → 60 → null`

**2. Cantidad de comparaciones de clave:** `3`

> El valor 55 no existe en el árbol. La búsqueda termina al llegar a un puntero null.

---

## Ejercicio 3 — Eliminación del nodo 30

Árbol de referencia (Ejercicio 1):

```
           50
          /  \
        30    70
       /  \  /  \
      20  40 60  80
```

### Respuestas

**1. Caso de eliminación:** **Dos hijos** — el nodo 30 tiene hijo izquierdo (20) e hijo derecho (40).

**2. Sucesor in-orden de 30:**
- Se va al hijo derecho de 30 → nodo 40
- Se baja siempre a la izquierda desde 40 → no hay hijo izquierdo
- **Sucesor in-orden = 40**

**Proceso:**
1. Se copia el valor 40 en el lugar donde estaba 30
2. Se elimina el nodo 40 original (era hoja → Caso 1: eliminación directa)

### Árbol resultante

```
           50
          /  \
        40    70
       /     /  \
      20    60  80
```

> In-orden resultante: `20 → 40 → 50 → 60 → 70 → 80` ✓ (sigue en orden ascendente)

---

## Ejercicio 4 — Factores de Balance AVL

**Secuencia de inserción:** 30, 20, 40, 10, 25

### Árbol resultante

```
           30
          /  \
        20    40
       /  \
      10  25
```

### Respuestas

**1. Estructura nodo por nodo:**
- **30** → raíz; hijo izquierdo: 20, hijo derecho: 40
- **20** → hijo izquierdo de 30; hijo izquierdo: 10, hijo derecho: 25
- **40** → hijo derecho de 30 (hoja)
- **10** → hijo izquierdo de 20 (hoja)
- **25** → hijo derecho de 20 (hoja)

**2. Factor de Balance de cada nodo** (bf = h(izq) − h(der), h(null) = −1):

| Nodo | h(subárbol izq) | h(subárbol der) | bf | ¿Balanceado? |
|------|-----------------|-----------------|----|-------------|
| 30 | 1 | 0 | **+1** | ✓ |
| 20 | 0 | 0 | **0** | ✓ |
| 40 | −1 | −1 | **0** | ✓ |
| 10 | −1 | −1 | **0** | ✓ |
| 25 | −1 | −1 | **0** | ✓ |

> El árbol está completamente balanceado. Ningún nodo requiere rotación.

---

## Ejercicio 5 — Rotación AVL: Caso LL

**Estado inicial:** AVL con nodos 30 y 20.  
**Inserción:** 10

### Árbol antes de balancear

```
    30
   /
  20
 /
10
```

### Respuestas

**1. Nodo desbalanceado y su bf:**
- Nodo desbalanceado: **30**
- h(subárbol izq) = 1, h(subárbol der) = −1
- **bf(30) = 1 − (−1) = +2** → desbalanceado

Identificación del caso:
- bf(30) = +2 → pesa a la izquierda
- bf(20) = +1 → su hijo izquierdo también pesa a la izquierda
- → **Caso LL**

**2. Tipo de rotación:** Rotación simple a la derecha sobre el nodo 30.

**Movimientos:**
1. El hijo izquierdo (20) sube y ocupa el lugar de 30
2. El nodo 30 baja y se convierte en hijo derecho de 20
3. El subárbol derecho de 20 (si existiera) pasaría a ser hijo izquierdo de 30

### Árbol final rebalanceado

```
    20
   /  \
  10   30
```

| Nodo | bf |
|------|----|
| 20 | 0 |
| 10 | 0 |
| 30 | 0 |

---

## Ejercicio 6 — Rotación AVL: Caso LR

**Estado inicial:** AVL con nodos 30 y 20.  
**Inserción:** 25

### Árbol antes de balancear

```
    30
   /
  20
    \
    25
```

### Respuestas

**1. Nodo desbalanceado y su bf:**
- Nodo desbalanceado: **30**
- h(subárbol izq) = 1, h(subárbol der) = −1
- **bf(30) = +2** → desbalanceado

Identificación del caso:
- bf(30) = +2 → pesa a la izquierda
- bf(20) = −1 → su hijo izquierdo pesa a la **derecha**
- → **Caso LR** (requiere doble rotación)

**2. Movimientos de la rotación doble:**

**Paso 1 — Rotación izquierda sobre el nodo 20:**
```
    30
   /
  25
 /
20
```
> 25 sube, 20 baja a la izquierda de 25.

**Paso 2 — Rotación derecha sobre el nodo 30:**
```
    25
   /  \
  20   30
```
> 25 sube y ocupa la raíz, 30 baja a la derecha.

### Árbol final rebalanceado

```
    25
   /  \
  20   30
```

| Nodo | bf |
|------|----|
| 25 | 0 |
| 20 | 0 |
| 30 | 0 |

---

## Ejercicio 7 — TDA Árbol B: Reglas

**Árbol B de orden 3** (orden = cantidad máxima de hijos por nodo)

### Respuestas

**1. Cantidad máxima de claves por nodo:**

```
máx_claves = orden − 1 = 3 − 1 = 2 claves
```

**2. Cantidad mínima de claves por nodo no raíz:**

```
mín_claves = ⌈orden / 2⌉ − 1 = ⌈3 / 2⌉ − 1 = 2 − 1 = 1 clave
```

### Resumen de propiedades

| Propiedad | Valor |
|-----------|-------|
| Orden | 3 |
| Máximo de claves por nodo | 2 |
| Mínimo de claves (no raíz) | 1 |
| Máximo de hijos por nodo | 3 |
| Mínimo de hijos (nodo interno no raíz) | 2 |
| Todas las hojas | al mismo nivel |

---

## Ejercicio 8 — Inserción en Árbol B

**Árbol B de orden 3 vacío.**  
**Secuencia de inserción:** 10, 20, 30

### Proceso paso a paso

**Inserción de 10:**
```
[ 10 ]
```
> El árbol tenía un nodo vacío. El 10 ocupa la raíz.

**Inserción de 20:**
```
[ 10 | 20 ]
```
> El nodo tiene capacidad para 2 claves. El 20 se inserta en el mismo nodo en orden.

**Inserción de 30:**

El nodo quedaría con `[10 | 20 | 30]` → **3 claves = overflow**.

### Respuestas

**1. Condición de overflow:**  
Al insertar 30, el nodo ya contenía 2 claves (el máximo permitido para orden 3). Al intentar agregar una tercera clave, se supera la capacidad máxima del nodo → se produce **overflow** y es necesario aplicar un **split**.

**Proceso del split:**
1. El nodo temporal queda: `[10 | 20 | 30]`
2. Se identifica la clave del medio: **20**
3. La clave del medio **sube** al nodo padre (en este caso se convierte en nueva raíz)
4. Las claves de los costados se separan en dos nodos hijos

**2. Clave promocionada:** `20`

### Estructura final

```
      [ 20 ]          ← Raíz (clave promocionada)
      /    \
   [ 10 ]  [ 30 ]     ← Hojas
```

| Componente | Contenido |
|------------|-----------|
| Raíz | 20 |
| Hoja izquierda | 10 |
| Hoja derecha | 30 |

> Todas las hojas quedan al mismo nivel. El árbol cumple todas las propiedades del Árbol B de orden 3.