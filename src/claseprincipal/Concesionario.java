package claseprincipal;

import javax.swing.JOptionPane;

public class Concesionario {

    static void mostrarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // atributos 
    private int NumCarros;
    private int PrecioAut;
    private String MarcasaVender;
    private String UbicacionConc;
    private int ModeloAutos;

    public Concesionario(int NumCarros, int PrecioAut, String MarcasaVender, String UbicacionConc, int ModeloAutos) {
        this.NumCarros = NumCarros;
        this.PrecioAut = PrecioAut;
        this.MarcasaVender = MarcasaVender;
        this.UbicacionConc = UbicacionConc;
        this.ModeloAutos = ModeloAutos;
    }

    public Concesionario() {
    }

    public int getNumCarros() {
        return NumCarros;
    }

    public int getPrecioAut() {
        return PrecioAut;
    }

    public String getMarcasaVender() {
        return MarcasaVender;
    }

    public String getUbicacionConc() {
        return UbicacionConc;
    }

    public int getModeloAutos() {
        return ModeloAutos;
    }

    void CapturarDatos() {
        NumCarros = Integer.parseInt(JOptionPane.showInputDialog("dijita el numero de vehiculos que hay en el concesionario"));
        PrecioAut = Integer.parseInt(JOptionPane.showInputDialog("dijita el precio del vehiculo"));
        MarcasaVender = JOptionPane.showInputDialog("dijita la marca que vas a compar");
        UbicacionConc = JOptionPane.showInputDialog("dijita la ubicacion del concesionario");
        ModeloAutos = Integer.parseInt(JOptionPane.showInputDialog("dijita el modelo que vas a comprar"));

    }

    public void mostrardatos() {

        JOptionPane.showMessageDialog(null, "el numero de vehiculos es " + NumCarros);
        JOptionPane.showMessageDialog(null, "el precio del auto es " + PrecioAut);
        JOptionPane.showMessageDialog(null, "la marca es " + MarcasaVender);
        JOptionPane.showMessageDialog(null, "ubicacion del consecionaro " + UbicacionConc);
        JOptionPane.showMessageDialog(null, " el modelo del vehiculo es  " + ModeloAutos);

    }
}