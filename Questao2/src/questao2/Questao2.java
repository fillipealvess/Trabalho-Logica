/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int nota1 = 0;
        int nota2 =0;
	int media = 0;
	int notaEx = 0;
        int media2 = 0;
        
        System.out.println("Digite a primeira nota: ");
	nota1  = entrada.nextInt();
            
        System.out.println("Digite a segunda nota: ");
	nota2 = entrada.nextInt();
        
        media = (nota1 + nota2)/2;
        
        if(media>=100){
	        System.out.println("Aprovado");
	}
        else if(media>=40 && media<=69){
	        System.out.println("Digite a nota do exame: ");
	        notaEx = entrada.nextInt();
	        media2 = (media+notaEx)/2;
                
	        if(media2>=100){
	            System.out.println("Aprovado");
	        }else{
                    System.out.println("Reprovado");
                }
	} 
        else{
	        System.out.println("Reprovado");
	}
        
    }
    
}
