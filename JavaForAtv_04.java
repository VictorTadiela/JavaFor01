import java.util.Scanner;

public class JavaForAtv_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 19; i++){
            if (i % 2 == 1) {
                System.out.println("valor de i: " + i);
            }
        }
    }
}