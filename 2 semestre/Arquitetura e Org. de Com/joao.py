dec = input('Digite um numero:').upper()
lista = []
for i in dec:
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
    "F": 15
    }
    if i in mapa_dec:
        lista.insert(0,mapa_dec[i])

x = 0
soma = 0
for i in lista:
    soma = soma + (i*(16**x))
    x += 1

    
    

print(f'Numero em Decimal: {soma}')