import java.util.UUID;

public class revista extends material{
    int edicion;


    revista(String id, String autor,String nombre, boolean prestable, boolean descargable, int edicion){
        super(id, autor,nombre,prestable, descargable);
        this.edicion = edicion;
    }
    @Override
    void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("numero de edicion: " + edicion);
    }


}

