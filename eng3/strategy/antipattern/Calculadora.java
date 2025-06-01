package strategy.antipattern;

public class CalculadoraAntipattern {
    public int calcular(String tipo, int a, int b) {
        if (tipo.equals("soma")) {
            return a + b;
        } else if (tipo.equals("subtracao")) {
            return a - b;
        }
        return 0;
    }
}