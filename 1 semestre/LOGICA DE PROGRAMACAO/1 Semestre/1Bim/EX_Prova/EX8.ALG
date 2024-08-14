Algoritmo "EX8"

Var
nota1, nota2, media, mediaSoma, mediaSala, contadorSeteMais: real
mediaMaior, mediaMenor: real
i: inteiro


Inicio

mediaSoma <- 0
mediaMaior <- 0
mediaMenor <- 0
contadorSeteMais <- 0

para i de 1 ate 4 faca
escreval("Aluno ", i)
escreva("escreva a nota 1: ")
leia(nota1)
escreva("escreva a nota 2: ")
leia(nota2)

media <- (nota1 + nota2) / 2
mediaSoma <- mediaSoma + media

escreval("Media desse aluno: ", media)

se (i = 1) entao
   mediaMaior <- media
   mediaMenor <- media
senao
     se media > mediaMaior entao
        mediaMaior <- media
        
     senao
          se media < mediaMenor entao
             mediaMenor <- media
             
          fimse
     fimse
fimse

se media >= 7 entao
   contadorSeteMais <- contadorSeteMais + 1
fimse
fimpara

mediaSala <- mediaSoma / 4

escreval("maior media: ",mediaMaior, " do aluno ", alunoMaior)//maior media
escreval("menor media: ",mediaMenor, " do aluno ", alunoMenor)//menor media
escreval("media da sala: ",mediaSala)//media da sala
escreval("quantidade de alunos com media maior ou igual a sete: ",contadorSeteMais)//quantidade de alunos com media maior ou igual a 7



Fimalgoritmo