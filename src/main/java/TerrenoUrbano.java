class TerrenoUrbano extends Terreno {
    public TerrenoUrbano(double area, double valorBase) {
        super(area, valorBase);
    }

    @Override
    protected double calcularImpostos() {
        double imposto = area * 0.1;
        return imposto;
    }

    @Override
    protected double calcularValorFinal(double valorImpostos) {
        return valorBase * 2 + valorImpostos;
    }
}