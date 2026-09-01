import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Biblioteca biblioteca = new Biblioteca();

        int opcion;

        do {

            System.out.println("\nBIBLIOTECA ");
            System.out.println("1. Registrar libro");
            System.out.println("2. Registrar revista");
            System.out.println("3. Registrar libro digital");
            System.out.println("4. Mostrar materiales");
            System.out.println("5. Prestar material");
            System.out.println("6. Devolver material");
            System.out.println("7. Descargar material digital");
            System.out.println("8. Mostrar estadisticas");
            System.out.println("0. Salir");


            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    biblioteca.registrarLibro();
                    break;

                case 2:
                    biblioteca.registrarRevista();
                    break;

                case 3:
                    biblioteca.registrarDigital();
                    break;

                case 4:
                    biblioteca.mostrarCreados();
                    break;

                case 5:
                    System.out.println("Prestar material: en construccion.");
                    break;

                case 6:
                    System.out.println("Devolver material: en construccion.");
                    break;

                case 7:
                    System.out.println("Descargar material digital: en construccion.");
                    break;

                case 8:
                    System.out.println("Mostrar estadisticas: en construccion.");
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}