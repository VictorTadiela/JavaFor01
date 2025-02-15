import java.util.Random;

public class JavaDoWhileAtv_19 {
    public static void main(String[] args) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder senha = new StringBuilder();
        int i = 0;

        do {
            int indice = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
            i++;
        } while (i < 6);

        System.out.println("Senha gerada: " + senha.toString());
    }
}
