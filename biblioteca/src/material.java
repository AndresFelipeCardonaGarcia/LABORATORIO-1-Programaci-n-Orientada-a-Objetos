public class Material {

    int id;
    String autor;
    String nombre;
    boolean isDisponible;

    // Contador compartido por todos los materiales
    static int cantidadCreados = 0;

    Material(int id, String autor, String nombre) {

        this.id = id;
        this.autor = autor;
        this.nombre = nombre;
        this.isDisponible = true;

        cantidadCreados++;
    }

    static int getCantidadCreados() {

        return cantidadCreados;
    }

    void mostrarInfo() {

        System.out.println("ID: " + id);
        System.out.println("Autor: " + autor);
        System.out.println("Nombre: " + nombre);
        System.out.println("Disponible: " + isDisponible);
    }
}