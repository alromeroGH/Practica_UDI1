import java.util.*;
/**
 * Factura de una compra
 * 
 * @author Romero Alejo 
 * @version 1.0
 */
public class Factura
{
    private int numero;
    private double totalCompra=0;
    private ArrayList<Detalle> deta=new ArrayList<Detalle>();
    public Factura(int numero){
        this.numero=numero;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int nuevoNumero){
        this.numero=nuevoNumero;
    }
    public void agregarDetalles(Detalle d){
        deta.add(d);
    }
    public void listaFactura() {
        System.out.println("Factura Nro: " + numero+"               Apellido y Nombre: Romero Alejo");
        System.out.println("");
        System.out.println("Nombre del art.      Cantidad      Precio Unit.       Total");
        for (Detalle detalle : deta) {
            String nombreArticulo=detalle.getArticulo().getNombre();
            double totalArt=detalle.getCantidad() * detalle.getArticulo().getPrecio_unit();
            double precioUnit=detalle.getArticulo().getPrecio_unit();
            totalCompra+=totalArt;
            int cantidad=detalle.getCantidad();
            System.out.println(nombreArticulo+"                "+cantidad+"              "+precioUnit+"             "+totalArt);
      }
        System.out.println("");
        System.out.println("TOTAL:                                                " +totalCompra);
    }
}
