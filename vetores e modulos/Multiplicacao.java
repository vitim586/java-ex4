import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 5; 
        int b = 3;
       
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
      
        System.out.print("Digite um número: ");
        int numero2 = scanner.nextInt();
        
        int multiplicacao = a * b;
        System.out.println("Resultado da multiplicação: " + multiplicacao);
    }
}
