import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroInt = scanner.nextInt();
        double numeroDouble = (double) numeroInt;
        
        int divisaoInt = numeroInt / 2;
        double divisaoDouble = numeroDouble / 2.0;
        
        System.out.println(numeroInt);
        System.out.println(numeroDouble);
        System.out.println(divisaoInt);
        System.out.println(divisaoDouble);
        
        scanner.close();
    }
}
```