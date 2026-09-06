public class Libro extends Material implements Prestable {

    // Atributo propio del libro
    private String autor;

    private boolean prestado;

    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public Libro(
            int id,
            String nombre,
            int Publicacion,
            String autor) {

        super(
                id,
                nombre,
                Publicacion
        );

        this.autor = autor;
        this.prestado = false;
    }

    // ==========================================
    // GETTER Y SETTER DEL AUTOR
    // ==========================================

    public String getAutor() {

        return autor;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }

    // ==========================================
    // PRESTAR
    // ==========================================

    @Override
    public void prestar() {

        if (!prestado) {

            prestado = true;
            setDisponible(false);

            System.out.println(
                    "El libro ha sido prestado correctamente."
            );

        } else {

            System.out.println(
                    "El libro ya se encuentra prestado."
            );
        }
    }

    // ==========================================
    // DEVOLVER
    // ==========================================

    @Override
    public void devolver() {

        if (prestado) {

            prestado = false;
            setDisponible(true);

            System.out.println(
                    "El libro ha sido devuelto correctamente."
            );

        } else {

            System.out.println(
                    "El libro no se encuentra prestado."
            );
        }
    }

    // ==========================================
    // MOSTRAR INFORMACIÓN
    // ==========================================

    @Override
    public void mostrarInfo() {

        System.out.println(
                "----------------------------------"
        );

        System.out.println("Tipo: Libro");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getNombre());

        if (autor.isEmpty()) {

            System.out.println("Autor: Pendiente");

        } else {

            System.out.println(
                    "Autor: " + autor
            );
        }

        if (getPublicacion() == 0) {

            System.out.println(
                    "Año de publicación: Pendiente"
            );

        } else {

            System.out.println(
                    "Año de publicación: "
                    + getPublicacion()
            );
        }

        if (isDisponible()) {

            System.out.println("Estado: Disponible");

        } else {

            System.out.println("Estado: Prestado");
        }
    }
}

