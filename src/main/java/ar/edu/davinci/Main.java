package ar.edu.davinci;

public class Main {
    public static void main(String[] args) {
        NaveNodriza nodriza = new NaveNodriza(5, 20);
        NaveAtaque ataque1 = new NaveAtaque(15, 3, 5);
        NaveEmbajadora embajadora = new NaveEmbajadora(2);
        NaveMixta mixta = new NaveMixta(10, 2, 1, 4);

        nodriza.agregarNave(ataque1);
        nodriza.agregarNave(embajadora);
        nodriza.agregarNave(mixta);

        System.out.println("Daño total de la nodriza: " + nodriza.calcularDanioTotal());

        Nave enemigo = new NaveEnemiga();
        nodriza.atacar(enemigo);

        nodriza.viajar(10);
        System.out.println("Combustible restante en nodriza: " + nodriza.getNivelCombustible());
    }
}

