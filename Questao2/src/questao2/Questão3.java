/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Questão3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanho;
        
        System.out.println("Digite a quantidade de pessoas pessoas");
        tamanho = entrada.nextInt();
        
        String []nomes = new String[tamanho];
        int []idades = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++){
            System.out.printf("Digite o nome da %d pessoa ", i+1);
            nomes[i] = entrada.next();
            
            System.out.printf("Digite a idade da %d pessoa ", i+1);
            idades[i] = entrada.nextInt();
            
        }
        
        String maisVelho = nomes[0];
        int maiorIdade = idades[0];
        
        
        for (int i = 0; i < tamanho; i++) {
            if(idades[i]> maiorIdade){
                maiorIdade = idades[i];
                maisVelho = nomes[i];
            }
        }
        
        System.out.println("O mais velho é "+maisVelho+" com "+maiorIdade+" anos");
        
    }
    
    
}
