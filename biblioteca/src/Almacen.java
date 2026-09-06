import java.util.ArrayList;

public class Almacen {

    private ArrayList<Material> materiales;
    private int ultimoId;

    public Almacen() {
        materiales = new ArrayList<>();
        ultimoId = 0;
    }

    public int generarId() {
        ultimoId++;
        return ultimoId;
    }

    public void guardarLibro(Libro libro) {
        materiales.add(libro);
    }

    public void guardarRevista(Revista revista) {
        materiales.add(revista);
    }

    public void guardarLibroDigital(LibroDigital libroDigital) {
        materiales.add(libroDigital);
    }

    public Material buscarMaterial(int id) {

        for (Material material : materiales) {

            if (material.getId() == id) {
                return material;
            }
        }

        return null;
    }

    public void mostrarInfo() {

        if (materiales.isEmpty()) {
            System.out.println("No hay materiales registrados.");
            return;
        }

        System.out.println("\n========== MATERIALES ==========");

        for (Material material : materiales) {
            material.mostrarInfo();
        }

        System.out.println("----------------------------------");
        System.out.println("Total de materiales: "
                + Material.getCantidadMateriales());
    }

    public void mostrarDisponiblesParaPrestar() {

        boolean hayDisponibles = false;

        System.out.println("\n===== MATERIALES DISPONIBLES PARA PRESTAR =====");

        for (Material material : materiales) {

            if (material instanceof Prestable && material.isDisponible()) {
                material.mostrarInfo();
                hayDisponibles = true;
            }
        }

        if (!hayDisponibles) {
            System.out.println("No hay materiales disponibles para prestar.");
        }
    }

    public void mostrarPrestados() {

        boolean hayPrestados = false;

        System.out.println("\n===== MATERIALES PRESTADOS =====");

        for (Material material : materiales) {

            if (material instanceof Prestable && !material.isDisponible()) {
                material.mostrarInfo();
                hayPrestados = true;
            }
        }

        if (!hayPrestados) {
            System.out.println("No hay materiales prestados.");
        }
    }

    public void mostrarDescargables() {

        boolean hayDigitales = false;

        System.out.println("\n===== LIBROS DIGITALES DISPONIBLES =====");

        for (Material material : materiales) {

            if (material instanceof Descargable) {
                material.mostrarInfo();
                hayDigitales = true;
            }
        }

        if (!hayDigitales) {
            System.out.println("No hay libros digitales.");
        }
    }
}