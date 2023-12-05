nomes = []
idades = []

for i in range(3):
    nome = input(f"Digite o nome da {i+1}ª pessoa: ")
    nomes.append(nome)

    idade = int(input(f"Digite a idade da {i+1}ª pessoa: "))
    idades.append(idade)

maiorIdade = idades[0]
maisVelho = nomes[0]

for i in range(3):
    if(idades[i] > maiorIdade):
        maiorIdade = idades[i]
        maisVelho = nomes[i]

print(f'O mais velho  é {maisVelho} com {maiorIdade} anos')