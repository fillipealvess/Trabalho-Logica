nota1 = int(input("Digite a primeira nota: "))
nota2 = int(input("Digite a segunda nota: "))

media = (nota1 + nota2)/2

if(media>=70):
    print("Aprovado!")
elif(media>=40 and media<=69):
    notaEx = int(input("Digite a nota do exame: "))
    media2= (media + notaEx)/2
    if(media2>=100):
        print("Aprovado!")
    else:
        print("Reprovado!")
else:
    print("Reprovado!")

