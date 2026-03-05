import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        
        do {
            numero = scanner.nextInt();
        } while (numero >= 0);
        
        scanner.close();
    }
}