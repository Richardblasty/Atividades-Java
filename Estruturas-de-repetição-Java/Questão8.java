import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int limite = scanner.nextInt();
        int a = 0;
        int b = 1;
        
        while (a <= limite) {
            System.out.println(a);
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        
        scanner.close();
    }
}