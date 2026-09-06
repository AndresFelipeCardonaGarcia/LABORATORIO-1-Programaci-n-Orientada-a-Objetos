import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner =
                new Scanner(System.in);

        Biblioteca biblioteca =
                new Biblioteca(scanner);

        /*
         * Cuenta únicamente los materiales que
         * el usuario registra durante esta ejecución.
         *
         * Los materiales iniciales de la biblioteca
         * NO se cuentan aquí.
         */
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
                        "Ingrese una opción válida."
                );

                opcion = -1;
            }

            switch (opcion) {

                // =========================================
                // REGISTRAR MATERIAL
                // =========================================

                case 1:

                    int tipo;

                    do {

                        mostrarMenuRegistro();

                        System.out.print(
                                "Seleccione el tipo de material: "
                        );

                        String entradaTipo =
                                scanner.nextLine();

                        try {

                            tipo =
                                    Integer.parseInt(
                                            entradaTipo
                                    );

                        } catch (NumberFormatException e) {

                            tipo = -1;

                            System.out.println(
                                    "Ingrese una opción válida."
                            );
                        }

                        switch (tipo) {

                            case 1:

                                biblioteca.registrarLibro();

                                materialesCreados++;

                                break;

                            case 2:

                                biblioteca.registrarRevista();

                                materialesCreados++;

                                break;

                            case 3:

                                biblioteca.registrarLibroDigital();

                                materialesCreados++;

                                break;

                            case 0:

                                System.out.println(
                                        "Regresando al menú principal..."
                                );

                                break;

                            default:

                                System.out.println(
                                        "Opción inválida."
                                );
                        }

                    } while (tipo != 0);

                    break;

                // =========================================
                // MOSTRAR MATERIALES
                // =========================================

                case 2:

                    biblioteca.mostrarCreados();

                    break;

                // =========================================
                // PRESTAR
                // =========================================

                case 3:

                    biblioteca.prestarMaterial();

                    break;

                // =========================================
                // DEVOLVER
                // =========================================

                case 4:

                    biblioteca.devolverMaterial();

                    break;

                // =========================================
                // DESCARGAR
                // =========================================

                case 5:

                    biblioteca.descargarMaterial();

                    break;

                // =========================================
                // ELIMINAR
                // =========================================

                case 6:

                    biblioteca.eliminarMaterial();

                    break;

                // =========================================
                // EDITAR
                // =========================================

                case 7:

                    biblioteca.editarMaterial();

                    break;

                // =========================================
                // ESTADÍSTICAS
                // =========================================

                case 8:

                    biblioteca.mostrarEstadisticas(
                            materialesCreados
                    );

                    break;

                // =========================================
                // SALIR
                // =========================================

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

    // =====================================================
    // MENÚ PRINCIPAL
    // =====================================================

    public static void mostrarMenu() {

        System.out.println(
                "\n======================================"
        );

        System.out.println(
                "       SISTEMA DE BIBLIOTECA"
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

    // =====================================================
    // MENÚ DE REGISTRO
    // =====================================================

    public static void mostrarMenuRegistro() {

        System.out.println(
                "\n========= REGISTRAR MATERIAL ========="
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
                "0. Regresar"
        );

        System.out.println(
                "======================================"
        );
    }
}