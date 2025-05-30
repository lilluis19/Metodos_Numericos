--------------------------------------------------
TEMA 1 - Errores En Métodos Numéricos
--------------------------------------------------

Este tema trata sobre los distintos tipos de errores que pueden ocurrir al realizar cálculos numéricos. Estos errores afectan la precisión de los resultados obtenidos y es importante identificarlos y entender su origen.

1. Error Absoluto y Relativo

Definición:
- Error Absoluto: Es la diferencia en valor absoluto entre el valor verdadero y el valor aproximado.
  Fórmula: EA = |valor_verdadero - valor_aproximado|

- Error Relativo: Es la razón entre el error absoluto y el valor verdadero.
  Fórmula: ER = EA / |valor_verdadero|

Pseudocódigo:

```
Entradas:
  valor_verdadero
  valor_aproximado

Proceso:
  EA ← |valor_verdadero - valor_aproximado|
  ER ← EA / |valor_verdadero|

Fin
```

------------------------------------------------------------
2. Error de Redondeo

Definición:
- Ocurre cuando se representa un número con un número limitado de cifras significativas, eliminando los decimales sobrantes mediante redondeo.

Pseudocódigo:

```
Entradas:
  número
  cifras_significativas

Proceso:
  Resultado ← redondear(número, cifras_significativas)

Fin
```

------------------------------------------------------------
3. Error de Truncamiento

Definición:
- Se produce al aproximar una función infinita (como una serie) utilizando solo una cantidad finita de términos, eliminando los restantes.

Pseudocódigo:

```
Entradas:
  serie
  n_términos

Proceso:
  Resultado ← suma de los primeros n_términos de la serie

Fin
```

------------------------------------------------------------
4. Propagación del Error

Definición:
- Describe cómo los errores individuales en datos de entrada se combinan y afectan el resultado final de una operación matemática.

Pseudocódigo:

```
Entradas:
  errores en datos de entrada
  operaciones a realizar

Proceso:
  Resultado ← calcular error resultante combinando errores individuales según las operaciones

Fin
```

------------------------------------------------------------
5. Error de Formulación

Definición:
- Aparece cuando el modelo matemático no representa de forma precisa el fenómeno real que se intenta resolver. Proviene de simplificaciones o supuestos incorrectos.

Pseudocódigo:

```
Entradas:
  modelo_real
  modelo_aproximado

Proceso:
  Comparar resultados del modelo_aproximado con datos del modelo_real
  Evaluar desviación o imprecisión

Fin
```

------------------------------------------------------------
6. Incertidumbre en los Datos

Definición:
- Se refiere a la falta de precisión en la medición o en los valores de entrada, debido a la calidad de los instrumentos o condiciones de observación.

Pseudocódigo:

```
Entradas:
  valor_medido
  precisión_instrumento

Proceso:
  Incertidumbre ← ± precisión_instrumento

Fin
```
