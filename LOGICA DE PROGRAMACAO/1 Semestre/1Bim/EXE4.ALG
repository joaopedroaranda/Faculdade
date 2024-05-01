Algoritmo "exe4"

Var
// valor teatral é custo que tiveram pelo espetaculo
valorTeatral, precoConvite: real
quantidadeMinimaConvites: real

Inicio

ESCREVA("QUAL VALOR GASTO DO ESPETACULO? ")
LEIA(valorTeatral)
ESCREVA("VALOR DO INGRESSO: ")
LEIA(precoConvite)

quantidadeMinimaConvites <- (valorTeatral / precoConvite)

Escreva("A quantidade mínima de convites a serem vendidos é: ", int(quantidadeMinimaConvites))
Fimalgoritmo