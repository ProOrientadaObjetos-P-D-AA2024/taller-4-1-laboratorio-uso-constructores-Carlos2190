package problema1;
public class Universidad {
    
    private String nombre_universidad;
    private String direccion;

    public Universidad(String nombre_universidad, String direccion) {
        this.nombre_universidad = nombre_universidad;
        this.direccion = direccion;
    }

    public String getNombre_universidad() {
        return nombre_universidad;
    }

    public void setNombre_universidad(String nombre_universidad) {
        this.nombre_universidad = nombre_universidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }   

    
}
