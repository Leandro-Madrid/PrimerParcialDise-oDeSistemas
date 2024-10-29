package ar.edu.davinci;

import ar.edu.davinci.builders.ConstructorNaves;
import ar.edu.davinci.models.NaveEmbajadora;
import ar.edu.davinci.models.NaveNodriza;
import ar.edu.davinci.models.NaveAtaque;
import ar.edu.davinci.models.NaveMixta;

public class Main {
    public static void main(String[] args) {
        // Crear una Nave Nodriza
        NaveNodriza nodriza = new NaveNodriza(5, 150, 1000.0, 10);
        System.out.println("Nave Nodriza creada con capacidad para " + nodriza.getCantidadTripulantes() + " tripulantes.");

        // Crear y agregar una Nave Embajadora
        NaveEmbajadora embajadora = (NaveEmbajadora) ConstructorNaves.getInstancia().crearNaveEmbajadora().build();
        nodriza.agregarNave(embajadora);
        System.out.println("Nave Embajadora agregada a la Nodriza.");

        // Crear y agregar una Nave de Ataque
        NaveAtaque naveAtaque = (NaveAtaque) ConstructorNaves.getInstancia().crearNaveAtaque(3, 10, 200).build();
        nodriza.agregarNave(naveAtaque);
        System.out.println("Nave de Ataque agregada a la Nodriza.");

        // Crear y agregar una Nave Mixta
        NaveMixta naveMixta = (NaveMixta) ConstructorNaves.getInstancia().crearNaveMixta(4, 2, 5, 150).build();
        nodriza.agregarNave(naveMixta);
        System.out.println("Nave Mixta agregada a la Nodriza.");

        // Calcular y mostrar el daño total
        double danioTotal = nodriza.calcularDanioTotal();
        System.out.println("Daño total de la nodriza: " + danioTotal);
        System.out.println("Combustible restante en nodriza: " + nodriza.getNivelCombustible());

        // Viajar
        nodriza.viajar(50);
        System.out.println("La nodriza ha viajado 50 unidades.");

        // Mostrar el nivel de combustible restante
        System.out.println("Combustible restante en nodriza tras el viaje: " + nodriza.getNivelCombustible());

        // Probar otra operación, como agregar más naves
        NaveEmbajadora nuevaEmbajadora = (NaveEmbajadora) ConstructorNaves.getInstancia().crearNaveEmbajadora().build();
        nodriza.agregarNave(nuevaEmbajadora);
        System.out.println("Nueva Nave Embajadora agregada a la Nodriza.");

        // Mostrar el daño total y combustible nuevamente
        System.out.println("Nuevo daño total de la nodriza: " + nodriza.calcularDanioTotal());
        System.out.println("Combustible restante en nodriza: " + nodriza.getNivelCombustible());
    }
}