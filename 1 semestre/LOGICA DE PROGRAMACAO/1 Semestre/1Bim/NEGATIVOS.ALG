Algoritmo "negativos"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/04/2024
Var
x, num, contador: inteiro


Inicio
escreval("Escreva 5 numeros ")
contador <- 0
para x de 1 ate 5 faca
escreva("numero ", x, " : ")
leia(num)

se num < 0 entao
   contador <- contador + 1
fimse
escreval("Voce escreveu ", x,  "numero(s)")
fimpara
escreval("Existem ", contador , " numeros negativos")
escreva("Existem ", 5 - contador , " numeros positivos")



Fimalgoritmo