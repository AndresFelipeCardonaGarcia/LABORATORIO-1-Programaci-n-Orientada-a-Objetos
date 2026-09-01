import java.util.UUID;

public class libro extends material{
    libro(String id, String autor,String nombre, boolean prestable, boolean descargable){
        super(id, autor,nombre,prestable, descargable);
    }
    @Override
    void mostrarInfo(){
        super.mostrarInfo();
    }


}

