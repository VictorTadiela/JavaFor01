public class JavaDoWhileAtv_22 {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 2;

        System.out.println("Os primeiros 10 números primos são:");

        do {
            if (ehPrimo(numero)) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        } while (contador < 10);
    }

    public static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
