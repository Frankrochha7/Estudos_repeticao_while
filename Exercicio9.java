import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double totalGeral = 0;
        int continuar = 1;

        while (continuar == 1) {
            System.out.println("Digite o codigo do produto:");
            int codigo = entrada.nextInt();
            System.out.println("Digite a quantidade:");
            int quantidade = entrada.nextInt();

            String produto;
            double preco;

            switch (codigo) {
                case 100: produto = "Cachorro Quente"; preco = 1.20; break;
                case 101: produto = "Bauru Simples"; preco = 1.30; break;
                case 102: produto = "Bauru com ovo"; preco = 1.50; break;
                case 103: produto = "Hamburguer"; preco = 1.20; break;
                case 104: produto = "Cheeseburguer"; preco = 1.30; break;
                case 105: produto = "Refrigerante"; preco = 1.00; break;
                default:
                    produto = "Produto invalido";
                    preco = 0.0;
            }

            double subtotal = preco * quantidade;
            totalGeral += subtotal;

            System.out.println("Produto: " + produto);
            System.out.printf("Valor deste produto: R$ %.2f%n", subtotal);

            System.out.println("Deseja continuar comprando? (1-Sim / 0-Nao):");
            continuar = entrada.nextInt();
        }

        System.out.printf("Valor total da compra: R$ %.2f%n", totalGeral);
        entrada.close();
    }
}