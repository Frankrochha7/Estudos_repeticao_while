/*Faça um algoritmo que leia dez números inteiros positivos e 
– mostre o menor entre eles.
 */

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int menor = 0;

        while (contador < 10) {
            contador++;
            System.out.println("Digite o " + contador + "° numero:");
            int numero = entrada.nextInt();
            if (contador == 1 || numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O menor numero e: " + menor);
        entrada.close();
    }
}