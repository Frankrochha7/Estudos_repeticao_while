import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;

        while (contador < 5) {
            contador++;
            System.out.println("Aluno " + contador);

            double nota1;
            do {
                System.out.println("Digite a primeira nota (0 a 10):");
                nota1 = entrada.nextDouble();
            } while (nota1 < 0 || nota1 > 10);

            double nota2;
            do {
                System.out.println("Digite a segunda nota (0 a 10):");
                nota2 = entrada.nextDouble();
            } while (nota2 < 0 || nota2 > 10);

            double media = (nota1 + nota2) / 2;
            System.out.println("Media do aluno " + contador + ": " + media);
        }
        entrada.close();
    }
}
