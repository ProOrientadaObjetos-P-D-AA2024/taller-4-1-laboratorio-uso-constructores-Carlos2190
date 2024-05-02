package problema4;
public class Cliente {
    
    
    private String nombres;
    private String apellidos;
    private String cedula;
    private double valorCheque;
    private double comisionBanco;

    public Cliente(String nombres, String apellidos, String cedula, double valorCheque) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.valorCheque = valorCheque;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public void setValorCheque(double valorCheque) {
        this.valorCheque = valorCheque;
    }
    
      public double calcularSueldoC() {
        
        return valorCheque* 0.003;
        
    }

  
}
