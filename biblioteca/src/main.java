import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca(scanner);

        // Contador de materiales registrados por el usuario
        int materialesCreados = 0;

        int opcion;

        do {

            mostrarMenu();

            System.out.print("Seleccione una opción: ");

            String entrada = scanner.nextLine();

            try {

                opcion = Integer.parseInt(entrada);

            } catch (NumberFormatException e) {

                System.out.println("Opción inválida.");
                opcion = -1;
            }

            switch (opcion) {

                case 1:

                    // El submenú devuelve cuántos materiales
                    // registró el usuario.
                    materialesCreados +=
                            mostrarSubMenuRegistro(scanner, biblioteca);

                    break;

                case 2:

                    biblioteca.mostrarCreados();

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

                    mostrarEstadisticas(materialesCreados);

                    break;

                case 0:

                    System.out.println("\nPrograma finalizado.");

                    break;

                default:

                    System.out.println("\nOpción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    // ==========================================
    // MENU PRINCIPAL
    // ==========================================

    private static void mostrarMenu() {

        System.out.println("\n======================================");
        System.out.println("           SISTEMA BIBLIOTECA");
        System.out.println("======================================");
        System.out.println("1. Registrar material");
        System.out.println("2. Mostrar materiales");
        System.out.println("3. Prestar material");
        System.out.println("4. Devolver material");
        System.out.println("5. Descargar libro digital");
        System.out.println("6. Mostrar estadísticas");
        System.out.println("0. Salir");
        System.out.println("======================================");
    }

    // ==========================================
    // SUBMENU DE REGISTRO
    // ==========================================

    private static int mostrarSubMenuRegistro(
            Scanner scanner,
            Biblioteca biblioteca) {

        int opcion;

        // Contador de registros realizados
        // solamente dentro de este submenú.
        int registrados = 0;

        do {

            System.out.println("\n======================================");
            System.out.println("          REGISTRAR MATERIAL");
            System.out.println("======================================");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar revista");
            System.out.println("3. Registrar libro digital");
            System.out.println("0. Volver");
            System.out.println("======================================");

            System.out.print("Seleccione una opción: ");

            String entrada = scanner.nextLine();

            try {

                opcion = Integer.parseInt(entrada);

            } catch (NumberFormatException e) {

                System.out.println("Opción inválida.");
                opcion = -1;
            }

            switch (opcion) {

                case 1:

                    biblioteca.registrarLibro();

                    registrados++;

                    break;

                case 2:

                    biblioteca.registrarRevista();

                    registrados++;

                    break;

                case 3:

                    biblioteca.registrarLibroDigital();

                    registrados++;

                    break;

                case 0:

                    System.out.println("Regresando al menú principal.");

                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        return registrados;
    }

    // ==========================================
    // ESTADISTICAS
    // ==========================================

    private static void mostrarEstadisticas(int materialesCreados) {

        System.out.println("\n======================================");
        System.out.println("             ESTADÍSTICAS");
        System.out.println("======================================");

        // Este valor incluye los 6 materiales iniciales
        // y todos los materiales registrados posteriormente.
        System.out.println(
                "Total de materiales: "
                + Material.getCantidadMateriales()
        );

        // Este valor SOLO incluye los materiales
        // registrados por el usuario durante la ejecución.
        System.out.println(
                "Materiales registrados durante la ejecución: "
                + materialesCreados
        );

        System.out.println("======================================");
    }
}