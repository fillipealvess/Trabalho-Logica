#include <stdio.h>
#include <stdlib.h>

int main(){
    int velocidademax = 0;
    int velocidademotorista = 0;
    int multa = 0;

    printf("Digite a velocidade máxima permitida: ");
    scanf("%d", &velocidademax);

    printf("Digite a velocidade do motorista: ");
    scanf("%d", &velocidademotorista);

    if(velocidademotorista> velocidademax){
        multa = (velocidademotorista - velocidademax) * 5;
        printf("A multa é de %d reais!", multa);
    }
    else{
        printf("Não há multa!")
    }
}