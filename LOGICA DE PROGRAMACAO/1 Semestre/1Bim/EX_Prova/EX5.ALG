Algoritmo "EX5"

Var
i, contP, contN, contZ, num: inteiro

Inicio
contP <- 0
contN <- 0
contZ <- 0

para i de 0 ate 10 faca
     escreva("Escreva um numero: ")
     leia(num)
     
     se num < 0 entao
        contN <- contN + 1
        
     senao
          se num > 0 entao
             contP <- contP + 1
          senao
               contZ <- contZ + 1
          fimse
     fimse
fimpara

escreval("Tivemos ", contP," numero POSITIVOS")
escreval("Tivemos ", contN," numero NEGATIVOS")
escreval("Tivemos ", contZ," numeros ZEROS")
Fimalgoritmo