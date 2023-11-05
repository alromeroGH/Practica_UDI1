
/**
 * Prueba del proyecto
 * 
 * @author Romero Alejo
 * @version 1.0
 */
public class Prueba
{
    public Prueba(){
        Articulo art1=new Articulo("Manteca",3);
        Articulo art2=new Articulo("Yerba",250);
        Articulo art3=new Articulo("Azúcar",80);
        Detalle det1=new Detalle(art1,3);
        Detalle det2=new Detalle(art2,2);
        Detalle det3=new Detalle(art3,1);
        Factura fact=new Factura(1);
        fact.agregarDetalles(det1);
        fact.agregarDetalles(det2);
        fact.agregarDetalles(det3);
        fact.listaFactura();
    }
}
