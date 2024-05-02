package problema3;
public class Vehiculo {
    
    
    private String cedulaPropietario;
    private String marcaVehiculo;
    private int anio;
    private int valorVehiculo;

    public Vehiculo(String cedulaPropietario, String marcaVehiculo, int anio, int valorVehiculo) {
        this.cedulaPropietario = cedulaPropietario;
        this.marcaVehiculo = marcaVehiculo;
        this.anio = anio;
        this.valorVehiculo = valorVehiculo;
    }
    
    

    public String getCedulaPropietario() {
        return cedulaPropietario;
    }

    public void setCedulaPropietario(String cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getValorVehiculo() {
        return valorVehiculo;
    }

    public void setValorVehiculo(int valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }
    
     public double calcularM() {
        
        return (valorVehiculo*0.002) *(2024- anio);
        
    }
    
    
}
