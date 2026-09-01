import java.util.UUID;

public class libro_digital extends material{
    float tamaño;
    libro_digital(String id, String autor,String nombre, boolean prestable, boolean descargable, float tamaño){
        super(id, autor,nombre,prestable, descargable);
        this.tamaño = tamaño;
    }
    @Override
    void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("el tamaño del archivo es: " + tamaño);
    }
}

