import java.util.Scanner;

public class JavaDoWhileAtv_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int contador = 1;

        System.out.println("Os primeiros 10 múltiplos de " + numero + " são:");

        do {
            System.out.println(numero * contador);
            contador++;
        } while (contador <= 10);

        scanner.close();
    }
}
