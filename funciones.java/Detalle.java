
/**
 * Detalle de factura
 * 
 * @author Romero Alejo
 * @version 1.0)
 */
public class Detalle
{
    private Articulo articulo;
    private int cantidad;
    public Detalle(Articulo articulo, int cantidad){
        this.articulo=articulo;
        this.cantidad=cantidad;
    }
    
    public Articulo getArticulo(){
        return articulo;
    }
    public void setArticulo(Articulo nuevoArticulo){
        this.articulo=nuevoArticulo;
    }
    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int nuevaCantidad){
        this.cantidad=nuevaCantidad;
    }
     public String toString() {
        return "Artículo: " + articulo.getNombre() + ", Cantidad: " + cantidad;
    }
}
