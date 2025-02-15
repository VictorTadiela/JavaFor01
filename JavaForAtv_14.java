public class JavaForAtv_14 {
    public static void main(String[] args) {
        int numero = 2;

        System.out.println("Números primos entre 1 e 50:");

        do {
            if (ehPrimo(numero)) {
                System.out.print(numero + " ");
            }
            numero++;
        } while (numero <= 50);
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
