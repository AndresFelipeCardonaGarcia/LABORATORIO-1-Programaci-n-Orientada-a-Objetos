import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca(scanner);

        int opcion;

        do {

            System.out.println("\n===== BIBLIOTECA =====");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar revista");
            System.out.println("3. Registrar libro digital");
            System.out.println("4. Mostrar materiales");
            System.out.println("5. Prestar material");
            System.out.println("6. Devolver material");
            System.out.println("7. Descargar material digital");
            System.out.println("8. Mostrar estadisticas");
            System.out.println("0. Salir");

            System.out.print(
                    "Seleccione una opcion: "
            );

            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {

                case 1:

                    biblioteca.Registrar_libro();

                    break;

                case 2:

                    biblioteca.Registrar_revista();

                    break;

                case 3:

                    biblioteca.Registrar_digital();

                    break;

                case 4:

                    biblioteca.Mostrar_creados();

                    break;

                case 5:

                    biblioteca.prestarMaterial();

                    break;

                case 6:

                    biblioteca.devolverMaterial();

                    break;

                case 7:

                    biblioteca.descargarMaterial();

                    break;

                case 8:

                    System.out.println(
                            "\n=== ESTADISTICAS ==="
                    );

                    System.out.println(
                            "Total de materiales creados: " +
                            Material.getCantidadMateriales()
                    );

                    break;

                case 0:

                    System.out.println(
                            "Saliendo del programa..."
                    );

                    break;

                default:

                    System.out.println(
                            "Opcion no valida."
                    );
            }

        } while (opcion != 0);

        scanner.close();
    }
}