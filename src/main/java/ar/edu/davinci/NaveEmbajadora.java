package ar.edu.davinci;

public class NaveEmbajadora extends Nave {
    private int cantidadConsoles;

    public NaveEmbajadora(int cantidadConsoles) {
        this.cantidadConsoles = cantidadConsoles;
    }

    @Override
    public int calcularDanio() {
        return 0;
    }

    @Override
    public void atacar(Nave objetivo) {

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
