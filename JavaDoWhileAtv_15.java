import java.util.Scanner;

public class JavaDoWhileAtv_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor máximo para a sequência de Fibonacci: ");
        int valorMaximo = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Sequência de Fibonacci até " + valorMaximo + ":");

        while (a <= valorMaximo) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        scanner.close();
    }
}
