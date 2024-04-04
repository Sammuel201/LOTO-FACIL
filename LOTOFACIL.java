public class LOTOFACIL
import java.util.Scanner;
import java.util.Random;

public class Lotofacil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int opcao;
        do {
            System.out.println("Menu LOTOFÁCIL:");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número de 0 a 100: ");
                    int numero = scanner.nextInt();
                    if (numero >= 0 && numero <= 100) {
                        int numeroSorteado = random.nextInt(101); // Gera um número aleatório de 0 a 100
                        System.out.println("Número sorteado: " + numeroSorteado);
                        if (numero == numeroSorteado) {
                            System.out.println("Parabéns! Você acertou o número.");
                        } else {
                            System.out.println("Que pena! Você errou o número.");
                        }
                    } else {
                        System.out.println("Aposta inválida.");
                    }
                    break;
                case 2:
                    System.out.println("Ainda não implementado.");
                    break;
                case 3:
                    System.out.println("Ainda não implementado.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
{
}
