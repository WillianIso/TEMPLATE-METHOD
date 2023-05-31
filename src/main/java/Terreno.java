abstract class Terreno {
    protected double area;
    protected double valorBase;

    public Terreno(double area, double valorBase) {
        this.area = area;
        this.valorBase = valorBase;
    }

    public double calcularValorVenda() {
        double valorImpostos = calcularImpostos();
        double valorFinal = calcularValorFinal(valorImpostos);
        return valorFinal;
    }

    protected abstract double calcularImpostos();

    protected double calcularValorFinal(double valorImpostos) {
        return valorBase + valorImpostos;
    }
}