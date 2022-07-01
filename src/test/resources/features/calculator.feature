#language: es

@testComplete
Característica: Calculadora
  Yo, como usuario
  Quiero, tener una calculadora

  @test1
  Escenario: Suma
    Dado que me encuentro en la pagina de Testsheepnz
    Y pongo el primer numero 1 y el segundo numero 2
    Y al seleccionar la operacion "Add"
    Cuando le doy a Calculate
    Entonces deberia salirme 3

  @test2
  Escenario: Resta
    Dado que me encuentro en la pagina de Testsheepnz
    Y pongo el primer numero 5 y el segundo numero 2
    Y al seleccionar la operacion "Subtract"
    Cuando le doy a Calculate
    Entonces deberia salirme 3

  @test3
  Escenario: Multiplicacion
    Dado que me encuentro en la pagina de Testsheepnz
    Y pongo el primer numero 5 y el segundo numero 2
    Y al seleccionar la operacion "Multiply"
    Cuando le doy a Calculate
    Entonces deberia salirme 10

  @test3
  Escenario: Multiplicacion
    Dado que me encuentro en la pagina de Testsheepnz
    Y pongo el primer numero 6 y el segundo numero 2
    Y al seleccionar la operacion "Divide"
    Cuando le doy a Calculate
    Entonces deberia salirme 3

  @test3
  Escenario: Multiplicacion
    Dado que me encuentro en la pagina de Testsheepnz
    Y pongo el primer numero 6 y el segundo numero 2
    Y al seleccionar la operacion "Concatenate"
    Cuando le doy a Calculate
    Entonces deberia salirme 62