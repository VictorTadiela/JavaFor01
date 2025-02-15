public class JavaDoWhileAtv_08 {
    public static void main(String[] args) {
        int numero = 1; // Começamos com o número 1

        System.out.println("Números pares de 1 a 20:");

        do {

            if (numero % 2 == 1) {
                System.out.println(numero);
            }
            numero++;
        } while (numero <= 20);
    }
}
