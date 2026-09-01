import java.util.Scanner;
import java.util.ArrayList;
import java.util.UUID;

public class material {
    String id;
    String autor;
    String nombre;
    boolean prestable;
    boolean descargable;
    static ArrayList<material> materiales = new ArrayList<>();
    material(String id, String autor, String nombre, boolean prestable, boolean descargable){
        this.id=id;
        this.autor=autor;
        this.nombre=nombre;
        this.prestable=prestable;
        this.descargable=descargable;
    }
    void mostrarInfo(){
        System.out.println("ID: " + id);
        System.out.println("Autor: " + autor);
        System.out.println("nombre del material: " + nombre);
        System.out.println("Prestable: " + prestable);
        System.out.println("Descargable: " + descargable);
    }

    void agregarLibro() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== AGREGAR LIBRO ===");

        String id = UUID.randomUUID().toString();

        System.out.print("Escribe el autor: ");
        String autor = scanner.nextLine();

        System.out.print("Escribe el nombre: ");
        String nombre = scanner.nextLine();

        material libroNuevo = new libro(id, autor, nombre, true, false);

        System.out.println("\nLibro agregado correctamente.\n");
        materiales.add(libroNuevo);
    }
    void agregarRevista() {
        Scanner scanner = new Scanner(System.in);
        String id = UUID.randomUUID().toString();
        System.out.print("Escribe el autor: ");
        String autor = scanner.nextLine();
        System.out.print("Escribe el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Escribe edicion: ");
        int edicion = scanner.nextInt();
        scanner.nextLine();
        material revista = new revista(id, autor, nombre, true, false, edicion);
        System.out.println("\nLibro agregado correctamente.\n");
        materiales.add(revista);
    }void agregarl_Digital() {
        Scanner scanner = new Scanner(System.in);
        String id = UUID.randomUUID().toString();
        System.out.print("Escribe el autor: ");
        String autor = scanner.nextLine();
        System.out.print("Escribe el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Escribe tamaño: ");
        float tamaño = scanner.nextFloat();
        scanner.nextLine();
        material nuevo_digital = new libro_digital(id, autor, nombre, false, true, tamaño);
        System.out.println("\nLibro agregado correctamente.\n");
        materiales.add(nuevo_digital);
    }void mostrarTodosLosMateriales() {
        System.out.println("=== TODOS LOS MATERIALES ===");
        for (material m : materiales) {
            m.mostrarInfo();
            System.out.println("----------------------");
        }
    }void prestar(){
        boolean hayPrestables=false;
        for (material m : materiales) {
            if (m.prestable==true){
                m.mostrarInfo();
                hayPrestables = true;
            }
        }
        if (!hayPrestables) {
            System.out.println("No hay materiales disponibles para prestar.");
        }else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Escribe el ID del material que desae prestar: ");
            String idPrestar = scanner.nextLine();
            for (material m : materiales) {
                if (m.id.equals(idPrestar)){
                    m.prestable=false;
                    System.out.print("el material se presto con exito\n");
                    break;
                }
            }
        }
    }
    void devolver(){
        boolean hayPrestables=false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el ID del material que desae devolver: ");
        String idDevolver = scanner.nextLine();
        for (material m : materiales) {
            if (m.id.equals(idDevolver)){
                m.prestable=true;
                System.out.print("el material se devolvio con exito\n");
                break;
            }
        }

    }
    void descargar(){
        boolean hayDescargables=false;
        for (material m : materiales) {
            if (m.descargable==true){
                m.mostrarInfo();
                hayDescargables = true;
            }
        }
        if (!hayDescargables) {
            System.out.println("No hay materiales disponibles para descargar.");
        }else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Escribe el ID del material que desae descargar: ");
            String idDescargar = scanner.nextLine();
            for (material m : materiales) {
                if (m.id.equals(idDescargar)){
                    System.out.print("descargando................");
                    System.out.print("el material se descargo con exito\n");
                    break;
                }
            }
        }
    }

    void menu_principal(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("que desea agregar: \n" + "1.libro\n" + "2.revista\n" + "3.libro digital\n"+"4.mostrar todos los materiales\n"+"5.prestar\n"+"6.descargar\n"
                    +"7.devolver\n"+"10.salir");
            int w = scanner.nextInt();
            scanner.nextLine();
            if (w==1){
                agregarLibro();

            } else if (w==2) {
                agregarRevista();

            } else if (w==3) {
                agregarl_Digital();
            } else if (w==4) {
                mostrarTodosLosMateriales();
            }else if (w==5) {
                prestar();
            }else if (w==6) {
                descargar();
            }else if (w==7) {
                devolver();
            }
            else if (w==10) {
                break;
            }
        }
    }
}