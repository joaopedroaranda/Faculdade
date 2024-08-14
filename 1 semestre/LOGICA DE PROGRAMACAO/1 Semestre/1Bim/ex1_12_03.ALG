Algoritmo "semnome"
Var
nota1, nota2, nota3, peso1, peso2, peso3, result: real


Inicio
escreva("Escreva a nota 1: ")
leia(nota1)
escreva("Escreva a nota 2: ")
leia(nota2)
escreva("Escreva a nota 3: ")
leia(nota3)
escreva("Escreva o peso da nota 1: ")
leia(peso1)
escreva("Escreva o peso da nota 2: ")
leia(peso2)
escreva("Escreva o peso da nota 3: ")
leia(peso3)

result <- (nota1 * peso1)+(nota2 * peso2)+(nota3 * peso3)/ (peso1 + peso2 + peso3)
escreva("Media ficou no valor de: ", result)


Fimalgoritmo