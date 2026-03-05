import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int maior = Integer.MIN_VALUE;
        boolean primeiro = true;
        
        do {
            numero = scanner.nextInt();
            
            if (numero != -1) {
                if (primeiro) {
                    maior = numero;
                    primeiro = false;
                } else if (numero > maior) {
                    maior = numero;
                }
            }
        } while (numero != -1);
        
        if (!primeiro) {
            System.out.println(maior);
        }
        
        scanner.close();
    }
}