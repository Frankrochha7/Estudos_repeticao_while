/*O IMC (índice de Massa Corporal) é uma medida do grau de obesidade 	de uma pessoa.
Faça um algoritmo que leia a altura e o peso de 10 pessoas.
	Calcular o IMC de cada pessoa e verificar quantas pessoas estão com o IMC entre 18,5 e 24,9 que é considerado sem obesidade.
 */




import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        int semObesidade = 0;

        while (contador < 10) {
            contador++;
            System.out.println("Pessoa " + contador + " - Digite a altura (m):");
            double altura = entrada.nextDouble();
            System.out.println("Digite o peso (kg):");
            double peso = entrada.nextDouble();

            double imc = peso / (altura * altura);
            System.out.println("IMC: " + imc);

            if (imc >= 18.5 && imc <= 24.9) {
                semObesidade++;
            }
        }

        System.out.println("Pessoas sem obesidade: " + semObesidade);
        entrada.close();
    }
}