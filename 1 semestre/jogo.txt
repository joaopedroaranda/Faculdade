import random

# Constantes
GRID_SIZE = 10
NUM_LIVES = 5

# Navios com seus tamanhos
SHIPS = {
    "porta-aviões": 5,
    "cruzador": 4,
    "contratorpedeiro": 3,
    "rebocador": 2
}
SHIP_COUNT = {
    "porta-aviões": 1,
    "cruzador": 1,
    "contratorpedeiro": 2,
    "rebocador": 3
}

def create_board():
    return [["~" for _ in range(GRID_SIZE)] for _ in range(GRID_SIZE)]

def is_valid_position(board, ship_size, row, col, orientation):
    if orientation == "horizontal":
        if col + ship_size > GRID_SIZE:
            return False
        for i in range(ship_size):
            if board[row][col + i] != "~":
                return False
    elif orientation == "vertical":
        if row + ship_size > GRID_SIZE:
            return False
        for i in range(ship_size):
            if board[row + i][col] != "~":
                return False
    elif orientation == "diagonal":
        if row + ship_size > GRID_SIZE or col + ship_size > GRID_SIZE:
            return False
        for i in range(ship_size):
            if board[row + i][col + i] != "~":
                return False
    return True

def place_ship(board, ship_size):
    orientations = ["horizontal", "vertical", "diagonal"]
    placed = False
    while not placed:
        orientation = random.choice(orientations)
        row = random.randint(0, GRID_SIZE - 1)
        col = random.randint(0, GRID_SIZE - 1)
        if is_valid_position(board, ship_size, row, col, orientation):
            if orientation == "horizontal":
                for i in range(ship_size):
                    board[row][col + i] = "S"
            elif orientation == "vertical":
                for i in range(ship_size):
                    board[row + i][col] = "S"
            elif orientation == "diagonal":
                for i in range(ship_size):
                    board[row + i][col + i] = "S"
            placed = True

def initialize_board():
    board = create_board()
    for ship, count in SHIP_COUNT.items():
        for _ in range(count):
            place_ship(board, SHIPS[ship])
    return board

def print_board(board):
    print("  " + " ".join(str(i) for i in range(GRID_SIZE)))
    for idx, row in enumerate(board):
        print(str(idx) + " " + " ".join(row))

def play_game():
    player_board = create_board()
    hidden_board = initialize_board()
    lives = NUM_LIVES
    
    while lives > 0:
        print_board(player_board)
        try:
            row = int(input("Digite a linha (0-9): "))
            col = int(input("Digite a coluna (0-9): "))
        except ValueError:
            print("Entrada inválida. Tente novamente.")
            continue
        
        if row < 0 or row >= GRID_SIZE or col < 0 or col >= GRID_SIZE:
            print("Posição fora do tabuleiro. Tente novamente.")
            continue
        
        if hidden_board[row][col] == "S":
            print("Acertou um navio!\n\n")
            player_board[row][col] = "X"
            hidden_board[row][col] = "~"
        else:
            print("Água!\n\n")
            player_board[row][col] = "O"
            lives -= 1
            print(f"Vidas restantes: {lives}")
        
        if all(cell != "S" for row in hidden_board for cell in row):
            print("Parabéns! Você destruiu todos os navios!")
            break
    
    if lives == 0:
        print("Game Over! Suas vidas acabaram.")
    
    print("Tabuleiro final:")
    print_board(player_board)

if __name__ == "__main__":
    play_game()
