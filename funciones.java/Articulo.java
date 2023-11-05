
/**
 * Articdulos de la factura
 * 
 * @author Romero Alejo
 * @version 1.0
 */
public class Articulo
{
    private String nombre;
    private double precio_unit;
    public Articulo(String nombre, double precio_unit){
        this.nombre=nombre;
        this.precio_unit=precio_unit;
    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombreNuevo){
        this.nombre=nombreNuevo;
    }
    public double getPrecio_unit(){
        return precio_unit;
    }
    public void setPrecio_unit(double nuevoPrecio){
        this.precio_unit=nuevoPrecio;
    }
    
}
