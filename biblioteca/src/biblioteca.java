import java.util.Scanner;

public class Biblioteca {

    private Material material;
    private Almacen almacen;

    public Biblioteca() {

        almacen = new Almacen();
    }

    public void Registrar_libro() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== REGISTRAR LIBRO ===");

        System.out.print("Nombre del libro: ");

        String nombre = scanner.nextLine();

        System.out.print("Autor: ");

        String autor = scanner.nextLine();

        int ID = almacen.generarID();

        Libro libro = new Libro(
                ID,
                autor,
                nombre
        );

        almacen.guardadLibro(libro);

        System.out.println(
                "Libro registrado correctamente."
        );

        System.out.println(
                "ID asignado: " + ID
        );
    }

    public void Registrar_revista() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== REGISTRAR REVISTA ===");

        System.out.print("Nombre de la revista: ");

        String nombre = scanner.nextLine();

        System.out.print("Autor: ");

        String autor = scanner.nextLine();

        System.out.print("Numero de edicion: ");

        int numeroEdicion = scanner.nextInt();

        scanner.nextLine();

        int ID = almacen.generarID();

        Revista revista = new Revista(
                ID,
                autor,
                nombre,
                numeroEdicion
        );

        almacen.guardarRevista(revista);

        System.out.println(
                "Revista registrada correctamente."
        );

        System.out.println(
                "ID asignado: " + ID
        );
    }

    public void Registrar_digital() {

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "\n=== REGISTRAR LIBRO DIGITAL ==="
        );

        System.out.print(
                "Nombre del libro digital: "
        );

        String nombre = scanner.nextLine();

        System.out.print("Autor: ");

        String autor = scanner.nextLine();

        System.out.print(
                "Tamaño del archivo: "
        );

        float tamanoArchivo = scanner.nextFloat();

        scanner.nextLine();

        int ID = almacen.generarID();

        LibroDigital digital = new LibroDigital(
                ID,
                autor,
                nombre,
                tamanoArchivo
        );

        almacen.guardarLibroDigital(digital);

        System.out.println(
                "Libro digital registrado correctamente."
        );

        System.out.println(
                "ID asignado: " + ID
        );
    }

    public void Mostrar_creados() {

        almacen.mostrarInfo();
    }

    public void prestarMaterial() {

        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Ingrese el ID del material: "
        );

        int ID = scanner.nextInt();

        Material material = almacen.buscarMaterial(ID);

        if (material == null) {

            System.out.println(
                    "Material no encontrado."
            );

            return;
        }

        if (material instanceof prestable) {

            prestable materialPrestable =
                    (prestable) material;

            materialPrestable.prestar();

        } else {

            System.out.println(
                    "Este material no se puede prestar."
            );
        }
    }

    public void devolverMaterial() {

        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Ingrese el ID del material: "
        );

        int ID = scanner.nextInt();

        Material material = almacen.buscarMaterial(ID);

        if (material == null) {

            System.out.println(
                    "Material no encontrado."
            );

            return;
        }

        if (material instanceof prestable) {

            prestable materialPrestable =
                    (prestable) material;

            materialPrestable.devolver();

        } else {

            System.out.println(
                    "Este material no se puede devolver."
            );
        }
    }

    public void descargarMaterial() {

        Scanner scanner = new Scanner(System.in);

        System.out.print(
                "Ingrese el ID del material: "
        );

        int ID = scanner.nextInt();

        Material material = almacen.buscarMaterial(ID);

        if (material == null) {

            System.out.println(
                    "Material no encontrado."
            );

            return;
        }

        if (material instanceof Descargable) {

            Descargable materialDescargable =
                    (Descargable) material;

            materialDescargable.descargar();

        } else {

            System.out.println(
                    "Este material no se puede descargar."
            );
        }
    }
}