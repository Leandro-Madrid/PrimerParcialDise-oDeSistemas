package ar.edu.davinci;

public class NaveEnemiga extends Nave {
    private int danioRecibido = 0;

    @Override
    public int calcularDanio() {
        return 20;
    }

    @Override
    public void atacar(Nave objetivo) {

    }

    @Override
    public void recibirDanio(int danio) {
        danioRecibido += danio;
        System.out.println("Nave enemiga ha recibido " + danio + " de daño.");
    }

    @Override
    public int getDanioDefensivo() {
        return 0; // Sin defensa
    }

    @Override
    public void viajar(double distancia) {

    }

    @Override
    public void agregarModo(Modo modo) {

    }
}
