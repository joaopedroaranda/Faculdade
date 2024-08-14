"""
Matriz
"""
# #            COLUNA
# matriz = [[0,1,2,3,4,5,6,7,8,9], #LINHA 0
#           [0,1,2,3,4,5,6,7,8,9]] #LINHA 1

# #       [linha][coluna]
# print(matriz[1][0])

lista = []

for linha in range(5):
    lista_de_lista = []

    for coluna in range(5):
        lista_de_lista.append(input(f'Digite o numero da linha: {linha} coluna: {coluna} = '))

    lista.append(lista_de_lista)
    print(f'linha {linha+1} = {lista[linha]}\n\n')

print(f'Coluna       0  |   1   |  2  |   3   |  4')
for i in range(5):
    print(f'linha {i+1} = {lista[i]}')