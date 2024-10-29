package ar.edu.davinci;

public class ModoOfensivo implements Modo {
    private int bonificacion;

    public ModoOfensivo(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public void activar() {
        System.out.println("Modo ofensivo activado.");
    }

    @Override
    public int getBonificacionDanio() {
        return bonificacion;
    }
}