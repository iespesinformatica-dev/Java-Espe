import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) throws Exception {

        Integer a, b, resultado, resultadoI;

        a = 2;
        b = 20;

        resultado = sumRange(a, b);
        resultadoI = sumRangeI(a, b);

        System.out.println("Resultado: " + resultado.toString());
        System.out.println("Resultado: " + resultadoI.toString());
    }

    public static Integer sumRange(Integer a, Integer b) {
        return IntStream.range(a, b).sum();
    }

    public static Integer sumRangeI(Integer a, Integer b) {

        Integer resultado = 0;

        if (a < b)
            while(a < b){
                resultado += a++;
            }
        return resultado;
    }
}
