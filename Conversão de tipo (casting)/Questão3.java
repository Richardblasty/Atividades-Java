import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroInt = scanner.nextInt();
        byte numeroByte = (byte) numeroInt;
        
        System.out.println(numeroInt);
        System.out.println(numeroByte);
        
        scanner.close();
    }
}
```