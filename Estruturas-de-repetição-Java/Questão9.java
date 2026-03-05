import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            soma += numero;
        }
        
        double media = soma / 5.0;
        
        System.out.println(media);
        
        scanner.close();
    }
}