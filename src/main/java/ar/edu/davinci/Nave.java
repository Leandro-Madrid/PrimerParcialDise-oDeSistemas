package ar.edu.davinci;

public abstract class Nave {
    protected double nivelCombustible;
    protected int escudo = 100;
    protected int energia = 100;
    protected int danioOfensivo;

    public abstract void viajar(double distancia);
    public abstract void agregarModo(Modo modo);
    public abstract int calcularDanio();
    public abstract void atacar(Nave objetivo);
    public abstract void recibirDanio(int danio);

    public double getNivelCombustible() {
        return nivelCombustible;
    }

    public void consumirCombustible(double cantidad) {
        nivelCombustible -= cantidad;
    }

    public boolean tieneCombustibleSuficiente(double cantidad) {
        return nivelCombustible >= cantidad;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public int getEscudo() {
        return escudo;
    }

    public int getDanioOfensivo() {
        return danioOfensivo;
    }

    public void setDanioOfensivo(int danio) {
        this.danioOfensivo = danio;
    }

    public abstract int getDanioDefensivo();

    protected void manejarViaje(double consumo) {
        ejecutarAccion(tieneCombustibleSuficiente(consumo), consumo);
    }

    private void ejecutarAccion(boolean tieneCombustible, double consumo) {
        consumirCombustible(tieneCombustible, consumo);
    }

    private void consumirCombustible(boolean tieneCombustible, double consumo) {
        consumirCombustible(tieneCombustible ? consumo : 0);
        System.out.println(tieneCombustible ? "Viaje realizado." : "No hay suficiente combustible para el viaje.");
    }
}
