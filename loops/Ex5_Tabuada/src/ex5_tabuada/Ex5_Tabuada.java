package ex5_tabuada;

import java.util.Scanner;

/**
 *
 * @author JOSIANEMAGALHAES
 */

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 x 10 = 50
*/
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();
        
        System.out.println("Tabuada de " + tabuada);
        
        //for é um laço while só que comprimido
        for(int i = 1; i <= 10; i++) { /*ou i = i + 1*/
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
    
}
