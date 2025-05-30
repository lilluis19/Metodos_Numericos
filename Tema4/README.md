-------------------------------------------------
Tema 4 - Diferenciación e Integración Numérica
-------------------------------------------------

En este tema se abordan métodos numéricos utilizados para aproximar derivadas e integrales definidas de funciones. Estas técnicas son útiles cuando no es posible obtener una solución analítica, o cuando se trabaja con datos discretos.

Métodos incluidos:
- Diferenciación Numérica de Tres Puntos
- Diferenciación Numérica de Cinco Puntos
- Método del Trapecio
- Regla de Simpson 1/3
- Cuadratura Gaussiana

--------------------------------------------------
Diferenciación Numérica de Tres Puntos
--------------------------------------------------
Definición:
Aproxima la derivada de una función en un punto usando tres valores conocidos de la función. Se basa en fórmulas de diferencias finitas centradas, adelantadas o atrasadas.

Fórmula centrada:
    f'(x_i) ≈ (f(x_{i+1}) - f(x_{i-1})) / (2h)

Pseudocódigo:

```
Entradas:
    f(x): función
    x: punto donde se evalúa la derivada
    h: paso

Proceso:
    f_prim = (f(x + h) - f(x - h)) / (2 * h)
    retornar f_prim

--------------------------------------------------
Diferenciación Numérica de Cinco Puntos
--------------------------------------------------
Definición:
Método de mayor precisión que usa cinco puntos equidistantes para calcular la derivada de una función, con error de orden O(h^4).

Fórmula centrada:
f'(x_i) ≈ (f(x-2h) - 8f(x-h) + 8f(x+h) - f(x+2h)) / (12h)

Seudocódigo:


Entradas:
    f(x): función
    x: punto donde se evalúa la derivada
    h: paso

Proceso:
    f_prim = (f(x - 2h) - 8*f(x - h) + 8*f(x + h) - f(x + 2h)) / (12 * h)
    retornar f_prim
```
--------------------------------------------------
Método del Trapecio
--------------------------------------------------
Definición:
Aproxima la integral definida de una función mediante la suma de áreas de trapecios. Es un método sencillo con error de orden O(h^2).

Fórmula:
∫a^b f(x) dx ≈ (h/2) * [f(a) + 2f(x₁) + 2f(x₂) + ... + 2*f(x{n−1}) + f(b)]

Pseudocódigo:

```
Entradas:
    f(x): función
    a, b: límites de integración
    n: número de subintervalos

Proceso:
    h = (b - a) / n
    suma = f(a) + f(b)
    Para i = 1 hasta n-1 hacer:
        x_i = a + i * h
        suma = suma + 2 * f(x_i)
    integral = (h / 2) * suma
    retornar integral
```
--------------------------------------------------
Regla de Simpson 1/3
--------------------------------------------------
Definición:
Aproxima la integral definida usando segmentos de parábolas. Requiere que el número de subintervalos sea par. Tiene mayor precisión que el método del trapecio.

Fórmula:
∫_a^b f(x) dx ≈ (h/3) * [f(a) + 4f(x₁) + 2f(x₂) + 4*f(x₃) + ... + f(b)]

Pseudocódigo:

```
Entradas:
    f(x): función
    a, b: límites de integración
    n: número par de subintervalos

Proceso:
    h = (b - a) / n
    suma = f(a) + f(b)
    Para i = 1 hasta n-1 hacer:
        x_i = a + i * h
        Si i es impar entonces:
            suma = suma + 4 * f(x_i)
        Si i es par entonces:
            suma = suma + 2 * f(x_i)
    integral = (h / 3) * suma
    retornar integral
```
--------------------------------------------------
Cuadratura Gaussiana
--------------------------------------------------
Definición:
Método de integración que aproxima la integral mediante una suma ponderada de valores de la función evaluados en puntos específicos (raíces de polinomios ortogonales). Ofrece alta precisión con pocos puntos.

Fórmula general (Gauss-Legendre para n puntos):
∫{-1}^{1} f(x) dx ≈ Σ{i=1}^{n} w_i * f(x_i)

Donde x_i son los puntos de evaluación y w_i los pesos asociados.

Pseudocódigo (para 2 puntos):

```
Entradas:
    f(x): función
    a, b: límites de integración

Proceso:
    x1 = -1/√3
    x2 = 1/√3
    w1 = 1
    w2 = 1

    Transformación del intervalo:
    t1 = ((b - a)/2) * x1 + (a + b)/2
    t2 = ((b - a)/2) * x2 + (a + b)/2

    integral = ((b - a)/2) * (w1 * f(t1) + w2 * f(t2))
    retornar integral
```
