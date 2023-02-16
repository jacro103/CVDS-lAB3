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
#### Punto 3:
 * LOs diferentes casos que se pueden presentar son:
   1. su edad es negativa, sus dias son menores de 20 dias para el descuento y una tarifa   de 1500000, por lo tanto su salida es oncorrecta
   2. Su edad es mas de 120 , sus dias son mayores de 20 dias cumplen con el descuento y una tarifa de 1200000, por lo tanto sale una salida incorrecta
   3. Su edad es 45, sus dias esta en un estado negativo para el descuento y una tarifa de 1400000, por lo tanto sale una salida incorrecta 
   4. Su edad es 40, sus dias cumplen ayores a de 20 dias con  el descuento y una tarifa de -1600000, por lo tanto sale una salida incorrecta
   5.  su edad es de 17, sus dias son menores de 20 dias y una tarifa   de 1500000, por lo tanto es una salida correcta
   6.  su edad es de 25, sus dias son menores para el descuento y una tarifa   de 1000000, por lo tanto es una salida correcta
   7.  su edad es de 5, sus dias son menores de 20 dias para el descuento y una tarifa   de 900000, por lo tanto es una salida correcta
   8.  su edad es de 50, sus dias son mayores de 20 dias para el descuento y una tarifa   de 800000, por lo tanto es una salida correcta
   9.  su edad es de 67, sus dias son menores de 20 dias para el descuento y una tarifa   de 960000, por lo tanto es una salida correcta
   10.  su edad es de 70, sus dias son mayores a de 20 dias para el descuento y una tarifa   de 2500000, por lo tanto es una salida correcta


#### Punto 4:
 * Las fronteras son:
   1. tarifa mayor a 0 , dias entre 0 y 20 , edad entre 0 a 18 años  descuento de 5%
   2. tarifa mayor a 0 , dias mayores a 20 , edad entre 0 a 18 años  descuento de 20%
   3. tarifa mayor a 0 , dias entre 0 y 20 , edad entre 18 a 65 años  descuento de 23%
   4. tarifa mayor a 0 , dias mayores a 20 , edad entre 18 a 65 años  descuento de 15%
   5. tarifa mayor a 0 , dias entre 0 y 20 , edad mayor a 65 años  descuento de 8%
   6. tarifa mayor a 0 , dias mayores a 20 ,edad mayor a 65 años  descuento de 23%

#### Punto 5:

| entrada     | tarifa| dias | edad | salida|
| ------------- | ------------- | -------- |  ------------- | -------- |
| 1   | 1000000| 2 | 1 | 950000|
| 2   | 1000000| 21 | 14 | 800000|
| 3   | 1000000| 19 | 29 | 770000|
| 4   | 1000000| 22 | 40 | 850000|
| 5   | 1000000| 15 | 67 | 930000|
| 6   | 1000000| 25 | 67 | 770000|


