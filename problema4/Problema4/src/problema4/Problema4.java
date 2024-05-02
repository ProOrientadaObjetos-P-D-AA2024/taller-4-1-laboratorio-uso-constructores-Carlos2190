package problema4;
public class Problema4 {

    public static void main(String[] args) {
  
    Cliente c = new Cliente("Flavio", "Torres", "1198578324" , 5000);
        
    Banco b = new Banco(c,"Banco de Loja", 5); 
    
    
        System.out.println("Resultados: ");
        System.out.println("En el "+b.getNombreBanco()+" que tiene "+b.getNumeroSucursales()+" sucursales");
        System.out.println("El cliente "+b.getC().getNombres()+" "+b.getC().getApellidos()+" con su numero de cedula de "+b.getC().getCedula()+" deposito "+b.getC().getValorCheque());
        System.out.println("Por este deposito el banco se lleva una de comision "+b.getC().calcularSueldoC()+" dolares");
    
    
        
    }
    
}
