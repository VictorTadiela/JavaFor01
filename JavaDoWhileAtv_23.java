public class JavaDoWhileAtv_23 {
    public static void main(String[] args) {
        int n = 1;
        int termo = 1;

        System.out.println("Sequência de números triangulares até o décimo termo:");

        do {
            System.out.println(termo);
            n++;
            termo = n * (n + 1) / 2;
        } while (n <= 10);
    }
}
