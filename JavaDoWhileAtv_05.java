import java.util.Scanner;

public class JavaDoWhileAtv_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2=1;

        do {
            System.out.println(n1+(n1*n2));
            n1++;
        }while(n1<=10);
    }
}

