import java.util.Scanner;

public class JavaDoWhileAtv_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite números inteiros. O programa exibirá apenas os positivos.");
        System.out.println("Para parar, digite um número negativo.");

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();


            if (numero >= 0) {
                System.out.println("Número positivo: " + numero);
            }
        } while (numero >= 0);

        System.out.println("Você digitou um número negativo. Programa encerrado.");
        scanner.close(); // Fecha o scanner
    }
}
