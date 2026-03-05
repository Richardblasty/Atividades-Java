import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = scanner.nextInt();
        
        boolean positivo = numero > 0;
        
        System.out.println(positivo);
        
        scanner.close();
    }
}