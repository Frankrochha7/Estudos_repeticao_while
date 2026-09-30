//Faça um algoritmo que imprima a metade de cada número de 10 a 20 

public class Exercicio4 {
    public static void main(String[] args) {
        int numero = 10;
        while (numero <= 20) {
            double metade = numero / 2.0;
            System.out.println("A metade de " + numero + " e " + metade);
            numero++;
        }
    }
}