import java.util.Scanner;

public class JavaDoWhileAtv_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        do {
            System.out.print("Digite um número (ou um número negativo para sair): ");
            numero = scanner.nextDouble();

            if (numero >= 0) {
                double raizQuadrada = Math.sqrt(numero);
                System.out.println("A raiz quadrada de " + numero + " é " + raizQuadrada);
            }
        } while (numero >= 0);

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
