public class SomaDigitos {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int numero5 = 5;

        int soma = somarNumeros(numero1, numero2, numero3, numero5);

        System.out.println("Soma dos numeros pares: " + soma);
    }

    public static int somarNumeros(int a, int c, int d, int e) {
        return a + c + d + e;
    }
}