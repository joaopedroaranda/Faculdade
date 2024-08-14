"""
Variavel multidimensional
"""

# Var Unidimensional

# uni_x = [1,34,55,-23,922]
# Criando do zero essa lista unidimensional

import os
def clear():
    os.system('cls')

uni_x = [] # Lista
def quandando_numero():
    clear()
    try:
        for i in range(3):
            uni_x.append(float(input('Add a number in list: ')))
            print(uni_x) 
        
        for mostrar_numero in range(len(uni_x)):
            print(f'O numero {uni_x[mostrar_numero]} esta guardado na posição {mostrar_numero}')

    except ValueError:
        print('Erro de digitação')

quandando_numero()

def main():
    quandando_numero()

if __name__ == '__main__':
    main()