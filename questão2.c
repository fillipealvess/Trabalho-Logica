#include <stdio.h>
#include <stdlib.h>

int main(){
    int nota1 = 0;
    int nota2 = 0;
    float media = 0;
    int notaEx = 0;
    float media2 = 0;

    printf("Digite a primeira nota: ");
    scanf("%d", &nota1);

    printf("Digite a segunda nota: ");
    scanf("%d", &nota2);

    media = (nota1 + nota2)/2;

    if(media>=70){
        printf("Aprovado!");
    }
    else if(media>=40 && media<=69){
        printf("Digite a nota do exame: ");
        scanf("%d", &notaEx);

        media2 = (media + notaEx)/2;

        if(media2>=100){
            printf("Aprovado!")
        }else{
            printf("Reprovado!")
        }
        
    }
    else{
        printf("Reprovado!")
    }

}