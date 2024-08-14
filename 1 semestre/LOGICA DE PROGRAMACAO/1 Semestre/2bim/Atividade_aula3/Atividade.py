"""Atividade extra Aula 21/05

while ele ficara em loop enquanto o parametro dado for True
"""
def questao4():
    numero_digitado = 0
    numero_guardado = 0
    divisao = 0

    while numero_digitado >= 0: # ele ficara em loop enquanto resultado for True
        divisao += 1

        numero_digitado = int(input('Digite um numero: '))
        numero_guardado = numero_guardado + numero_digitado
        print(f'Soma {numero_guardado}')
        

        
    media_aritimedica = numero_guardado / divisao
    print(f"""Foram digitados {divisao} numeros, e soma dos numeros digitados deu {numero_guardado}
    e o resultado dessa media aritimedica = {media_aritimedica:.2f}""")

def questao5():
    numero = 0
    contador = 0

    while numero >= 0:
        
        
        numero = int(input('Digite um numero: '))
        contador += 1

    contador -= 1
    if contador > 0 and contador <= 25:
        print(f'Quantidade = {contador}')
    elif contador >= 26 and contador <= 50:
        print(f'Quantidade = {contador}')
    elif contador >= 51 and contador <= 75:
        print(f'Quantidade = {contador}')
    elif contador >= 76 and contador <= 100:
        print(f'Quantidade = {contador}')

def questao6():
    print(""" Selecione uma das opçoes:
    1. Média aritmética
    2. Média ponderada
    3. Sair""")
    opcao_selecionada = int(input('Digite a opcao desejada'))

    match opcao_selecionada:
        case 1:
            nota1 = float(input('Digite a nota 1: '))
            nota2 = float(input('Digite a nota 2: '))

            media = (nota1 + nota2)/ 2
            print(f'Media = {media}')
        case 2:
            notas = []
            peso = []
            soma_peso = 0
            calculo = 0
            for resultado in range(0,3):
                nota_do_aluno = float(input(f'Digite a nota{resultado+1}: '))
                notas.append(nota_do_aluno)

                peso_da_nota = int(input(f'Digite o peso da nota {resultado+1}: '))
                peso.append(peso_da_nota)

            for contador in range(0,3):
                soma_peso = soma_peso + peso[contador]

            for contador in range(0,3):
                calculo = calculo + (peso[contador] * notas[contador])
                
            print(f'Media: {calculo}')
             
        case 3:
            print('Saindo...')
        case _:
            print('Opcao invalida')
            
def questao7():

    idade = float('inf')  # Inicializa idade com infinito para garantir que o loop comece
    contador_pessoas = 0
    salario_menor_200 = 0
    soma_salario = 0
    media_salarial = 0
    menor_salario = float('inf')  # Inicializa com infinito para garantir que qualquer salário será menor
    menor_idade = float('inf')  # Inicializa com infinito para garantir que qualquer idade será menor
    maior_idade = 0
    save_idade = None
    save_sexo = None

    while True: 
        if idade == float('inf'):
            print('Iniciando código...\n')

        idade = int(input('Digite sua idade: '))
        if idade < 0:
            print('Finalizando programa.')
            break
        
        sexo = input('Digite seu sexo (M/F): ').upper()
        if sexo not in ['M', 'F']:
            print('Sexo inválido. Finalizando programa.')
            break
        
        salario = float(input('Digite quanto você ganha: '))
        if salario < 0:
            print('Salário inválido. Finalizando programa.')
            break

        contador_pessoas += 1 
        print(f'Dados da pessoa {contador_pessoas} coletados com sucesso!')

        soma_salario += salario
        media_salarial = soma_salario / contador_pessoas

        if maior_idade < idade: 
            maior_idade = idade
        if menor_idade > idade:
            menor_idade = idade

        if sexo == 'F' and salario <= 200:
            salario_menor_200 += 1

        if menor_salario > salario:
            menor_salario = salario
            save_idade = idade
            save_sexo = sexo

    if contador_pessoas >= 1:
        print(f'Média de salário do grupo = {media_salarial}')
        print(f'A menor idade = {menor_idade}\nMaior idade = {maior_idade}')
        print(f'Quantidade de mulheres com salário menor que 200 = {salario_menor_200}')
        print(f'A pessoa com menor salário ({menor_salario}) é do sexo {save_sexo} e tem {save_idade} anos')
    else:
        print('Nenhuma pessoa inserida...')

def questao8():
    lista = []
    contador = 1
    numero = int(input('Digite um numero: '))
    lista.append(numero) # 0
    lista.append(numero) # 1

    print(len(lista))

    while len(lista) <= 100:
        contador += 1
        proximo_numero = lista[contador - 2] + lista[contador - 1]
        lista.append(proximo_numero)
    
    print(lista)
        
def questao9():
    candidatos = []
    contador_pessoas = 0

    while contador_pessoas < 1578:
        idade = input("Digite a idade do candidato (ou 's' para sair): ")
        if idade.lower() == 's':
            print("Saindo do programa...")
            break
        try:
            idade = int(idade)
            if idade <= 0:
                print("Idade inválida. Por favor, insira um número inteiro positivo.")
                continue
        except ValueError:
            print("Valor inválido. Por favor, insira um número inteiro.")
            continue

        sexo = input("Digite o sexo do candidato (M/F): ").upper()
        if sexo not in ['M', 'F']:
            print("Sexo inválido. Por favor, insira 'M' para masculino ou 'F' para feminino.")
            continue
        
        experiencia = input("O candidato tem experiência no serviço? (S/N): ").upper()
        if experiencia not in ['S', 'N']:
            print("Opção inválida. Por favor, insira 'S' para sim ou 'N' para não.")
            continue
        
        candidatos.append((idade, sexo, experiencia))
        contador_pessoas += 1 
        print(f'Pessoa {contador_pessoas}, salvo com sucesso!!!')

    print("Dados dos candidatos coletados com sucesso!")

    num_mulheres = 0
    num_homens = 0
    soma_idade_homens_com_experiencia = 0
    num_homens_com_experiencia = 0
    num_homens_acima_45 = 0
    num_mulheres_abaixo_21_com_experiencia = 0
    menor_idade_mulher_com_experiencia = float('inf')

    for idade, sexo, experiencia in candidatos:
        if sexo == 'F':
            num_mulheres += 1
            if idade < 21 and experiencia == 'S':
                num_mulheres_abaixo_21_com_experiencia += 1
            if experiencia == 'S' and idade < menor_idade_mulher_com_experiencia:
                menor_idade_mulher_com_experiencia = idade
        elif sexo == 'M':
            num_homens += 1
            if experiencia == 'S':
                soma_idade_homens_com_experiencia += idade
                num_homens_com_experiencia += 1
            if idade > 45:
                num_homens_acima_45 += 1

    if num_homens_com_experiencia > 0:
        idade_media_homens_com_experiencia = soma_idade_homens_com_experiencia / num_homens_com_experiencia
    else:
        idade_media_homens_com_experiencia = 0

    if num_homens > 0:
        percent_homens_acima_45 = (num_homens_acima_45 / num_homens) * 100
    else:
        percent_homens_acima_45 = 0

    if menor_idade_mulher_com_experiencia == float('inf'):
        menor_idade_mulher_com_experiencia = None

    print("Número de candidatos do sexo feminino:", num_mulheres)
    print("Número de candidatos do sexo masculino:", num_homens)
    print("Idade média dos homens com experiência no serviço:", idade_media_homens_com_experiencia)
    print("Percentagem dos homens com mais de 45 anos entre o total dos homens:", percent_homens_acima_45, "%")
    print("Número de mulheres com idade inferior a 21 anos e com experiência no serviço:", num_mulheres_abaixo_21_com_experiencia)
    if menor_idade_mulher_com_experiencia is not None:
        print("Menor idade entre as mulheres que já têm experiência no serviço:", menor_idade_mulher_com_experiencia)
    else:
        print("Não há mulheres com experiência no serviço.")




  


# 1.

# 2.

# 3. 

# 4.
#questao4()
# 5.
#questao5()
# 6. 
#questao6()
# 7.  
#questao7()
# 8.
#questao8()
# 9. 
questao9()
# 10.  

# 11. 
 