Algoritmo "EXE5"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 12/03/2024
Var
hora, mim, seg: inteiro


Inicio
ESCREVA("ESCREVA O HORAS ATUAL: ")
LEIA(hora)
ESCREVA("ESCREVA OS MINUTOS ATUAL: ")
LEIA(mim)
mim <- (hora * 60) + mim
ESCREVAL("Horario em minutos", mim ," minutos")
seg <- mim * 60
ESCREVAL("Horaio em segundos",seg ," Segundos")


Fimalgoritmo