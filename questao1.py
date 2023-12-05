velocidademax = int(input("Digite a velocidade máxima: "))

velocidademotorista = int(input("Digite a velocidade do motorista: "))

if(velocidademotorista>velocidademax):
    multa = (velocidademotorista - velocidademax) * 5
    print(f"A multa é de {multa} reais!")
else:
    print("Não há multa!")
