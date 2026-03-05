import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = scanner.nextInt();
        
        while (numero != 0) {
            numero = scanner.nextInt();
        }
        
        scanner.close();
    }
}