Algoritmo "exercicio2"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 09/04/2024
Var
ini, fim, i, a: inteiro


Inicio
escreva("Digite o inicio: ")
leia(ini)
escreva("Digite o fim: ")
leia(fim)

se (ini > fim) entao
    a <- fim // a = 2 <- fim = 2
    fim <- ini // fim 10 <- ini = 10
    ini <- a  // ini 2 <- a = 2
fimse
para i de ini ate fim faca
         escreval("Eu repeti: ", i, "x")
    fimpara

Fimalgoritmo