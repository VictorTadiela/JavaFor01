import java.util.Locale;
import java.util.Scanner;

public class JavaDoWhileAtv_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1;


        do {
            System.out.print("Digite um número: ");
            n1 = scanner.nextInt();
        } while (n1 >= 0);

        System.out.println("Você digitou um número negativo. Fim do programa.");
        scanner.close();
    }
}
