import java.util.Scanner;

public class JavaForAtv_06 {
    public static void main(String[] args) {
        int n1 = 0;
        Scanner sc = new Scanner(System.in);
        for(int i =0 ;i >=100 ; i++) {
            if (i % 2 == 0){
        n1 += i;
}
        }
        System.out.println("valor da soma: " + n1);
    }
}
