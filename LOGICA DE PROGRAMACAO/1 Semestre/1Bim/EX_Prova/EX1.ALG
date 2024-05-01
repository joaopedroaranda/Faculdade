Algoritmo "ex1"

Var
i,contadorPar, contadorimpar, numeroSelecionado: inteiro

Inicio

contadorPar <- 0
contadorimpar <- 0

para i de 0 ate 1345 faca
     escreva("escreva um numero: ")
     leia(numeroSelecionado)
     se numeroSelecionado % 2 = 0 entao
        escreval("O numero ",numeroSelecionado, " é par")
        contadorPar <- contadorPar + 1
     senao
          escreval("O numero ",numeroSelecionado, " é impar")
          contadorimpar <- contadorimpar + 1
     fimse
fimpara
escreva("Existem ", contadorPar, "Numeros pares")
escreva("Existem ", contadorImapr, "Numeros impares")
Fimalgoritmo