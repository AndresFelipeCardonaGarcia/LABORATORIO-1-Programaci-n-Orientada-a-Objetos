import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcion;

        do {
            System.out.println("\n===== BIBLIOTECA UNIVERSITARIA =====");
            System.out.println("1. Registrar material");
            System.out.println("2. Mostrar materiales");
            System.out.println("3. Prestar material");
            System.out.println("4. Devolver material");
            System.out.println("5. Descargar material digital");
            System.out.println("6. Mostrar estadísticas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    mostrarSubMenuRegistro(scanner, biblioteca);
                    break;
                case 2:
                    biblioteca.Mostrar_creados();
                    break;
                case 3:
                    biblioteca.prestarMaterial();
                    break;
                case 4:
                    biblioteca.devolverMaterial();
                    break;
                case 5:
                    biblioteca.descargarMaterial();
                    break;
                case 6:
                    System.out.println("\n=== ESTADÍSTICAS ===");
                    System.out.println("Total de materiales creados: " +
                            Material.getCantidadMateriales());
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static void mostrarSubMenuRegistro(Scanner scanner, Biblioteca biblioteca) {
        int subOpcion;
        boolean volver = false;  // ✅ Variable para controlar la salida

        while (!volver) {  // ✅ Mientras no se quiera volver
            System.out.println("\n===== REGISTRAR MATERIAL =====");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar revista");
            System.out.println("3. Registrar libro digital");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            subOpcion = scanner.nextInt();
            scanner.nextLine();

            switch (subOpcion) {
                case 1:
                    biblioteca.Registrar_libro();
                    System.out.println("\n✔ Libro registrado. Puede registrar otro o volver al menú.");
                    break;
                case 2:
                    biblioteca.Registrar_revista();
                    System.out.println("\n✔ Revista registrada. Puede registrar otra o volver al menú.");
                    break;
                case 3:
                    biblioteca.Registrar_digital();
                    System.out.println("\n✔ Libro digital registrado. Puede registrar otro o volver al menú.");
                    break;
                case 0:
                    volver = true;  // ✅ Salir del submenú
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}