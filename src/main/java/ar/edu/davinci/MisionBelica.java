package ar.edu.davinci;

import ar.edu.davinci.models.Nave;
import ar.edu.davinci.models.NaveAtaque;
import ar.edu.davinci.models.NaveMixta;

public class MisionBelica implements Mision {
    private Nave objetivo;

    public MisionBelica(Nave objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public void ejecutarMision(Nave nave) {
        if (nave instanceof NaveAtaque || nave instanceof NaveMixta) {
            nave.atacar(objetivo);
        } else {
            System.out.println(nave.getClass().getSimpleName() + " no puede realizar misiones bélicas.");
        }
    }
}