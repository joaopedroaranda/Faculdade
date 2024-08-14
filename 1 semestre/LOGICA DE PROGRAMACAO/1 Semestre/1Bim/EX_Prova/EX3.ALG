Algoritmo "EX3"

Var
peso, pesoGuardado: real
i, idade, idadeGuardado: inteiro

Inicio
pesoGuardado <- 300
idadeGuardado <- 300
para i de 0 ate 3 faca
     escreval("Escreva seu peso")
     leia(peso)
     escreval("Escreva usa idade")
     leia(idade)

     se pesoGuardado > peso entao
         pesoGuardado <- peso
         idadeGuardado <- idade
     senao
     fimse
fimpara
escreva("A pessoa mais magra pesa: ", pesoGuardado, ", e tem ",idadeGuardado, " anos")

Fimalgoritmo