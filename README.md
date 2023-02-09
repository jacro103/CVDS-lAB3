# cvds-lab3

### AeroDescuentos
#### Punto 1:
  * Se debe agregar 5 excepciones en la clase ExcepcionParametrosInvalidos los cuales son:
      1. Si el descuento  del billete no esta con antelación superior a 20 días.
      2. La edad es negativa o es cero.
      3. Edad superir a los 120
      4. Edad entre los 18 a 65 años
      5. Tarifa negativa

#### Punto 2:
| Numero     | Clase de equivalencia (en lenguaje natural o matemático)      | Resultado correcto / incorrecto.    |
| ------------- | ------------- | -------- |
| 1         | edad < 0        | incorrecta  |
| 2          | edad> 120         | incorrecta  |
| 3          | atelacion = 20         | incorrecta  |
| 4          | edad > 18 && edad >120         | correcta  |
| 5          | atelacion >20         | correcta  |
| 6          | atelacion < 20         | incorrecta  |
| 7          | tarifa <0         | incorrecto  |
| 8          | tarifa >0         | correcto  |

