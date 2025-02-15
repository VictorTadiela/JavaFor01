public class JavaForAtv_13 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int contador = 0;

        System.out.println("Os primeiros 10 termos da sequência de Fibonacci são:");

        do {
            System.out.print(n1 + " ");
            int proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
            contador++;
        } while (contador < 10);
    }
}
