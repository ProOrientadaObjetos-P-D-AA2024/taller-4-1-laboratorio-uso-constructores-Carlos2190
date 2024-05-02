package problema3;
public class Problema3 {

    public static void main(String[] args) {
        
        
        Vehiculo v = new Vehiculo ("1104789345", "Chevrolet", 2018, 15000);
        Fabricante f = new Fabricante(v,"General Motors", "Corea");
        
        
        System.out.println("Resultados: ");
        System.out.println("El vehiculo "+f.getV().getMarcaVehiculo()+" hecho por "+f.getNombreFabricante()+" en "+f.getCiudadOrigen()+" en el año "+f.getV().getAnio());
        System.out.println("tiene un costo de "+f.getV().getValorVehiculo()+" el dueño de este vehiculo tiene la siguiente cedula: "+f.getV().getCedulaPropietario());
        System.out.println("El costo de su matricula es de: "+f.getV().calcularM());
    }
    
}
