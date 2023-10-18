import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static List<Integer> removeRepetidos(List<Integer> lista) {
        // Usando um HashSet para armazenar os elementos únicos e manter a ordem
        Set<Integer> set = new HashSet<>(lista);

        // Criando uma nova lista sem elementos repetidos
        List<Integer> listaSemRepeticao = new ArrayList<>(set);

        return listaSemRepeticao;
    }

    public static void main(String[] args) {
        // Lista original
        List<Integer> listaOriginal = new ArrayList<>();
        listaOriginal.add(1);
        listaOriginal.add(2);
        listaOriginal.add(3);
        listaOriginal.add(2);
        listaOriginal.add(1);
        listaOriginal.add(4);
        listaOriginal.add(5);
        listaOriginal.add(3);

        // Chamando a função para remover os elementos repetidos
        List<Integer> listaSemRepeticao = removeRepetidos(listaOriginal);

        // Exibindo os resultados
        System.out.println("Lista original: " + listaOriginal);
        System.out.println("Lista sem elementos repetidos: " + listaSemRepeticao);
    }
}
