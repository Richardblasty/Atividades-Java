import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char caractere = scanner.next().charAt(0);
        
        int unicode = (int) caractere;
        
        System.out.println(unicode);
        
        scanner.close();
    }
}