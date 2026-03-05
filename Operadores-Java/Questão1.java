import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        
        boolean maior = numero1 > numero2;
        boolean menor = numero1 < numero2;
        boolean igual = numero1 == numero2;
        boolean diferente = numero1 != numero2;
        boolean maiorOuIgual = numero1 >= numero2;
        boolean menorOuIgual = numero1 <= numero2;
        
        System.out.println(maior);
        System.out.println(menor);
        System.out.println(igual);
        System.out.println(diferente);
        System.out.println(maiorOuIgual);
        System.out.println(menorOuIgual);
        
        scanner.close();
    }
}