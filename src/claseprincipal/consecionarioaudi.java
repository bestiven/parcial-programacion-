/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseprincipal;


public class consecionarioaudi extends Concesionario {
    

    private int PrecioAut;
    private String ModeloAutos;

    public consecionarioaudi (int PrecioAut, String ModeloAutos) {
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
    
}
