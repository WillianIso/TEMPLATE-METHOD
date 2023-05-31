class TerrenoRural extends Terreno {
    public TerrenoRural(double area, double valorBase) {
        super(area, valorBase);
    }

    @Override
    protected double calcularImpostos() {
        double imposto = area * 0.05;
        return imposto;
    }
}