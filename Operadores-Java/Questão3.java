import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = scanner.nextInt();
        
        boolean negativoOuMaiorQue100 = numero < 0 || numero > 100;
        
        System.out.println(negativoOuMaiorQue100);
        
        scanner.close();
    }
}