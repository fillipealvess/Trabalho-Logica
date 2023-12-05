#include <stdio.h>
#include <stdlib.h>

#define MAX_LENGTH 100

int main(){
    int quantidadePessoas;
    printf("Digite a quantidade de pessoas que vai ser cadrastadas: ");
    scanf("%d", &quantidadePessoas);

    char nomes[quantidadePessoas][MAX_LENGTH];
    int idades[quantidadePessoas];

    for (int i = 0; i < quantidadePessoas; i++){
        for (int j = 0; j < 1; j++){
            printf("Digite o nome da pessoa %d: ", i+1);
            scanf("%s", &nomes[i][j]);
            printf("Digite a idade de %d: ", i+1);
            scanf("%d", &idades[i]);
    }}

    int maisVelho = idades[0];

    int cont = 0;
    for (int i = 0; i < quantidadePessoas; i++){
        if (maisVelho < idades[i]){
                maisVelho = idades[i];
                cont+=1;
        }
    }


    printf("O mais velho eh o/a %s", nomes[cont]);
    return 0;
}

