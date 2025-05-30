--------------------------------------------------
Tema 2 - Métodos para Resolver Ecuaciones
--------------------------------------------------

En este tema se estudian diferentes métodos numéricos utilizados para encontrar soluciones aproximadas de ecuaciones no lineales. Estos métodos permiten hallar raíces de funciones f(x) = 0 aplicando iteraciones sucesivas.

Métodos incluidos:
- Método de Intervalo
- Método de Bisección
- Método del Punto Fijo (Iteración Simple)
- Método de Newton-Raphson
- Método de la Secante

--------------------------------------------------
Método de Intervalo
--------------------------------------------------
Definición:
Es una técnica que busca un intervalo [a, b] donde la función cambie de signo, es decir, f(a)*f(b) < 0. A partir de dicho intervalo se aplican métodos como bisección.

--------------------------------------------------
Método de Bisección
--------------------------------------------------
Definición:
Consiste en dividir el intervalo [a, b] en mitades sucesivas y elegir el subintervalo donde cambia el signo de la función. Tiene convergencia garantizada pero lenta.

Pseudocódigo:


```
Entradas:
    f(x): función continua
    a, b: extremos del intervalo tal que f(a) * f(b) < 0
    tol: tolerancia
    n: número máximo de iteraciones

Proceso:
    i ← 0
    Mientras i < n hacer:
        c ← (a + b) / 2
        Si f(c) = 0 o |b - a| / 2 < tol entonces
            retornar c
        Fin Si
        Si f(a) * f(c) < 0 entonces
            b ← c
        Sino
            a ← c
        Fin Si
        i ← i + 1
    Fin Mientras
```
--------------------------------------------------
Método del Punto Fijo (Iteración Simple)
--------------------------------------------------
Definición:
Transforma f(x) = 0 en x = g(x) y se itera como x_{n+1} = g(x_n). Se necesita que g sea contractiva.

Pseudocódigo:

```
Entradas:
    g(x): función transformada
    x0: valor inicial
    tol: tolerancia
    n: número máximo de iteraciones

Proceso:
    i ← 0
    Mientras i < n hacer:
        x1 ← g(x0)
        Si |x1 - x0| < tol entonces
            retornar x1
        Fin Si
        x0 ← x1
        i ← i + 1
    Fin Mientras
```
--------------------------------------------------
Método de Newton-Raphson
--------------------------------------------------
Definición:
Método iterativo que usa derivadas. Tiene convergencia rápida si la estimación inicial está cerca de la raíz y f'(x) ≠ 0.

Fórmula:
    x_{n+1} = x_n - f(x_n) / f'(x_n)

Pseudocódigo:

```
Entradas:
    f(x): función
    f'(x): derivada de f
    x0: valor inicial
    tol: tolerancia
    n: número máximo de iteraciones

Proceso:
    i ← 0
    Mientras i < n hacer:
        x1 ← x0 - f(x0) / f'(x0)
        Si |x1 - x0| < tol entonces
            retornar x1
        Fin Si
        x0 ← x1
        i ← i + 1
    Fin Mientras
```
--------------------------------------------------
Método de la Secante
--------------------------------------------------
Definición:
Aproxima la derivada mediante una diferencia dividida. No requiere conocer f'(x), pero usa dos valores iniciales.

Fórmula:
    x_{n+1} = x_n - f(x_n) * (x_n - x_{n-1}) / (f(x_n) - f(x_{n-1}))

Pseudocódigo:

```
Entradas:
    f(x): función
    x0, x1: valores iniciales
    tol: tolerancia
    n: número máximo de iteraciones

Proceso:
    i ← 0
    Mientras i < n hacer:
        x2 ← x1 - f(x1) * (x1 - x0) / (f(x1) - f(x0))
        Si |x2 - x1| < tol entonces
            retornar x2
        Fin Si
        x0 ← x1
        x1 ← x2
        i ← i + 1
    Fin Mientras
```
