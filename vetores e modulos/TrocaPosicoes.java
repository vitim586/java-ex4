import java.util.Arrays;
public class TrocaPosicoes {
    public static void main(String[] args) {
        int[] array = {4, 7, 2, 1};
        TrocaPosicoes(array, 0, 1);
        TrocaPosicoes(array, 2, 3);

        System.out.println("Array após trocs: " + Arrays.toString(array));
    }

    public static void TrocaPosicoes(int[] array, int pos1, int pos2) {
        int temp = array[pos2];
        array[pos2] = array[pos1];
        array[pos1] = temp;
    }
}
