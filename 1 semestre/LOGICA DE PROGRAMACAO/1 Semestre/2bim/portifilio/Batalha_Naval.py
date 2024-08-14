import random as ale


tabuleiro = []

ale_linha = random.randint(9)
for linha in range(10):
    posicao = []
    for coluna in range(10):
        posicao.append('~')

    tabuleiro.append(posicao)
    print(f'linha {linha+1} = {tabuleiro[linha]}\n\n')

print(f'Coluna       0 | 1 |   2 | 3 |  4 | 5 |  6 |  7 |   8 |  9')
for i in range(5):
    print(f'linha {i+1} = {tabuleiro[i]}')