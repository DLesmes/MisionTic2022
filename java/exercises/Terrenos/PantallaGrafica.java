import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class PantallaGrafica
{
    private ArrayList<Terreno> terrenos;
    private int cantTerrenos;
    private double suma;
    
    /**
     * Preguntar los datos de los terrenos
     */
    public void preguntarDatos()
    {
        cantTerrenos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de terrenos: "));
        
        for(int i = 0; i < cantTerrenos ; i++)
        {
            String forma = JOptionPane.showInputDialog(null, "Ingrese la forma del terreno "+ (i + 1) + " (rectangular, triangular, trapezoidal): ");
            double largo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el largo del terreno " + (i + 1)+":"));
            double ancho = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el ancho del terreno " + (i + 1)+":"));
            String sector = JOptionPane.showInputDialog(null, "Ingrese el sector del terreno "+ (i + 1) + " (Urbano/Rural): ");
            
            if (forma.toLowerCase().trim().equals("rectangular"))
            {
                terrenos.add(new TerrenoRectangular(largo, ancho, sector));
            }
            else if (forma.toLowerCase().trim().equals("triangular"))
            {
                terrenos.add(new TerrenoTriangular(largo, ancho, sector));
            }
            else if (forma.toLowerCase().trim().equals("trapezoidal"))
            {
                double largo2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo largo del terreno " + (i + 1)+":"));
                terrenos.add(new TerrenoTrapezoidal(largo, largo2, ancho, sector));
            }
        }
    }
    
    /**
     * Realizar el cálculo de los precios de los terrenos
     */
    public void calcularPrecio()
    {
        suma = 0;
        for (int i = 0; i <cantTerrenos; i++)
        {
            suma = suma + terrenos.get(i).getPrecio();
        }
    }
    
    /**
     * Presentar la suma de los datos
     */
    public void mostrarSuma()
    {
        DecimalFormat formato = new DecimalFormat("#,###.00");
        for (Terreno t : terrenos)
        {
            JOptionPane.showMessageDialog(null, t.toString());
        }
        JOptionPane.showMessageDialog(null, "El valor total de los terrenos es $ "+formato.format(suma));
    }
}





