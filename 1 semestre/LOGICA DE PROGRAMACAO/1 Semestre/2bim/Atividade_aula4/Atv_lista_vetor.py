import os
from time import sleep

def clear():
    os.system('cls')

def select_question():
    pass

def quest1():
    qtd_de_number_pares = 0
    qtd_de_number_impares = 0
    
    save_pares = []
    save_impares = []
    uni_x = []

    try:
        for i in range(6):
            uni_x.append(float(input('Add a number in list: ')))
            print(uni_x)
        # quantidade de pares e impares
        for num in range(len(uni_x)):

            if (uni_x[num] % 2) == 0:
                save_pares.append(uni_x[num])
                qtd_de_number_pares += 1
            else:
                save_impares.append(uni_x[num])
                qtd_de_number_impares += 1
            
            clear()

            print(f'Quantidade de numeros pares: {qtd_de_number_pares}')
            print(f'lista de numeros pares: {save_pares}')
            print(f'Quantidade de numeros impares: {qtd_de_number_impares}')
            print(f'lista de numeros impares: {save_impares}')
    except ValueError:
        print('Erro de digitação')
        print('reiniciando quest...')
        sleep(3)
        main()


def main():
    clear()
    quest1()

if __name__ == '__main__':
    main()