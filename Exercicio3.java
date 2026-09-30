/*Construir um algoritmo que leia um número inteiro e imprime a sequência:
– 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024. . .
– enquanto o valor da sequência for menor ou igual ao número lido.
 */

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = entrada.nextInt();

        int valor = 1;
        while (valor <= numero) {
            System.out.print(valor + " ");
            valor = valor * 2;
        }
        entrada.close();
    }
}