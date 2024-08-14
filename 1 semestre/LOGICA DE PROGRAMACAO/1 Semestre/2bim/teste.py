Certo, aqui está a tradução do código para o português do Brasil:

```python
import random

# Constantes
TAMANHO_TABULEIRO = 10
NUM_VIDAS = 5

# Navios e seus tamanhos
NAVIOS = {
    "porta-aviões": 5,
    "cruzador": 4,
    "contratorpedeiro": 3,
    "rebocador": 2
}
QUANTIDADE_NAVIOS = {
    "porta-aviões": 1,
    "cruzador": 1,
    "contratorpedeiro": 2,
    "rebocador": 3
}


def criar_tabuleiro():
    """
    Cria um tabuleiro vazio com o tamanho especificado.

    Retorna:
        Uma lista de listas representando o tabuleiro (linhas e colunas).
    """
    return [["~" for _ in range(TAMANHO_TABULEIRO)] for _ in range(TAMANHO_TABULEIRO)]


def verificar_posicao_valida(tabuleiro, tamanho_navio, linha, coluna, orientacao):
    """
    Verifica se a posição escolhida é válida para posicionar um navio.

    Argumentos:
        tabuleiro: A lista de listas representando o tabuleiro.
        tamanho_navio: O tamanho do navio que se quer posicionar.
        linha: A linha escolhida para o navio.
        coluna: A coluna escolhida para o navio.
        orientacao: A orientação do navio ("horizontal", "vertical" ou "diagonal").

    Retorna:
        True se a posição for válida, False caso contrário.
    """
    if orientacao == "horizontal":
        if coluna + tamanho_navio > TAMANHO_TABULEIRO:
            return False
        for i in range(tamanho_navio):
            if tabuleiro[linha][coluna + i] != "~":
                return False
    elif orientacao == "vertical":
        if linha + tamanho_navio > TAMANHO_TABULEIRO:
            return False
        for i in range(tamanho_navio):
            if tabuleiro[linha + i][coluna] != "~":
                return False
    elif orientacao == "diagonal":
        if linha + tamanho_navio > TAMANHO_TABULEIRO or coluna + tamanho_navio > TAMANHO_TABULEIRO:
            return False
        for i in range(tamanho_navio):
            if tabuleiro[linha + i][coluna + i] != "~":
                return False
    return True


def posicionar_navio(tabuleiro, navio, tamanho_navio):
    """
    Posiciona um navio no tabuleiro aleatoriamente com a orientação especificada.

    Argumentos:
        tabuleiro: A lista de listas representando o tabuleiro.
        navio: O nome do navio a ser posicionado.
        tamanho_navio: O tamanho do navio a ser posicionado.

    Retorna:
        True se o navio foi posicionado com sucesso, False caso contrário.
    """
    orientacoes = ["horizontal", "vertical", "diagonal"]
    posicionado = False
    while not posicionado:
        orientacao = random.choice(orientacoes)
        linha = random.randint(0, TAMANHO_TABULEIRO - 1)
        coluna = random.randint(0, TAMANHO_TABULEIRO - 1)
        if verificar_posicao_valida(tabuleiro, tamanho_navio, linha, coluna, orientacao):
            if orientacao == "horizontal":
                for i in range(tamanho_navio):
                    tabuleiro[linha][coluna + i] = "N"  # "N" representa a presença de um navio
            elif orientacao == "vertical":
                for i in range(tamanho_navio):
                    tabuleiro[linha + i][coluna] = "N"
            elif orientacao == "diagonal":
                for i in range(tamanho_navio):
                    tabuleiro[linha + i][coluna + i] = "N"
            posicionado = True
    return True


def inicializar_tabuleiro():
    """
    Cria um tabuleiro e posiciona todos os navios aleatoriamente.

    Retorna:
        A lista de listas representando o tabuleiro com os navios posicionados.
    """
    tabuleiro = criar_