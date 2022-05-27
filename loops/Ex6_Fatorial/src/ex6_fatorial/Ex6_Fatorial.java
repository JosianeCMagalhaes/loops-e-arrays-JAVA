package ex6_fatorial;

import java.util.Scanner;

/**
 *
 * @author JOSIANEMAGALHAES
 */

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();
        
        int multiplicacao = 1;
        
        /* while, for e do while: 
        for qdo precisa utilizar o contador,
        qdo precisar utilizar laços infinitos (while "true") utilize o while,
        do while (poucas vezes se utiliza) é qdo precisa independente de qualquer coisa executar 
        pelo menos 1x o programa antes de conferir se é true ou false
        */
        
        System.out.println(fatorial +"! = ");
        for(int i = fatorial ; i >= 1 ; i --){
            multiplicacao = multiplicacao * i;
        }
        
        System.out.println(multiplicacao);
    }
    
}
