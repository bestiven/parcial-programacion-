
package claseprincipal;


public class consecionariomazda extends Concesionario { 

    private int PrecioAut;
    private String ModeloAutos;

    public consecionariomazda(int PrecioAut, String ModeloAutos) {
        this.PrecioAut = PrecioAut;
        this.ModeloAutos = ModeloAutos;
        
    }
 public void mostrarDatos() {
   System.out.println("numero de carros concesionario" + getNumCarros());
   System.out.println("precio" + getPrecioAut());
   System.out.println("marca" + getMarcasaVender());
   System.out.println("ubicacion del carro" + getUbicacionConc());
   System.out.println("modelo" + getModeloAutos());

    }

   
}
