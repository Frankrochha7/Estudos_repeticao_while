
import java.util.Scanner;

    public class Validacao{
        public static void main (String [] args){

                Scanner entrada = new Scanner(System.in);

                double nota;

                do {
                    System.out.println("======Digite uma nota entre 0 a 10======");
                    nota = entrada.nextDouble();
                
                

                if (nota <0 || nota > 10 ){
                    System.out.println("Nota incorreta! O valor deve ser entrre 0 e 10");
                }
                    
            } while (nota< 0|| nota >10);

                    System.out.println("Nota correta");

                

                

               entrada.close();


    }
    }
