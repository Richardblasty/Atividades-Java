import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double nota = scanner.nextDouble();
        
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperacao");
        } else {
            System.out.println("Reprovado");
        }
        
        scanner.close();
    }
}