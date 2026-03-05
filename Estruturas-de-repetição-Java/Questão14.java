import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int senhaCorreta = 1234;
        int senhaDigitada;
        
        do {
            senhaDigitada = scanner.nextInt();
        } while (senhaDigitada != senhaCorreta);
        
        scanner.close();
    }
}