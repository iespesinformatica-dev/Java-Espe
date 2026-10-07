import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {
        List<Double> numeros = new ArrayList<>();
        numeros.add(3.5);
        numeros.add(2.0);
        numeros.add(10.25);
        numeros.add(4.75);

        Double resultado = sumLista(numeros);
        Double resultadoI = sumListaI(numeros);

        System.out.println("Lista: " + numeros);
        System.out.println("Suma: " + resultado);
        System.out.println("Suma Iterativa: " + resultadoI);
    }

    public static Double sumLista(List<Double> list) {
        return IntStream.range(0, list.size()).mapToDouble(i -> list.get(i)).sum();
    }

    public static Double sumListaI(List<Double> list) {
        double suma = 0.0;
        int i = 0;
        while (i < list.size()) {
            suma += list.get(i);
            i++;
        }
        return suma;
    }
}
