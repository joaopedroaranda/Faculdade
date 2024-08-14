import os

def finalizar():
    print('\nEncerrado atividade...')
def sair():
    input('\nDigite algo para voltar ao menu  ')
    main()
def opcao_invalida():
    os.system('cls')
    print('Opção invalida...')
    os.system('cls')
    main()
def menu():
    for atividade in range(1,7):
        print(f'{atividade}. Atividade {atividade}')
    print(f'7.Sair')
def voltar():
    input('Aperte ENTER para voltar...')
    os.system('cls')
    main()
def opcao_selecionada():
    atividade_selecionada = int(input('Opçao selecionada: '))
    try:
        match atividade_selecionada:
            case 1:
                atividade1()
            case 2:
                atividade2()
            case 3:
                atividade3()
            case 4:
                atividade4()
            case 5:
                atividade5()
            case 6:
                atividade6()
            case 7:
                finalizar()
    except:
        opcao_invalida()

def atividade1():
    def zerar():
        os.system('cls')
        print('Vamos la...\n')
        atividade1()

    nota_total = 0
    peso_total = 0

    nomo_do_aluno = input('Qual nome do aluno: ')
    notas = []
    pesos = []
    for prova in range(0,3):
        print(f'\nProva {prova+1}')
        nota = float(input('Digote o valor da nota: '))
        peso = int(input('Digite o valor do peso dessa nota: '))

        if (nota <= 0 or nota > 10 ):
            input('\nValor invalido, aperte ENTER para reiniciar')
            zerar()

        notas.append(nota)
        pesos.append(peso)
        peso_total = peso_total + peso
        nota_total = nota_total + (notas[prova] * pesos[prova])

    calculo_media = nota_total / peso_total

    print(f'A media do {nomo_do_aluno} foi {calculo_media:.2f}')

    voltar()

def atividade2():
    ano_nascimento = int(input('Digite o ano de nascimento: '))

    idade = 2024 - ano_nascimento
    idade_em_2050 = 2050 - ano_nascimento

    print(f'Sua idade atual: {idade} \nEm 2050 terá: {idade_em_2050}')

    voltar()

def atividade3():

    horas_trabalhadas = int(input('Digite o valor de horas trabalhadas no mes: '))
    salario_minimo = float(input('Digite o valor do seu salario: '))

    salario_bruto = horas_trabalhadas * (salario_minimo / 5) #hora trabalhada
    salario_a_receber = salario_bruto - (salario_bruto * 0.03) #imposto

    print(f'O salario a receber é {salario_a_receber}')

    voltar()

def atividade4():
    valor_espetaculo = float(input('Digite o valor do espetaculo: '))
    valor_ingresso =  float(input('Digite o valor do ingresso do espetaculo: '))

    qtd_ingresso_minima = valor_espetaculo / valor_ingresso

    print(f'A quantidade minima de ingresso {qtd_ingresso_minima}')

    voltar()

def atividade5():
    min = 0

    hora = int(input('Digite uma hora'))
    min = int(input('Digite o valor minutos: '))

    conv_min = (hora * 60 ) + min
    conv_seg = conv_min * 60

    print(f'Convertido em minutos: {conv_min}, e valor convertido em segundos: {conv_seg}')

    voltar()

def atividade6():
    numero_tabuada = int(input('Digite o numero que quer a tabuada: '))

    for tabuada in range(0,11):
        print(f'{numero_tabuada} x {tabuada} = {numero_tabuada * tabuada}')

    voltar()

def main():
    os.system('cls')
    menu()
    opcao_selecionada()

if __name__ == '__main__':
    main()