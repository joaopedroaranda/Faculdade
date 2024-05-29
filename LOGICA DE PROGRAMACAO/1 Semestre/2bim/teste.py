# Função para ler os dados dos candidatos
def ler_dados():
    candidatos = []
    for _ in range(1578):
        idade = int(input("Digite a idade do candidato: "))
        sexo = input("Digite o sexo do candidato (M/F): ").upper()
        experiencia = input("O candidato tem experiência no serviço? (S/N): ").upper()
        candidatos.append((idade, sexo, experiencia))
    return candidatos

# Função para calcular as estatísticas
def calcular_estatisticas(candidatos):
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
    
    return {
        "num_mulheres": num_mulheres,
        "num_homens": num_homens,
        "idade_media_homens_com_experiencia": idade_media_homens_com_experiencia,
        "percent_homens_acima_45": percent_homens_acima_45,
        "num_mulheres_abaixo_21_com_experiencia": num_mulheres_abaixo_21_com_experiencia,
        "menor_idade_mulher_com_experiencia": menor_idade_mulher_com_experiencia
    }

# Função principal
def main():
    candidatos = ler_dados()
    estatisticas = calcular_estatisticas(candidatos)
    
    print("Número de candidatos do sexo feminino:", estatisticas["num_mulheres"])
    print("Número de candidatos do sexo masculino:", estatisticas["num_homens"])
    print("Idade média dos homens com experiência no serviço:", estatisticas["idade_media_homens_com_experiencia"])
    print("Percentagem dos homens com mais de 45 anos entre o total dos homens:", estatisticas["percent_homens_acima_45"], "%")
    print("Número de mulheres com idade inferior a 21 anos e com experiência no serviço:", estatisticas["num_mulheres_abaixo_21_com_experiencia"])
    if estatisticas["menor_idade_mulher_com_experiencia"] is not None:
        print("Menor idade entre as mulheres que já têm experiência no serviço:", estatisticas["menor_idade_mulher_com_experiencia"])
    else:
        print("Não há mulheres com experiência no serviço.")

# Executar o programa
if __name__ == "__main__":
    main()
