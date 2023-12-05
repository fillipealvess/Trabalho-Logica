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
public class Questão1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Digite a velocidade máxima permitida: ");
        int velocidadeMaxima = entrada.nextInt();
        
        System.out.println("Digite a velocidade do motorista");
        int velocidadeMotorista = entrada.nextInt();
        
        if(velocidadeMotorista > velocidadeMaxima){
            int multa = (velocidadeMotorista - velocidadeMaxima) * 5;
            System.out.println("A multa será de R$" + multa);
        }
        else{
            System.out.println("Não há multa!");
        }
        
        
    }
}
