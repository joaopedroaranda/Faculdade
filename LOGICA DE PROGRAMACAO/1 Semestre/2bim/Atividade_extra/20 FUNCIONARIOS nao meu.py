cont_1 = 0
cont_2 = 0
cont_3 = 0

for f in range(20):
    sal_base = float (input ("Digite o salario base: "))
    idade = int (input ("Digite a idade: "))
    tempo = float (input ("Digite o tempo de serviço: "))
    filhos = int (input("Quantidade de filhos: "))
   
    if tempo > 5:
        bonus_tempo = (tempo - 5) * 0.03 * sal_base   
    else:
        bonus_tempo = 0.005 * sal_base * tempo

    if filhos > 2:
        bonus_filho = 0.02 * sal_base
    else: 
        bonus_filho = 0
        
    if idade > 30:
        bonus_idade = (idade/1000) * sal_base
    else:
        bonus_idade = sal_base * 0.001
    
    
    sal_final = sal_base + bonus_tempo + bonus_filho + bonus_idade
    
    
    
    print("Salario base: R$ ", sal_base)
    print("Bonus por tempo de serviço prestado: R$ ",bonus_tempo)
    print ("Bonus por filho é: R$ ", bonus_filho)
    print ("Bonus por idade é: R$ ", bonus_idade)
    print ("Slario final é R$ ", sal_final)
    cont_1 = cont_1 + bonus_tempo
    cont_2 = cont_2 + bonus_filho
    cont_3 = cont_3 + bonus_idade
    
    
    if f == 0:
        idade_idoso = idade
        sal_idoso = sal_final
            
    elif idade > idade_idoso:
            idade_idoso = idade 
            sal_idoso = sal_final
        
print ("Valor total pago em bônus por tempo de serviço prestado, somando todos os funcionários ", cont_1)
print ("Valor total pago em bônus por quantidade de dependentes, somando todos os funcionários ", cont_2)
print ("Valor total pago em bônus por idade, somando todos os funcionários ", cont_3)
print ("Salário a receber do funcionário da pessoa mais idosa: R$ ", sal_idoso, ", Idade: ", idade_idoso)

