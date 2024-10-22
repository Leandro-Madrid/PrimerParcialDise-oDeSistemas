package ar.edu.davinci;

public class AtaquePoderoso implements Modo {
    public void activar(Nave nave) {
        nave.setDanioOfensivo(nave.getDanioOfensivo() * 2);
    }
}
