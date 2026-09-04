import java.util.ArrayList;

public class Almacen {

    private ArrayList<Material> materiales;

    private int ultimoID;

    public Almacen() {

        materiales = new ArrayList<>();

        ultimoID = 0;
    }

    public int generarID() {

        ultimoID++;

        return ultimoID;
    }

    public void guardadLibro(Libro libro) {

        materiales.add(libro);
    }

    public void guardarRevista(Revista revista) {

        materiales.add(revista);
    }

    public void guardarLibroDigital(LibroDigital libroDigital) {

        materiales.add(libroDigital);
    }

    public Libro buscarLibro(int ID) {

        for (Material material : materiales) {

            if (material instanceof Libro &&
                    material.getId() == ID) {

                return (Libro) material;
            }
        }

        return null;
    }

    public Revista buscarRevista(int ID) {

        for (Material material : materiales) {

            if (material instanceof Revista &&
                    material.getId() == ID) {

                return (Revista) material;
            }
        }

        return null;
    }

    public LibroDigital buscarLibroDigital(int ID) {

        for (Material material : materiales) {

            if (material instanceof LibroDigital &&
                    material.getId() == ID) {

                return (LibroDigital) material;
            }
        }

        return null;
    }

    public void mostrarInfo() {

        System.out.println("\n========== ALMACEN ==========");

        for (Material material : materiales) {

            System.out.println("----------------------");

            material.mostarInfo();
        }

        System.out.println("==============================");

        System.out.println(
                "TOTAL DE MATERIALES: " +
                Material.getCantidadMateriales()
        );

        System.out.println("==============================");
    }
    public Material buscarMaterial(int ID) {

    for (Material material : materiales) {

        if (material.getId() == ID) {

            return material;
        }
    }

    return null;
}
}