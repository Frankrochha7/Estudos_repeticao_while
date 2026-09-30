/*Faça um algoritmo que leia 10 números inteiros e diga:
quantos são pares;
e quantos são ímpares.*/


import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador = 1; 
        int par = 0;
        int impar = 0;
        
        while (contador <= 10) {
            System.out.println("Digite o " +contador+ " número inteiro:");
            int numero = scanner.nextInt(); 

            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            contador++;
        }

        System.out.println("Quantidade de números par: " + par);
        System.out.println("Quantidade de números ímpar: " + impar);

        scanner.close();
    }
}