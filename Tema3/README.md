--------------------------------------------------
Tema 3 - Métodos para Resolver Sistemas de Ecuaciones Lineales
--------------------------------------------------

En este tema se estudian diversos métodos numéricos utilizados para encontrar las soluciones de sistemas de ecuaciones lineales del tipo Ax = b. Estos métodos se clasifican en directos, que buscan una solución exacta en un número finito de pasos, e iterativos, que generan una sucesión de aproximaciones que convergen a la solución.

Métodos incluidos:
- Eliminación Gaussiana
- Método de Gauss-Jordan
- Método de Gauss-Seidel
- Método de Jacobi

--------------------------------------------------
Eliminación Gaussiana
--------------------------------------------------
Definición:
Es un método directo que transforma la matriz del sistema en una matriz triangular superior mediante operaciones elementales sobre las filas. Esto permite resolver el sistema utilizando sustitución regresiva.

Pseudocódigo:

```
Entradas:
    A: matriz de coeficientes (n x n)
    b: vector independiente
    n: número de ecuaciones

Proceso:
    Para k = 1 hasta n-1 hacer:
        Para i = k+1 hasta n hacer:
            factor = A[i,k] / A[k,k]
            Para j = k hasta n hacer:
                A[i,j] = A[i,j] - factor * A[k,j]
            b[i] = b[i] - factor * b[k]

    Resolver el sistema triangular superior:
    x[n] = b[n] / A[n,n]
    Para i = n-1 hasta 1 hacer:
        suma = 0
        Para j = i+1 hasta n hacer:
            suma = suma + A[i,j] * x[j]
        x[i] = (b[i] - suma) / A[i,i]
```
--------------------------------------------------
Método de Gauss-Jordan
--------------------------------------------------
Definición:
Es una extensión de la eliminación Gaussiana que lleva la matriz aumentada [A|b] a su forma reducida por filas (matriz identidad en el lado de los coeficientes), obteniendo la solución directamente sin necesidad de sustitución.

Pseudocódigo:


```
Entradas:
    A: matriz aumentada (n x (n+1))

Proceso:
    Para k = 1 hasta n hacer:
        Dividir la fila k por A[k,k]
        Para i = 1 hasta n hacer:
            Si i ≠ k entonces:
                factor = A[i,k]
                Para j = k hasta n+1 hacer:
                    A[i,j] = A[i,j] - factor * A[k,j]
```
--------------------------------------------------
Método de Gauss-Seidel
--------------------------------------------------
Definición:
Método iterativo que mejora progresivamente la solución usando los valores más recientes disponibles. Es eficiente para sistemas grandes y dispersos, y puede converger más rápido que Jacobi.

Pseudocódigo:

```
Entradas:
    A: matriz de coeficientes (n x n)
    b: vector independiente
    x^(0): vector inicial
    tol: tolerancia
    n: número máximo de iteraciones

Proceso:
    k ← 0
    Repetir hasta alcanzar la tolerancia o n iteraciones:
        Para i = 1 hasta n hacer:
            suma1 ← 0
            Para j = 1 hasta i-1 hacer:
                suma1 ← suma1 + A[i,j] * x^(k+1)[j]
            suma2 ← 0
            Para j = i+1 hasta n hacer:
                suma2 ← suma2 + A[i,j] * x^(k)[j]
            x^(k+1)[i] = (b[i] - suma1 - suma2) / A[i,i]
        k ← k + 1
```

--------------------------------------------------
Método de Jacobi
--------------------------------------------------
Definición:
Método iterativo que calcula una nueva aproximación de la solución utilizando únicamente los valores de la iteración anterior. Es simple de implementar y fácil de paralelizar, aunque su convergencia suele ser más lenta.

Pseudocódigo:

```
Entradas:
    A: matriz de coeficientes (n x n)
    b: vector independiente
    x^(0): vector inicial
    tol: tolerancia
    n: número máximo de iteraciones

Proceso:
    k ← 0
    Repetir hasta alcanzar la tolerancia o n iteraciones:
        Para i = 1 hasta n hacer:
            suma ← 0
            Para j = 1 hasta n hacer:
                Si j ≠ i entonces:
                    suma ← suma + A[i,j] * x^(k)[j]
            x^(k+1)[i] = (b[i] - suma) / A[i,i]
        k ← k + 1
```
