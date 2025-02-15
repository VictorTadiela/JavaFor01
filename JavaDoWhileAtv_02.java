import java.util.Scanner;

public class JavaDoWhileAtv_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,soma =0;



        do {
            System.out.print("Digite um número: ");
            n1 = scanner.nextInt();
            soma+=n1;
        } while (n1 !=0);

        System.out.println("Você digitou um número negativo. Fim do programa.");
        System.out.println("A soma dos números é "+ soma);
        scanner.close();
    }
}
