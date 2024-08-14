Algoritmo "Energia "

Var
gastoEnergia, calc, valorComDesconto: real

Inicio
escreva("Quanto voce gastou esse mes de energia: ")
leia(gastoEnergia)

se (gastoEnergia <= 30) entao
   calc <- (gastoEnergia *  0.22366)
   escreva("Seu gasto esse mes foi de: $", calc )
   
senao
     calc <- (gastoEnergia * 0.38342)
     se (calc >= 100.0) entao
         valorComDesconto <- ( calc - (calc * 0.04))
         escreva("Seu gasto esse mes foi de: $", calc ,".Esse valor esta com desconto" )
         
     senao
          escreva("Seu gasto esse mes foi de: $", calc )
     fimse
fimse


Fimalgoritmo