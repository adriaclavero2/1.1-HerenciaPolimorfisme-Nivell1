public class Cotxe {
    private static final String marca = "Honda";// Compartit per a tots els cotxes, no es pot canviar mai.
    private static String model;// És compartit per tots els cotxes. Es pot canviar, però si el canvies en un cotxe, canvia per tots.
    private final int potencia;// Cada cotxe té la seva pròpia potència. No es pot modificar un cop assignada.


    public Cotxe(String model, int potencia) {
        Cotxe.model = model;// Assigna el model a tots els cotxes (perquè és STATIC).
        this.potencia = potencia; //Assigna la potència només al cotxe actual (perquè és FINAL).
    }

    //VOID: S'utilitza si el mètode fa una acció (com imprimir, guardar, modificar).
    //És un mètode estàtic.
    //• Vol dir que pertany a la classe, no a cap cotxe concret.
    //• Pots cridar-lo sense crear cap cotxe.
    public static void frenar(){
        System.out.println("El coche está frenando");
    }

    // VOID: S'utilitza si el mètode fa una acció (com imprimir, guardar, modificar).
    //No és estàtic, és un mètode normal.
    //•Vol dir que necessites crear un cotxe per poder fer-lo servir.
    //•Cada cotxe pot accelerar de forma independent.
    public void acelerar(){
        System.out.println("El coche está acelerando");
    }
}
