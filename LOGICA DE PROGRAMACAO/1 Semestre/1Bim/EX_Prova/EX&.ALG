Algoritmo "EX&"

Var
base, expo, calc, i :inteiro


Inicio
escreva("Escreva a base: ")
leia(base)
escreva("Escreva o expoente: ")
leia(expo)

calc <- base
para i de 1 ate (expo - 1) faca
     calc <- calc * base

fimpara

escreval("Resultado = ", calc)


Fimalgoritmo