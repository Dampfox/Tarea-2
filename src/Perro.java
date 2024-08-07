class Perro extends animales implements Alimentable {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }


    public void hacerSonido() {
        System.out.println("El perro ladra");
    }


    public void comer() {
        System.out.println("El animal está comiendo");
    }


    public void beber() {
        System.out.println("El animal está bebiendo");
    }

    public void hacerTruco() {
        System.out.println("El perro está haciendo un truco");
    }

    public void hacerTruco(String nombreTruco) {
        System.out.println("El perro está haciendo el truco: " + nombreTruco);
    }
}