public class SomaDePares {
    public static void main(String[] args) {
        int numero1 = 2;
        int numero2 = 3;
        int numero3 = 6;
        int numero4 = 8;
        int numero5 = 10;
        int numero6 = 11;

        int soma = somarNumeros(numero1, numero3, numero4, numero5);

        System.out.println("Soma dos numeros pares: " + soma);
    }

    public static int somarNumeros(int a, int c, int d, int e) {
        return a + c + d + e;
    }
}
