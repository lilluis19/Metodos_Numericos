--------------------------------------------------
Tema 6 - Solución de Ecuaciones Diferenciales
--------------------------------------------------

Este tema abarca métodos numéricos para aproximar soluciones de ecuaciones diferenciales ordinarias (EDO). Estas técnicas permiten obtener soluciones aproximadas cuando no es posible resolver la EDO de forma analítica.

Métodos incluidos:
- Método de Euler (Sistema EDO)
- Método de Taylor
- Método de un Paso
- Método de Paso Múltiple
- Método de Runge-Kutta (Sistema EDO)

--------------------------------------------------
Método de Euler (Sistema EDO)
--------------------------------------------------
Definición:
Es el método más simple para resolver EDO. Se basa en la aproximación lineal de la solución a partir del valor inicial. Puede extenderse a sistemas de ecuaciones diferenciales.

Pseudocódigo:

```
Entradas:
    f(t, y): función derivada
    t0, y0: condición inicial
    h: tamaño de paso
    n: número de pasos

Proceso:
    t = t0
    y = y0
    Para i = 1 hasta n hacer:
        y = y + h * f(t, y)
        t = t + h
        imprimir t, y
```
--------------------------------------------------
Método de Taylor
--------------------------------------------------
Definición:
Utiliza una expansión en serie de Taylor para obtener una mejor aproximación en cada paso. Requiere derivadas sucesivas de f(t, y).

Pseudocódigo (orden 2):

```
Entradas:
    f(t, y): función derivada
    f'(t, y): derivada de f respecto a t
    t0, y0: condición inicial
    h: tamaño de paso
    n: número de pasos

Proceso:
    t = t0
    y = y0
    Para i = 1 hasta n hacer:
        y = y + h * f(t, y) + (h^2 / 2) * f'(t, y)
        t = t + h
        imprimir t, y
```
--------------------------------------------------
Método de un Paso
--------------------------------------------------
Definición:
Métodos como Euler o Runge-Kutta que calculan la solución en el siguiente paso usando sólo el valor del paso actual. No requieren valores anteriores.

```
Entradas:
    f(t, y): función derivada
    t0, y0: condición inicial
    h: tamaño de paso
    n: número de pasos

Proceso:
    t = t0
    y = y0
    Para i = 1 hasta n hacer:
        y = y + h * f(t, y)
        t = t + h
        imprimir t, y
```
--------------------------------------------------
Método de Paso Múltiple
--------------------------------------------------
Definición:
Utiliza varios valores anteriores para calcular el siguiente. Ejemplos: métodos de Adams-Bashforth y Adams-Moulton.

Pseudocódigo (Adams-Bashforth de 2 pasos):

```
Copiar
Edita
Entradas:
    f(t, y): función derivada
    t0, y0, y1: dos primeros valores
    h: tamaño de paso
    n: número de pasos (a partir de y1)

Proceso:
    t[0] = t0
    t[1] = t0 + h
    Para i = 2 hasta n hacer:
        t[i] = t[i-1] + h
        y[i] = y[i-1] + h * (3*f(t[i-1], y[i-1]) - f(t[i-2], y[i-2])) / 2
        imprimir t[i], y[i]
```
--------------------------------------------------
Método de Runge-Kutta (Sistema EDO)
--------------------------------------------------
Definición:
Método de un paso de orden superior que no requiere derivadas adicionales. El más común es el de orden 4. Se puede aplicar a sistemas de EDO.

Pseudocódigo (RK4 para sistemas):

```
Entradas:
    f(t, y): función derivada
    t0, y0: condición inicial
    h: tamaño de paso
    n: número de pasos

Proceso:
    t = t0
    y = y0
    Para i = 1 hasta n hacer:
        k1 = h * f(t, y)
        k2 = h * f(t + h/2, y + k1/2)
        k3 = h * f(t + h/2, y + k2/2)
        k4 = h * f(t + h, y + k3)
        y = y + (k1 + 2*k2 + 2*k3 + k4)/6
        t = t + h
        imprimir t, y
```
