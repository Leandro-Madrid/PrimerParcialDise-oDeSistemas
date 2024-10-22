package ar.edu.davinci;

public class AtaqueDefensivo implements Modo {
    public void activar(Nave nave) {
        nave.setEscudo(nave.getEscudo() + 10);
        nave.setDanioOfensivo((int) (nave.getDanioOfensivo() * 1.10));
    }
}
