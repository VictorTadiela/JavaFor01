import java.util.Scanner;

public class JavaDoWhileAtv_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero;

        System.out.println("Digite números inteiros. O programa contará quantos números foram digitados antes do zero.");

        do {
            System.out.print("Digite um número (ou 0 para parar): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                contador++;
            }
        } while (numero != 0);

        System.out.println("Quantidade de números digitados antes do zero: " + contador);
        scanner.close();
    }
}
