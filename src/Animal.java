abstract class animales {
    private String nombre;
    private int edad;

    public animales(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract void hacerSonido();

    public void dormir() {
        System.out.println("El animal está durmiendo");
    }
}

interface Alimentable {
    void comer();
    void beber();
}