# TEMA 1 - Errores En Métodos Numéricos
Este tema trata sobre los distintos tipos de errores que pueden ocurrir al realizar cálculos numéricos. Estos errores afectan la precisión de los resultados obtenidos y es importante identificarlos y entender su origen.

## Error Absoluto y Relativo
**Definición:**  
- Error Absoluto: Es la diferencia en valor absoluto entre el valor verdadero y el valor aproximado.  
  Fórmula: EA = |valor_verdadero - valor_aproximado|  
- Error Relativo: Es la razón entre el error absoluto y el valor verdadero.  
  Fórmula: ER = EA / |valor_verdadero|  

**Pseudocódigo:**  
Entradas:
valor_verdadero
valor_aproximado

Proceso:
error_absoluto ← |valor_verdadero - valor_aproximado|
error_relativo ← error_absoluto / |valor_verdadero|

Salidas:
error_absoluto
error_relativo

Fin

makefile
Copiar
Editar

## Error de Redondeo
**Definición:**  
Ocurre cuando se representa un número con un número limitado de cifras significativas, eliminando los decimales sobrantes mediante redondeo.

**Pseudocódigo:**  
Entradas:
numero
cifras_significativas

Proceso:
factor ← 10^(cifras_significativas - 1 - floor(log10(|numero|)))
numero_redondeado ← round(numero * factor) / factor

Salidas:
numero_redondeado

Fin

makefile
Copiar
Editar

## Error de Truncamiento
**Definición:**  
Se produce al aproximar una función infinita (como una serie) utilizando solo una cantidad finita de términos, eliminando los restantes.

**Pseudocódigo:**  
Entradas:
términos[1..n] // Lista de términos de la serie
n_términos // Número de términos a considerar

Proceso:
suma ← 0
para i desde 1 hasta n_términos hacer
suma ← suma + términos[i]
fin para

Salidas:
suma

Fin

makefile
Copiar
Editar

## Propagación del Error
**Definición:**  
Describe cómo los errores individuales en datos de entrada se combinan y afectan el resultado final de una operación matemática.

**Pseudocódigo:**  
Entradas:
datos[1..n] // Valores de entrada
errores[1..n] // Errores absolutos de los datos
operación // Descripción de la operación (ej. suma, resta, multiplicación, división)

Proceso:
si operación es suma o resta entonces
error_resultante ← suma de errores[i] para i=1..n
sino si operación es multiplicación o división entonces
error_relativo_total ← suma de (errores[i]/|datos[i]|) para i=1..n
error_resultante ← |resultado| * error_relativo_total
fin si

Salidas:
error_resultante

Fin

makefile
Copiar
Editar

## Error de Formulación
**Definición:**  
Aparece cuando el modelo matemático no representa de forma precisa el fenómeno real que se intenta resolver. Proviene de simplificaciones o supuestos incorrectos.

**Pseudocódigo:**  
Entradas:
modelo_real // Resultados reales observados
modelo_aproximado // Resultados del modelo matemático

Proceso:
desviación ← modelo_real - modelo_aproximado

Salidas:
desviación

Fin

makefile
Copiar
Editar

## Incertidumbre en los Datos
**Definición:**  
Se refiere a la falta de precisión en la medición o en los valores de entrada, debido a la calidad de los instrumentos o condiciones de observación.

**Pseudocódigo:**  
Entradas:
valor_medido
precision_instrumento

Proceso:
incertidumbre ← ± precision_instrumento

Salidas:
incertidumbre

Fin
