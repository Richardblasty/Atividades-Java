import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numeroDouble = scanner.nextDouble();
        
        int numeroInt = (int) numeroDouble;
        
        System.out.println(numeroDouble);
        System.out.println(numeroInt);
        
        scanner.close();
    }
}