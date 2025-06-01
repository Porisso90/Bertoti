package strategy.pattern;

public class Calculadora {
    private Operacao estrategia;

    public void setEstrategia(Operacao estrategia) {
        this.estrategia = estrategia;
    }

    public int calcular(int a, int b) {
        return estrategia.executar(a, b);
    }
}