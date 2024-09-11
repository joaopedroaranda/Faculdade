#  Hexadecimal para binario
def hexa_bina():
    hex = input('Digite um numero:').upper()
    Lista = []
    for i in hex:
        mapa_hex = {
                "0": "0000" ,
                "1": "0001",
                "2": "0010",
                "3": "0011",
                "4": "0100",
                "5": "0101",
                "6": "0110",
                "7": "0111",
                "8": "1000",
                "9": "1001",
                "A": "1010",
                "B": "1011",
                "C": "1100",
                "D": "1101",
                "E": "1100",
                "F": "1111",
                
            }
        if i in mapa_hex:       
            Lista.insert(0, mapa_hex[i])

    hexadecimal = ' '.join([str(item) for item in Lista])
    print(f"Numero convertido para binario:{hexadecimal} ")

# Hexadecimal para decimal
def hexa_decimal():
    hex = input('Digite um numero:').upper()
    lista = []
    x = 0
    soma = 0
    for i in hex:
        mapa_dec = {
        "0": 0,
        "1": 1,
        "2": 2,
        "3": 3,
        "4": 4,
        "5": 5,
        "6": 6,
        "7": 7,
        "8": 8,
        "9": 9,
        "A": 10,
        "B": 11,
        "C": 12,
        "D": 13,
        "E": 14,
        "F": 15,
        }
        if i in mapa_dec:
            lista.insert(0,mapa_dec[i])
            soma = soma + (mapa_dec[i]*(16**x))
            x += 1

    print(f'Numero em Decimal: {soma}')

# Hexadecimal para decimal e binario
def hexa_bina_decimal():
    hex = input('Digite um numero:').upper()
    lista_bina = []
    lista_dec = []
    x = 0
    soma = 0
    for i in hex:
        # mapa_bina = {
        #         "0": "0000",
        #         "1": "0001",
        #         "2": "0010",
        #         "3": "0011",
        #         "4": "0100",
        #         "5": "0101",
        #         "6": "0110",
        #         "7": "0111",
        #         "8": "1000",
        #         "9": "1001",
        #         "A": "1010",
        #         "B": "1011",
        #         "C": "1100",
        #         "D": "1101",
        #         "E": "1100",
        #         "F": "1111",    
        #     }
        
        # mapa_dec = {
        #         "0": 0,
        #         "1": 1,
        #         "2": 2,
        #         "3": 3,
        #         "4": 4,
        #         "5": 5,
        #         "6": 6,
        #         "7": 7,
        #         "8": 8,
        #         "9": 9,
        #         "A": 10,
        #         "B": 11,
        #         "C": 12,
        #         "D": 13,
        #         "E": 14,
        #         "F": 15
        #     }
        mapa_geral = {
        "0": {"binario": "0000", "decimal": 0},
        "1": {"binario": "0001", "decimal": 1},
        "2": {"binario": "0010", "decimal": 2},
        "3": {"binario": "0011", "decimal": 3},
        "4": {"binario": "0100", "decimal": 4},
        "5": {"binario": "0101", "decimal": 5},
        "6": {"binario": "0110", "decimal": 6},
        "7": {"binario": "0111", "decimal": 7},
        "8": {"binario": "1000", "decimal": 8},
        "9": {"binario": "1001", "decimal": 9},
        "A": {"binario": "1010", "decimal": 10},
        "B": {"binario": "1011", "decimal": 11},
        "C": {"binario": "1100", "decimal": 12},
        "D": {"binario": "1101", "decimal": 13},
        "E": {"binario": "1110", "decimal": 14},
        "F": {"binario": "1111", "decimal": 15},
    }
        
        if i in mapa_geral:       
            lista_bina.insert(0, mapa_geral[i]["binario"])

            lista_dec.insert(0,mapa_geral[i]["decimal"])
            soma = soma + (mapa_geral[i]["decimal"]*(16**x))
            x += 1

    hexadecimal = ' '.join([str(item) for item in lista_bina])

        # if i in mapa_dec:

    print(f"Numero convertido para binario: {hexadecimal} e ele em Decima: {soma} ")

def bina_decimal():
    bina = str(input("Digite um numero: "))
    result_decimal = 0
    for i in range(len(bina)):
        digito = bina[-(i+1)]

        if digito == "1":
            result_decimal += 2**i
    print(f"Valor em decimal: {result_decimal}")

bina_decimal()
    
