--------------------------------------------------
Tema 5 - Interpolación y Ajuste de Funciones
--------------------------------------------------

Este tema abarca métodos numéricos utilizados para aproximar funciones a partir de un conjunto de datos. La interpolación busca construir una función que pase exactamente por los puntos dados, mientras que el ajuste (o regresión) encuentra una función que modele los datos lo mejor posible en un sentido promedio.

Métodos incluidos:
- Interpolación de Lagrange
- Interpolación de Newton
- Interpolación Polinomial Simple
- Regresión Lineal
- Regresión por Mínimos Cuadrados

--------------------------------------------------
Interpolación de Lagrange
--------------------------------------------------
Definición:
Construye un polinomio que pasa por todos los puntos dados utilizando una combinación de polinomios base que anulan todos los puntos excepto uno.

Fórmula:
    P(x) = Σ_{i=0}^{n} y_i * L_i(x)
    donde L_i(x) = Π_{j=0, j≠i}^{n} (x - x_j) / (x_i - x_j)

Pseudocódigo:

```
Entradas:
    x[]: arreglo de n+1 puntos x_i
    y[]: arreglo de n+1 puntos y_i
    x_eval: valor a interpolar

Proceso:
    P = 0
    Para i = 0 hasta n hacer:
        L = 1
        Para j = 0 hasta n hacer:
            Si j ≠ i entonces:
                L = L * (x_eval - x[j]) / (x[i] - x[j])
        P = P + y[i] * L
    retornar P
```
--------------------------------------------------
Interpolación de Newton
--------------------------------------------------
Definición:
Utiliza diferencias divididas para construir un polinomio interpolante de forma incremental. Es eficiente cuando se agregan nuevos puntos.

Fórmula:
P(x) = f[x₀] + f[x₀,x₁](x - x₀) + f[x₀,x₁,x₂](x - x₀)(x - x₁) + ...

PSeudocódigo:

```
Entradas:
    x[]: arreglo de n+1 puntos x_i
    y[]: arreglo de n+1 puntos y_i
    x_eval: valor a interpolar

Proceso:
    Construir tabla de diferencias divididas dd[n+1][n+1]
    Para i = 0 hasta n hacer:
        dd[i][0] = y[i]
    Para j = 1 hasta n hacer:
        Para i = 0 hasta n-j hacer:
            dd[i][j] = (dd[i+1][j-1] - dd[i][j-1]) / (x[i+j] - x[i])

    P = dd[0][0]
    producto = 1
    Para i = 1 hasta n hacer:
        producto = producto * (x_eval - x[i-1])
        P = P + dd[0][i] * producto
    retornar P
```
--------------------------------------------------
Interpolación Polinomial Simple
--------------------------------------------------
Definición:
Ajusta un polinomio de grado n que pasa exactamente por n+1 puntos usando un sistema de ecuaciones lineales.

Pseudocódigo:

```
Entradas:
    x[]: arreglo de n+1 puntos x_i
    y[]: arreglo de n+1 puntos y_i

Proceso:
    Construir matriz A de tamaño (n+1)x(n+1):
        A[i][j] = x[i]^j
    Resolver el sistema A * coef = y usando eliminación Gaussiana
    retornar coef[] (coeficientes del polinomio)
```
--------------------------------------------------
Regresión Lineal
--------------------------------------------------
Definición:
Ajusta una recta y = a + bx que minimiza el error cuadrático entre los valores reales y los valores estimados por la recta.

Fórmulas:
b = (nΣxy - ΣxΣy) / (nΣx² - (Σx)²)
a = (Σy - bΣx) / n

Pseudocódigo:

```
Entradas:
    x[]: arreglo de n puntos
    y[]: arreglo de n puntos

Proceso:
    Sx = Sy = Sxy = Sxx = 0
    Para i = 0 hasta n-1 hacer:
        Sx = Sx + x[i]
        Sy = Sy + y[i]
        Sxy = Sxy + x[i]*y[i]
        Sxx = Sxx + x[i]*x[i]
    b = (n*Sxy - Sx*Sy) / (n*Sxx - Sx^2)
    a = (Sy - b*Sx) / n
    retornar a, b
```
--------------------------------------------------
Regresión por Mínimos Cuadrados
--------------------------------------------------
Definición:
Ajusta una función (puede ser polinómica, exponencial, etc.) que minimiza la suma de los cuadrados del error. La forma más común es para polinomios de grado m.

Pseudocódigo para regresión polinómica:

```
Entradas:
    x[]: arreglo de n puntos
    y[]: arreglo de n puntos
    m: grado del polinomio

Proceso:
    Construir matriz normal A (m+1 x m+1) y vector B (m+1)
    Para i = 0 hasta m hacer:
        Para j = 0 hasta m hacer:
            A[i][j] = Σ x[k]^(i+j) para k = 0 hasta n-1
        B[i] = Σ y[k] * x[k]^i para k = 0 hasta n-1

    Resolver el sistema A * coef = B usando eliminación Gaussiana
    retornar coef[] (coeficientes del polinomio de ajuste)
```
