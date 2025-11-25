public class Main {
    public static void main(String[] args) { // VOID: S'utilitza si el mètode fa una acció (com imprimir, guardar, modificar).


        Cotxe c1 = new Cotxe("Civic", 120);
        c1.acelerar(); //Depèn de l’objecte. Es crida com c1.accelerar();.

        Cotxe c2 = new Cotxe("Accord", 180);
        c2.acelerar();

        Cotxe.frenar();//	No cal crear cap cotxe per fer-lo servir. És com una acció general que pot fer qualsevol cotxe.

    }
}
