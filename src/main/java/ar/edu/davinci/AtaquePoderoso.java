package ar.edu.davinci;

public class AtaquePoderoso implements Modo {
    private int bonificacion;

    public AtaquePoderoso(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public void activar() {
        System.out.println("Modo de ataque poderoso activado.");
    }

    @Override
    public int getBonificacionDanio() {
        return bonificacion;
    }
}
