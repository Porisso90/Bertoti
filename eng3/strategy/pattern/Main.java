package strategy.pattern;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.setEstrategia(new Soma());
        System.out.println("Soma: " + calc.calcular(5, 3));

        calc.setEstrategia(new Subtracao());
        System.out.println("Subtração: " + calc.calcular(5, 3));
    }
}