public class Material {

    int id;
    String autor;
    String nombre;
    boolean prestable;
    boolean descargable;
    boolean disponible;

    Material(int id, String autor, String nombre,
             boolean prestable, boolean descargable) {

        this.id = id;
        this.autor = autor;
        this.nombre = nombre;
        this.prestable = prestable;
        this.descargable = descargable;
        this.disponible = true;
    }

    void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Autor: " + autor);
        System.out.println("Nombre: " + nombre);
        System.out.println("Prestable: " + prestable);
        System.out.println("Descargable: " + descargable);
        System.out.println("Disponible: " + disponible);
    }
}