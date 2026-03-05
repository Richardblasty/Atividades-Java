import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = scanner.nextInt();
        
        String resultado = numero % 2 == 0 ? "par" : "impar";
        
        System.out.println(resultado);
        
        scanner.close();
    }
}