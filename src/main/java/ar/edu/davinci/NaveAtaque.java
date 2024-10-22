package ar.edu.davinci;

public class NaveAtaque extends Nave {
    private int cantidadTripulantes;
    private int cantidadMisiles;

    public NaveAtaque(int danioOfensivo, int cantidadTripulantes, int cantidadMisiles) {
        if (cantidadTripulantes <= 0) throw new IllegalArgumentException("La cantidad de tripulantes no puede ser 0");
        this.danioOfensivo = danioOfensivo;
        this.cantidadTripulantes = cantidadTripulantes;
        this.cantidadMisiles = cantidadMisiles;
    }

    @Override
    public int calcularDanio() {
        return danioOfensivo * cantidadTripulantes;
    }

    @Override
    public void atacar(Nave objetivo) {
        objetivo.recibirDanio(calcularDanio());
    }

    @Override
    public void recibirDanio(int danio) {
        escudo -= Math.max(danio - getDanioDefensivo(), 0);
    }

    @Override
    public void viajar(double distancia) {
        double consumo = distancia * 1.1;
        manejarViaje(consumo);
    }

    @Override
    public void agregarModo(Modo modo) {
        modo.activar(this);
    }

    @Override
    public int getDanioDefensivo() {
        return escudo;
    }
}


