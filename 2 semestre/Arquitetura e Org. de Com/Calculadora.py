
hex = input('Digite um numero:').upper()
Lista = []
for i in hex:
    mapa_hex = {
            "0": "0000",
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