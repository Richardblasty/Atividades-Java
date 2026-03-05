import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = scanner.nextInt();
        
        boolean parEPositivo = numero % 2 == 0 && numero > 0;
        
        System.out.println(parEPositivo);
        
        scanner.close();
    }
}