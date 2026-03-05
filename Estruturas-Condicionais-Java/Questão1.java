import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = scanner.nextInt();
        
        if (numero > 0) {
            System.out.println("positivo");
        } else if (numero < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("zero");
        }
        
        scanner.close();
    }
}