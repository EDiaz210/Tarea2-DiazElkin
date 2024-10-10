public class Persona {
    String nombre;
    int edad;
    String genero;

    //Constructor
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    //Método
    public void presentarse() {
        System.out.println("Hola mi nombre es " + nombre + " y tengo " + edad + "años.");
    }

    //Main
    public static void main(String[] args) {
        Persona p1 = new Persona("Elkin",20,"Masculino");
        Persona p2 = new Persona("Wendy",22,"Femenino");

        p1.presentarse();
        p2.presentarse();
    }
}
