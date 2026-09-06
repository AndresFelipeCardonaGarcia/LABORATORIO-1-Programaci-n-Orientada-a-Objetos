import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner =
                new Scanner(System.in);

        Biblioteca biblioteca =
                new Biblioteca(scanner);

        // Cuenta únicamente los materiales
        // registrados por el usuario durante
        // la ejecución.
        int materialesCreados = 0;

        int opcion;

        do {

            mostrarMenu();

            System.out.print(
                    "Seleccione una opción: "
            );

            String entrada =
                    scanner.nextLine();

            try {

                opcion =
                        Integer.parseInt(entrada);

            } catch (NumberFormatException e) {

                System.out.println(
                        "Opción inválida."
                );

                opcion = -1;
            }

            switch (opcion) {

                case 1:

                    materialesCreados +=
                            mostrarSubMenuRegistro(
                                    scanner,
                                    biblioteca
                            );

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

                    biblioteca.eliminarMaterial();

                    break;

                case 7:

                    biblioteca.editarMaterial();

                    break;

                case 8:

                    mostrarEstadisticas(
                            materialesCreados
                    );

                    break;

                case 0:

                    System.out.println(
                            "\nPrograma finalizado."
                    );

                    break;

                default:

                    System.out.println(
                            "\nOpción inválida."
                    );
            }

        } while (opcion != 0);

        scanner.close();
    }

    // ==========================================
    // MENÚ PRINCIPAL
    // ==========================================

    private static void mostrarMenu() {

        System.out.println(
                "\n======================================"
        );

        System.out.println(
                "           SISTEMA BIBLIOTECA"
        );

        System.out.println(
                "======================================"
        );

        System.out.println(
                "1. Registrar material"
        );

        System.out.println(
                "2. Mostrar materiales"
        );

        System.out.println(
                "3. Prestar material"
        );

        System.out.println(
                "4. Devolver material"
        );

        System.out.println(
                "5. Descargar libro digital"
        );

        System.out.println(
                "6. Eliminar material"
        );

        System.out.println(
                "7. Editar material"
        );

        System.out.println(
                "8. Mostrar estadísticas"
        );

        System.out.println(
                "0. Salir"
        );

        System.out.println(
                "======================================"
        );
    }

    // ==========================================
    // SUBMENÚ DE REGISTRO
    // ==========================================

    private static int mostrarSubMenuRegistro(
            Scanner scanner,
            Biblioteca biblioteca) {

        int opcion;

        int registrados = 0;

        do {

            System.out.println(
                    "\n======================================"
            );

            System.out.println(
                    "          REGISTRAR MATERIAL"
            );

            System.out.println(
                    "======================================"
            );

            System.out.println(
                    "1. Registrar libro"
            );

            System.out.println(
                    "2. Registrar revista"
            );

            System.out.println(
                    "3. Registrar libro digital"
            );

            System.out.println(
                    "0. Volver"
            );

            System.out.println(
                    "======================================"
            );

            System.out.print(
                    "Seleccione una opción: "
            );

            String entrada =
                    scanner.nextLine();

            try {

                opcion =
                        Integer.parseInt(entrada);

            } catch (NumberFormatException e) {

                System.out.println(
                        "Opción inválida."
                );

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

                    System.out.println(
                            "Regresando al menú principal."
                    );

                    break;

                default:

                    System.out.println(
                            "Opción inválida."
                    );
            }

        } while (opcion != 0);

        return registrados;
    }

    // ==========================================
    // ESTADÍSTICAS
    // ==========================================

    private static void mostrarEstadisticas(
            int materialesCreados) {

        System.out.println(
                "\n======================================"
        );

        System.out.println(
                "             ESTADÍSTICAS"
        );

        System.out.println(
                "======================================"
        );

        System.out.println(
                "Total de materiales: "
                + Material.getCantidadMateriales()
        );

        System.out.println(
                "Materiales registrados durante "
                + "la ejecución: "
                + materialesCreados
        );

        System.out.println(
                "======================================"
        );
    }
}
