package ar.edu.davinci;

public class AtaqueDefensivo implements Modo {
    private int bonificacion;

    public AtaqueDefensivo(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public void activar() {
        System.out.println("Modo defensivo activado.");
    }

    @Override
    public int getBonificacionDanio() {
        return bonificacion;
    }
}
