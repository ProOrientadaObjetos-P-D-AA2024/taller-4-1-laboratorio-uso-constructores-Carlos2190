package problema4;
public class Banco {
    
    private Cliente c ;    
    private String nombreBanco;
    private int numeroSucursales;

    public Banco(Cliente c, String nombreBanco, int numeroSucursales) {
        this.c = c;
        this.nombreBanco = nombreBanco;
        this.numeroSucursales = numeroSucursales;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public int getNumeroSucursales() {
        return numeroSucursales;
    }

    public void setNumeroSucursales(int numeroSucursales) {
        this.numeroSucursales = numeroSucursales;
    }
    
    
    
    
}
