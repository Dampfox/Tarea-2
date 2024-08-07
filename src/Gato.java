class Gato extends animales implements Alimentable {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }


    public void hacerSonido() {
        System.out.println("El gato maúlla");
    }

    public void comer() {
        System.out.println("El animal está comiendo");
    }

    public void beber() {
        System.out.println("El animal está bebiendo");
    }
}