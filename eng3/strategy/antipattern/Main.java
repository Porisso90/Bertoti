package strategy.antipattern;

public class Main {
    public static void main(String[] args) {
        CalculadoraAntipattern calc = new CalculadoraAntipattern();
        System.out.println("Soma: " + calc.calcular("soma", 5, 3));
        System.out.println("Subtração: " + calc.calcular("subtracao", 5, 3));
    }
}
