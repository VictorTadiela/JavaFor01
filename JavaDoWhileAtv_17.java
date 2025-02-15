import java.util.Scanner;

public class JavaDoWhileAtv_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        boolean ehPrimo = true;
        int divisor = 2;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            do {
                if (numero % divisor == 0) {
                    ehPrimo = false;
                    break;
                }
                divisor++;
            } while (divisor <= Math.sqrt(numero));
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}
